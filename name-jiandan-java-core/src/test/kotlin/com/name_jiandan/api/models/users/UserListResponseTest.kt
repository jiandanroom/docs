// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.name_jiandan.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserListResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val userListResponse =
            UserListResponse.builder()
                .addData(
                    User.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .email("user@example.com")
                        .name("张三")
                        .createdAt(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
                        .build()
                )
                .success(true)
                .total(0L)
                .build()

        assertThat(userListResponse.data().getOrNull())
            .containsExactly(
                User.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .email("user@example.com")
                    .name("张三")
                    .createdAt(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
                    .build()
            )
        assertThat(userListResponse.success()).contains(true)
        assertThat(userListResponse.total()).contains(0L)
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListResponse =
            UserListResponse.builder()
                .addData(
                    User.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .email("user@example.com")
                        .name("张三")
                        .createdAt(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
                        .build()
                )
                .success(true)
                .total(0L)
                .build()

        val roundtrippedUserListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListResponse),
                jacksonTypeRef<UserListResponse>(),
            )

        assertThat(roundtrippedUserListResponse).isEqualTo(userListResponse)
    }
}
