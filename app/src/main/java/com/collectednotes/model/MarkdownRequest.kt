package com.collectednotes.model

data class MarkdownRequest(
    var userMail: String = USER_MAIL_TEST,
    var apiKey: String = USER_API_KEY,
    var markdown: String
)

{
    companion object {
        const val EMPTY_STRING = ""
        const val USER_MAIL_TEST = "gastonmira@gmail.com"
        const val USER_API_KEY = "2973af72-9fb3-4fd0-816a-2d927054d9a1"
    }
}