// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.models.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        UserCreateParams.builder().email("dev@stainless.com").name("name").age(25L).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            UserCreateParams.builder().email("dev@stainless.com").name("name").age(25L).build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.age()).contains(25L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserCreateParams.builder().email("dev@stainless.com").name("name").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("name")
    }
}
