package me.bituco.repositories.data.repositories

import android.os.RemoteException
import kotlinx.coroutines.flow.flow
import me.bituco.repositories.data.services.GitHubService
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        try {
            val listRepos = service.listRepos(user)
            emit(listRepos)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message)
        }
    }
}