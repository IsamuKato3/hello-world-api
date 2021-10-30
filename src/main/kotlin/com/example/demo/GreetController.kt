package com.example.demo

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetController {
    @RequestMapping("greet/{name}")
    fun greet(@PathVariable name: String) = GreetResponse("Hello $name")

    data class GreetResponse(
        val message: String
    )
}