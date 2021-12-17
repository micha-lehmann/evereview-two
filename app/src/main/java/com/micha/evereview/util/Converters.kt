package com.micha.evereview.util

import androidx.room.TypeConverter
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.decodeFromByteArray
import kotlinx.serialization.encodeToByteArray
import java.io.Serializable

@ExperimentalSerializationApi
object Converters {
    @TypeConverter
    fun fromMetadata(value: Map<String, Serializable>): ByteArray {
        return Cbor.encodeToByteArray(value)
    }

    @TypeConverter
    fun toMetadata(value: ByteArray): Map<String, Serializable> {
        return Cbor.decodeFromByteArray(value)
    }
}
