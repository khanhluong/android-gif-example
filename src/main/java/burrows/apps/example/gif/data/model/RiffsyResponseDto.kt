package burrows.apps.example.gif.data.model

import com.squareup.moshi.Json

/**
 * Riffsy Api Response.
 *
 * eg. https://api.riffsy.com/v1/search?key=LIVDSRZULELA&tag=goodluck&limit=10
 */
data class RiffsyResponseDto(
    @field:Json(name = "results") private val resultsJson: List<ResultDto>? = null,
    @field:Json(name = "next") private val nextJson: Double? = null
) {
    val results: List<ResultDto>
        get() = resultsJson.orEmpty()
    val next: Double
        get() = nextJson ?: 0.0
}
