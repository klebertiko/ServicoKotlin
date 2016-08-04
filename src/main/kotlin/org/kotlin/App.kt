package org.kotlin

import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.web.client.RestTemplate

/**
 * Created by Kleber on 04/08/2016.
 */
@SpringBootApplication
open class App {

    @Bean
    open fun restTemplate(): RestTemplate {
        val restTemplate = RestTemplate()
        return restTemplate
    }

    @Bean
    open fun objectMapperBuilder(): Jackson2ObjectMapperBuilder = Jackson2ObjectMapperBuilder().modulesToInstall(KotlinModule())
}

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}
