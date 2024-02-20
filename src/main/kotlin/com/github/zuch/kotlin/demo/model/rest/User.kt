package com.github.zuch.kotlin.demo.model.rest

data class User(
    val login: String,
    val public_repos: Int,
    val public_gists: Int,
    val followers: Int,
    val following: Int
)
