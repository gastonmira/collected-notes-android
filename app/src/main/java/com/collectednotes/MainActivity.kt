package com.collectednotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager2.widget.ViewPager2
import com.collectednotes.adapter.NotesAdapter
import com.collectednotes.ui.main.NoteFragment
import com.collectednotes.ui.main.NoteMarkDownFragment
import com.collectednotes.ui.main.NotesViewModel
import kotlinx.android.synthetic.main.main_activity.*

const val COUNT_PAGES = 2

class MainActivity : AppCompatActivity() {

    private lateinit var notesPageChangeCallback: ViewPager2.OnPageChangeCallback
    private lateinit var viewModel: NotesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        viewModel = ViewModelProviders.of(this).get(NotesViewModel::class.java)
        setViewPagerConfig()
    }

    private fun setViewPagerConfig() {
        val notesAdapter = NotesAdapter(this, COUNT_PAGES)
        view_pager.adapter = notesAdapter
        notesPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            }
        }
        view_pager.registerOnPageChangeCallback(notesPageChangeCallback)

    }

    override fun onDestroy() {
        super.onDestroy()
        view_pager.unregisterOnPageChangeCallback(notesPageChangeCallback)
    }
}