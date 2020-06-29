package com.collectednotes.ui.main

import android.os.Bundle
import android.text.Spanned
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.collectednotes.R
import com.collectednotes.model.MarkdownRequest
import io.noties.markwon.Markwon
import io.noties.markwon.PrecomputedTextSetterCompat
import kotlinx.android.synthetic.main.fragment_note_mark_down.*
import java.util.concurrent.Executors

class NoteMarkDownFragment : Fragment() {

    companion object {
        fun newInstance() = NoteMarkDownFragment()
    }

    private val notesViewModel: NotesViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_mark_down, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val map = mapOf<String, String>("Authorization" to MarkdownRequest.USER_MAIL_TEST + "" + MarkdownRequest.USER_API_KEY,
        "Accept" to "application/json", "Content-Type" to "application/json")
        notesViewModel.note.observe(viewLifecycleOwner,
            Observer<Any> { t ->
                web_view_markdown.loadUrl("https://collectednotes.com/markdown?markdown=$t", map)
            })
    }
}