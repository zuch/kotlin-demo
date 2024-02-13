package com.github.zuch.kotlin.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DogController {


    @GetMapping(name = "/dog")
    fun getDog(count: Int): String {
        println(count)
        return "Dog"
    }

    // https://api.github.com/users/zuch
}