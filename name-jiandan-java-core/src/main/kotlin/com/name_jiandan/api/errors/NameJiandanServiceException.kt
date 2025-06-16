// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.errors

import com.name_jiandan.api.core.JsonValue
import com.name_jiandan.api.core.http.Headers

abstract class NameJiandanServiceException
protected constructor(message: String, cause: Throwable? = null) :
    NameJiandanException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
