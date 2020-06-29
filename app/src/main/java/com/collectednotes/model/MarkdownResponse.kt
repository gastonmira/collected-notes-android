package com.collectednotes.model

data class MarkdownResponse(
    var body: String = EMPTY_STRING,
    var visibility: Visibility = Visibility.PRIVATE
)

{
    companion object {
        const val EMPTY_STRING = ""
    }
}

enum class Visibility(val visibility: String) {
    PRIVATE("private"),
    PUBLIC("public")

}