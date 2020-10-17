package tech.pucci.digivice.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import tech.pucci.digivice.data.service.DigimonServiceProvider

class DigimonRepositoryImpl : DigimonRepository {

    private val service = DigimonServiceProvider.service

    override suspend fun getAll() = withContext(Dispatchers.IO) {
        service.list().map { it.transform() }
    }
}
