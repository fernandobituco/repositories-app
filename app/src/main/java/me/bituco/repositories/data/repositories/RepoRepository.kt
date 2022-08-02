package me.bituco.repositories.data.repositories

import kotlinx.coroutines.flow.Flow
import me.bituco.repositories.data.models.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>
}