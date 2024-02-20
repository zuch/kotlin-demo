package com.github.zuch.kotlin.demo.services

import com.github.zuch.kotlin.demo.model.github.GitHubUser
import com.github.zuch.kotlin.demo.model.rest.User
import com.github.zuch.kotlin.demo.model.rest.UsersResponse
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux

@Service
class GithubApiService(val webClient: WebClient) {

    fun fetchGithubUsers(logins: List<String>): UsersResponse? {

        //https://api.github.com/users/1
        //https://api.github.com/users/2
        //https://api.github.com/users/3
        //https://api.github.com/users/4
        //https://api.github.com/users/5

        return Flux.fromIterable(logins)
            .map { login -> "https://api.github.com/users/$login" }
            .flatMap { url ->
                val result = webClient
                    .get()
                    .uri(url)
                    .retrieve()
                    .bodyToMono(GitHubUser::class.java)
                    .log()
                result
            }
            .parallel(5)
            .map { result ->
                User(
                    result.login,
                    result.public_repos,
                    result.public_gists,
                    result.followers,
                    result.following
                )
            }
            .sequential()
            .collectList()
            .map { users -> UsersResponse(users) }
            .block()
    }
}