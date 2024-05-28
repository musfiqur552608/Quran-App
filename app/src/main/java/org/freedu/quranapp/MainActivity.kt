package org.freedu.quranapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import org.freedu.quranapp.repository.QuranRepository
import org.freedu.quranapp.retrofit.RetrofitInstance
import org.freedu.quranapp.viewmodel.QuranViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: QuranViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = QuranRepository(RetrofitInstance.api)
        viewModel = ViewModelProvider(this).get(QuranViewModel::class.java)

        viewModel.verses.observe(this, Observer {

        })

        viewModel.translations.observe(this, Observer {

        })

        viewModel.getVerses()
        viewModel.getTranslations("en")
    }
}