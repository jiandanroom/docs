// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.name_jiandan.api.client.okhttp.NameJiandanOkHttpClient
import com.name_jiandan.api.core.jsonMapper
import com.name_jiandan.api.models.users.User
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/name-jiandan-java-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = NameJiandanOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.users()).isNotNull()
    }

    @Test
    fun userRoundtrip() {
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
