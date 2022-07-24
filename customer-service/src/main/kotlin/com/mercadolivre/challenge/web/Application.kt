package com.mercadolivre.challenge.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.mercadolivre.challenge"])
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
