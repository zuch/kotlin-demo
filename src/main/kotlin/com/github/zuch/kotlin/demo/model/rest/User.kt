package com.github.zuch.kotlin.demo.model.rest

data class User(
    val login: String,
    val name: String?,
    val company: String?,
    val location: String?,
    val email: String?,
    val hireable: String?,
    val bio: String?,
    val public_repos: Int,
    val public_gists: Int,
    val followers: Int,
    val following: Int
)
