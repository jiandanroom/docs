// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.name_jiandan.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val userResponse =
            UserResponse.builder()
                .data(
                    User.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .email("user@example.com")
                        .name("张三")
                        .createdAt(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
                        .build()
                )
                .success(true)
                .build()

        assertThat(userResponse.data())
            .contains(
                User.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .email("user@example.com")
                    .name("张三")
                    .createdAt(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
                    .build()
            )
        assertThat(userResponse.success()).contains(true)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userResponse =
            UserResponse.builder()
                .data(
                    User.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .email("user@example.com")
                        .name("张三")
                        .createdAt(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedUserResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userResponse),
                jacksonTypeRef<UserResponse>(),
            )

        assertThat(roundtrippedUserResponse).isEqualTo(userResponse)
    }
}
