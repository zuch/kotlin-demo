package com.github.zuch.kotlin.demo.controllers

import com.github.zuch.kotlin.demo.constants.USERS_PATH_PREFIX
import com.github.zuch.kotlin.demo.mapper.UsersMapper
import com.github.zuch.kotlin.demo.model.rest.UsersRequest
import com.github.zuch.kotlin.demo.model.rest.UsersResponse
import com.github.zuch.kotlin.demo.services.GithubApiService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(USERS_PATH_PREFIX)
@RestController
class ConsumerController(
    val usersMapper: UsersMapper, val gitHubApiService: GithubApiService
) {

    @PostMapping(consumes = ["application/json"], produces = ["application/json"])
    fun getUsers(@RequestBody usersRequest: UsersRequest): ResponseEntity<UsersResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .contentType(MediaType.APPLICATION_JSON)
            .body(gitHubApiService.fetchGithubUsers(usersRequest.logins))
    }
}