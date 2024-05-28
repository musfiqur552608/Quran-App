package org.freedu.quranapp.repository

import org.freedu.quranapp.model.Translation
import org.freedu.quranapp.model.Verse
import org.freedu.quranapp.retrofit.QuranApiService

class QuranRepository (private val api:QuranApiService){
    suspend fun getVerses():List<Verse>{
        return api.getVerses()
    }

    suspend fun getTranslations(language:String):Translation{
        return api.getTranslations(language)
    }
}