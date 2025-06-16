// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.services.async

import com.name_jiandan.api.core.ClientOptions
import com.name_jiandan.api.core.JsonValue
import com.name_jiandan.api.core.RequestOptions
import com.name_jiandan.api.core.checkRequired
import com.name_jiandan.api.core.handlers.errorHandler
import com.name_jiandan.api.core.handlers.jsonHandler
import com.name_jiandan.api.core.handlers.withErrorHandler
import com.name_jiandan.api.core.http.HttpMethod
import com.name_jiandan.api.core.http.HttpRequest
import com.name_jiandan.api.core.http.HttpResponse.Handler
import com.name_jiandan.api.core.http.HttpResponseFor
import com.name_jiandan.api.core.http.json
import com.name_jiandan.api.core.http.parseable
import com.name_jiandan.api.core.prepareAsync
import com.name_jiandan.api.models.users.UserCreateParams
import com.name_jiandan.api.models.users.UserListParams
import com.name_jiandan.api.models.users.UserListResponse
import com.name_jiandan.api.models.users.UserResponse
import com.name_jiandan.api.models.users.UserRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UserServiceAsync {

    private val withRawResponse: UserServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync =
        UserServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserResponse> =
        // post /users
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserResponse> =
        // get /users/{userId}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UserListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserListResponse> =
        // get /users
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserServiceAsync.WithRawResponse =
            UserServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UserResponse> =
            jsonHandler<UserResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<UserResponse> =
            jsonHandler<UserResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<UserListResponse> =
            jsonHandler<UserListResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
