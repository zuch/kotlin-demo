package com.github.zuch.kotlin.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(ControllerPaths.USERS_PATH_PREFIX)
@RestController
class ConsumerController {

    @GetMapping(produces = ["application/json"])
    fun getUsers(): String {
        return "Users"
    }
}