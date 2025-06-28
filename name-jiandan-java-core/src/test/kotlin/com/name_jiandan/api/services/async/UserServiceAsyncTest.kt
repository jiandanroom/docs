// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.services.async

import com.name_jiandan.api.TestServerExtension
import com.name_jiandan.api.client.okhttp.NameJiandanOkHttpClientAsync
import com.name_jiandan.api.models.users.UserCreateParams
import com.name_jiandan.api.models.users.UserListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NameJiandanOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.users()

        val userResponseFuture =
            userServiceAsync.create(
                UserCreateParams.builder().email("dev@stainless.com").name("name").age(25L).build()
            )

        val userResponse = userResponseFuture.get()
        userResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NameJiandanOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.users()

        val userResponseFuture = userServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val userResponse = userResponseFuture.get()
        userResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NameJiandanOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userServiceAsync = client.users()

        val usersFuture = userServiceAsync.list(UserListParams.builder().limit(0L).page(0L).build())

        val users = usersFuture.get()
        users.validate()
    }
}
