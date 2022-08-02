package me.bituco.repositories.data.repositories

import kotlinx.coroutines.flow.flow
import me.bituco.repositories.data.services.GitHubService

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        val listRepos = service.listRepos(user)
        emit(listRepos)
    }
}