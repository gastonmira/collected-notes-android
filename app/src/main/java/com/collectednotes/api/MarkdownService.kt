package com.collectednotes.api

import com.collectednotes.model.MarkdownResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MarkdownService {

    @GET("/markdown")
    fun getMarkdownNote(
        @Query("note") markdownFormat: String
    ): Call<MarkdownResponse>
}