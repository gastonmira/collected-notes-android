package com.collectednotes.model

data class MarkdownRequest(
    var userMail: String = USER_MAIL_TEST,
    var apiKey: String = USER_API_KEY,
    var markdown: String
)

{
    companion object {
        const val EMPTY_STRING = ""
        const val USER_MAIL_TEST = ""
        const val USER_API_KEY = ""
    }
}