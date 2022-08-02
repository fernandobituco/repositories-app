package me.bituco.repositories.data.services

import me.bituco.repositories.data.models.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepos(@Path("user") user: String) : List<Repo>
}