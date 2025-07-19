// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.services.blocking

import com.name_jiandan.api.TestServerExtension
import com.name_jiandan.api.client.okhttp.NameJiandanOkHttpClient
import com.name_jiandan.api.models.users.UserCreateParams
import com.name_jiandan.api.models.users.UserListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val client =
            NameJiandanOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        val userResponse =
            userService.create(
                UserCreateParams.builder().email("dev@stainless.com").name("name").age(25L).build()
            )

        userResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            NameJiandanOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        val userResponse = userService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        userResponse.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun list() {
        val client =
            NameJiandanOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        val users = userService.list(UserListParams.builder().limit(0L).page(0L).build())

        users.validate()
    }
}
