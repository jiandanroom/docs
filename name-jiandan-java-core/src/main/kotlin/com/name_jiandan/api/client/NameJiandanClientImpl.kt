// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.client

import com.name_jiandan.api.core.ClientOptions
import com.name_jiandan.api.core.getPackageVersion
import com.name_jiandan.api.services.blocking.UserService
import com.name_jiandan.api.services.blocking.UserServiceImpl
import java.util.function.Consumer

class NameJiandanClientImpl(private val clientOptions: ClientOptions) : NameJiandanClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: NameJiandanClientAsync by lazy { NameJiandanClientAsyncImpl(clientOptions) }

    private val withRawResponse: NameJiandanClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): NameJiandanClientAsync = async

    override fun withRawResponse(): NameJiandanClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NameJiandanClient =
        NameJiandanClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun users(): UserService = users

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NameJiandanClient.WithRawResponse {

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NameJiandanClient.WithRawResponse =
            NameJiandanClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun users(): UserService.WithRawResponse = users
    }
}
