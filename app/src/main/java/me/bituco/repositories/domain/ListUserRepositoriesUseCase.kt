package me.bituco.repositories.domain

import kotlinx.coroutines.flow.Flow
import me.bituco.repositories.core.UseCase
import me.bituco.repositories.data.models.Repo
import me.bituco.repositories.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(private val repository: RepoRepository) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}