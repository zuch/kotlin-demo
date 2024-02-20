package com.github.zuch.kotlin.demo.config

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.github.zuch.kotlin.demo.constants.GITHUB_API_BASE_PATH

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class DemoApplicationConfig {

    @Bean
    fun webClient(): WebClient {
        return WebClient.builder()
            .baseUrl(GITHUB_API_BASE_PATH)
            .defaultCookie("cookie-name", "cookie-value")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build()
    }

//    @Bean
//    fun objectMapper(): ObjectMapper {
//        val mapper = ObjectMapper()
////        mapper.deactivateDefaultTyping()
////        mapper.registerModule(JavaTimeModule())
////        mapper.registerModule(Jdk8Module())
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL)
////        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
////        mapper.disable(DeserializationFeature.ACCEPT_FLOAT_AS_INT)
////        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
////        mapper.enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)
//        return mapper
//    }
}