// File generated from our OpenAPI spec by Stainless.

package com.name_jiandan.api.models.users

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.name_jiandan.api.core.ExcludeMissing
import com.name_jiandan.api.core.JsonField
import com.name_jiandan.api.core.JsonMissing
import com.name_jiandan.api.core.JsonValue
import com.name_jiandan.api.core.checkKnown
import com.name_jiandan.api.core.toImmutable
import com.name_jiandan.api.errors.NameJiandanInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UserListResponse
private constructor(
    private val data: JsonField<List<User>>,
    private val success: JsonField<Boolean>,
    private val total: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<User>> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
    ) : this(data, success, total, mutableMapOf())

    /**
     * @throws NameJiandanInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<List<User>> = data.getOptional("data")

    /**
     * @throws NameJiandanInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * @throws NameJiandanInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Optional<Long> = total.getOptional("total")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<User>> = data

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [UserListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<User>>? = null
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var total: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userListResponse: UserListResponse) = apply {
            data = userListResponse.data.map { it.toMutableList() }
            success = userListResponse.success
            total = userListResponse.total
            additionalProperties = userListResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<User>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<User>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<User>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [User] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: User) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [UserListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserListResponse =
            UserListResponse(
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                success,
                total,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserListResponse = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.forEach { it.validate() } }
        success()
        total()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: NameJiandanInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (success.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserListResponse && data == other.data && success == other.success && total == other.total && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, success, total, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserListResponse{data=$data, success=$success, total=$total, additionalProperties=$additionalProperties}"
}
