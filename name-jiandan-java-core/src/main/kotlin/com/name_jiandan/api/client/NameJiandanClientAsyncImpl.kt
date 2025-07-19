// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.client

import com.name_jiandan.api.core.ClientOptions
import com.name_jiandan.api.core.getPackageVersion
import com.name_jiandan.api.services.async.UserServiceAsync
import com.name_jiandan.api.services.async.UserServiceAsyncImpl
import java.util.function.Consumer

class NameJiandanClientAsyncImpl(private val clientOptions: ClientOptions) :
    NameJiandanClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: NameJiandanClient by lazy { NameJiandanClientImpl(clientOptions) }

    private val withRawResponse: NameJiandanClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): NameJiandanClient = sync

    override fun withRawResponse(): NameJiandanClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NameJiandanClientAsync =
        NameJiandanClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserServiceAsync = users

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NameJiandanClientAsync.WithRawResponse {

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NameJiandanClientAsync.WithRawResponse =
            NameJiandanClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
