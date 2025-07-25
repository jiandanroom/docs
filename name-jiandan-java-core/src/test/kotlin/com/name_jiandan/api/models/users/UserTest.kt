// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.name_jiandan.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val user =
            User.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .email("user@example.com")
                .name("张三")
                .createdAt(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
                .build()

        assertThat(user.id()).isEqualTo("550e8400-e29b-41d4-a716-446655440000")
        assertThat(user.email()).isEqualTo("user@example.com")
        assertThat(user.name()).isEqualTo("张三")
        assertThat(user.createdAt()).contains(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val user =
            User.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .email("user@example.com")
                .name("张三")
                .createdAt(OffsetDateTime.parse("2023-01-01T12:00:00Z"))
                .build()

        val roundtrippedUser =
            jsonMapper.readValue(jsonMapper.writeValueAsString(user), jacksonTypeRef<User>())

        assertThat(roundtrippedUser).isEqualTo(user)
    }
}
