package com.navalia.springbootstarter.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.*

@RestController
@RefreshScope
class ScssController() {

    @Value("\${user.role}")
    private val role: String? = null

    @GetMapping(value = arrayOf("/whoami/{username}"))
    fun retrieveUsers(@PathVariable("username") username : String) : String {
        return String.format("Hello! You are %s and you'll become a(n) %s...\n", username, role);
    }
}