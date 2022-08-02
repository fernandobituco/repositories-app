package me.bituco.repositories.data.models

data class Repo(
    val description: String,
    val html_url: String,
    val id: Int,
    val language: String,
    val name: String,
    val owner: Owner
)