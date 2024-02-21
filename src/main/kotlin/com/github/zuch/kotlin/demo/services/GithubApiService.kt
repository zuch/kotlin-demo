package com.github.zuch.kotlin.demo.services

import com.github.zuch.kotlin.demo.model.github.GitHubUser
import com.github.zuch.kotlin.demo.model.rest.User
import com.github.zuch.kotlin.demo.model.rest.UsersResponse
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Service
class GithubApiService(val webClient: WebClient) {

    fun fetchGithubUsers(logins: List<String>): Mono<UsersResponse> {
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
            .map { result ->
                User(
                    result.login,
                    result.name,
                    result.company,
                    result.location,
                    result.email,
                    result.hireable,
                    result.bio,
                    result.public_repos,
                    result.public_gists,
                    result.followers,
                    result.following
                )
            }
            .collectList()
            .map { users -> UsersResponse(users) }
            .toMono()
    }
}