package com.collectednotes.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.collectednotes.ui.main.NoteFragment
import com.collectednotes.ui.main.NoteMarkDownFragment

class NotesAdapter (activity: AppCompatActivity, val itemsCount: Int) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == NOTE_FRAGMENT) {
            NoteFragment.newInstance()
        } else {
            NoteMarkDownFragment.newInstance()
        }
    }

    companion object {
        const val NOTE_FRAGMENT = 0
    }
}