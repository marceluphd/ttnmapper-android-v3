package org.ttnmapper.phonesurveyor.model

import com.squareup.moshi.Json

data class Metadata(
        var time: String?, // 2018-03-18T10:05:45.391032906Z
        var frequency: Double?, // 868.5
        var modulation: String?, // LORA
        @field:Json(name = "data_rate")
        var dataRate: String?, // SF7BW125
        @field:Json(name = "bit_rate")
        var bitrate: Int?,
        var airtime: Int?, // 77056000
        @field:Json(name = "coding_rate")
        var codingRate: String?, // 4/5
        var gateways: List<GatewayMetadata?>?,

        // LocationMetadata
        var latitude: Double?,
        var longitude: Double?,
        var altitude: Int?,
        @field:Json(name = "location_accuracy")
        var accuracy: Int?,
        @field:Json(name = "location_source")
        var source: String?
)