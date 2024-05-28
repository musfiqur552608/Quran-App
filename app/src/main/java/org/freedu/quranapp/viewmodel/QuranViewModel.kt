package org.freedu.quranapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.freedu.quranapp.model.Translation
import org.freedu.quranapp.model.Verse
import org.freedu.quranapp.repository.QuranRepository

class QuranViewModel(private val repository: QuranRepository) :ViewModel(){
    private val _verses = MutableLiveData<List<Verse>>()
    val verses:LiveData<List<Verse>> get() = _verses

    private val _translations = MutableLiveData<Translation>()
    val translations:LiveData<Translation> get() = _translations

    fun getVerses(){
        viewModelScope.launch {
            _verses.value = repository.getVerses()
        }
    }

    fun getTranslations(language:String){
        viewModelScope.launch {
            _translations.value = repository.getTranslations(language)
        }
    }
}