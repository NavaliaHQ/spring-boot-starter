package com.navalia.springbootstarter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootStarterApplication

fun main(args: Array<String>) {
	runApplication<SpringBootStarterApplication>(*args)
}
