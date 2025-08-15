@file:JvmName("JsonHandler")

package com.name_jiandan.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.name_jiandan.api.core.http.HttpResponse
import com.name_jiandan.api.core.http.HttpResponse.Handler
import com.name_jiandan.api.errors.NameJiandanInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw NameJiandanInvalidDataException("Error reading response", e)
            }
    }
