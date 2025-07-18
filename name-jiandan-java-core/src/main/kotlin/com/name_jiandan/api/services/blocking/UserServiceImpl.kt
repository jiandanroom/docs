// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.services.blocking

import com.name_jiandan.api.core.ClientOptions
import com.name_jiandan.api.core.RequestOptions
import com.name_jiandan.api.core.checkRequired
import com.name_jiandan.api.core.handlers.errorBodyHandler
import com.name_jiandan.api.core.handlers.errorHandler
import com.name_jiandan.api.core.handlers.jsonHandler
import com.name_jiandan.api.core.http.HttpMethod
import com.name_jiandan.api.core.http.HttpRequest
import com.name_jiandan.api.core.http.HttpResponse
import com.name_jiandan.api.core.http.HttpResponse.Handler
import com.name_jiandan.api.core.http.HttpResponseFor
import com.name_jiandan.api.core.http.json
import com.name_jiandan.api.core.http.parseable
import com.name_jiandan.api.core.prepare
import com.name_jiandan.api.models.users.UserCreateParams
import com.name_jiandan.api.models.users.UserListParams
import com.name_jiandan.api.models.users.UserListResponse
import com.name_jiandan.api.models.users.UserResponse
import com.name_jiandan.api.models.users.UserRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService =
        UserServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: UserCreateParams, requestOptions: RequestOptions): UserResponse =
        // post /users
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): UserResponse =
        // get /users/{userId}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: UserListParams, requestOptions: RequestOptions): UserListResponse =
        // get /users
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UserService.WithRawResponse =
            UserServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UserResponse> =
            jsonHandler<UserResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<UserResponse> =
            jsonHandler<UserResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("userId", params.userId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<UserListResponse> =
            jsonHandler<UserListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("users")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
