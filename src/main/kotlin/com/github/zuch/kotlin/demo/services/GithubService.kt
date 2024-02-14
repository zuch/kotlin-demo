package com.github.zuch.kotlin.demo.services

import org.springframework.stereotype.Service

@Service
class GithubService {

    fun getGithubUser(username: String): String {
        return "https://api.github.com/users/$username"
    }
}