package com.collectednotes.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotesViewModel : ViewModel() {
    val note = MutableLiveData<String>()

    fun myNote(noteFromFragment: String) {
        note.value = noteFromFragment
    }
}