package tech.pucci.digivice.data.service

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object DigimonServiceProvider {

    val service: DigimonService by lazy {
        Retrofit.Builder()
            .baseUrl("https://digimon-api.vercel.app/api/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(DigimonService::class.java)
    }
}
