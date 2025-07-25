// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.services.async

import com.name_jiandan.api.core.ClientOptions
import com.name_jiandan.api.core.RequestOptions
import com.name_jiandan.api.core.http.HttpResponseFor
import com.name_jiandan.api.models.users.UserCreateParams
import com.name_jiandan.api.models.users.UserListParams
import com.name_jiandan.api.models.users.UserListResponse
import com.name_jiandan.api.models.users.UserResponse
import com.name_jiandan.api.models.users.UserRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /** 创建新用户 */
    fun create(params: UserCreateParams): CompletableFuture<UserResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserResponse>

    /** 获取单个用户 */
    fun retrieve(userId: String): CompletableFuture<UserResponse> =
        retrieve(userId, UserRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserResponse> =
        retrieve(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userId: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
    ): CompletableFuture<UserResponse> = retrieve(userId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserResponse>

    /** @see retrieve */
    fun retrieve(params: UserRetrieveParams): CompletableFuture<UserResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(userId: String, requestOptions: RequestOptions): CompletableFuture<UserResponse> =
        retrieve(userId, UserRetrieveParams.none(), requestOptions)

    /** 返回所有用户的分页列表 */
    fun list(): CompletableFuture<UserListResponse> = list(UserListParams.none())

    /** @see list */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserListResponse>

    /** @see list */
    fun list(params: UserListParams = UserListParams.none()): CompletableFuture<UserListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserListResponse> =
        list(UserListParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /users`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        fun create(params: UserCreateParams): CompletableFuture<HttpResponseFor<UserResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserResponse>>

        /**
         * Returns a raw HTTP response for `get /users/{userId}`, but is otherwise the same as
         * [UserServiceAsync.retrieve].
         */
        fun retrieve(userId: String): CompletableFuture<HttpResponseFor<UserResponse>> =
            retrieve(userId, UserRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserResponse>> =
            retrieve(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            userId: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<UserResponse>> =
            retrieve(userId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserResponse>>

        /** @see retrieve */
        fun retrieve(params: UserRetrieveParams): CompletableFuture<HttpResponseFor<UserResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            userId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UserResponse>> =
            retrieve(userId, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /users`, but is otherwise the same as
         * [UserServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserListResponse>> =
            list(UserListParams.none())

        /** @see list */
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserListResponse>>

        /** @see list */
        fun list(
            params: UserListParams = UserListParams.none()
        ): CompletableFuture<HttpResponseFor<UserListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserListResponse>> =
            list(UserListParams.none(), requestOptions)
    }
}
