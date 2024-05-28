package org.freedu.quranapp.retrofit

import org.freedu.quranapp.model.Translation
import org.freedu.quranapp.model.Verse
import org.intellij.lang.annotations.Language
import retrofit2.http.GET
import retrofit2.http.Query

interface QuranApiService {
    @GET("quran/verses")
    suspend fun getVerses():List<Verse>

    @GET("quran/translation")
    suspend fun getTranslations(@Query("language") language:String):Translation
}