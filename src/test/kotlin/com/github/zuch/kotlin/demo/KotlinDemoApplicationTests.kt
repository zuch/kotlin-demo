package com.github.zuch.kotlin.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period
import java.time.format.DateTimeFormatter

@SpringBootTest
class KotlinDemoApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Test
    fun age() {
        val now = LocalDate.now()
        val dob = LocalDate.of(1988, 10, 16);
        val diff = Period.between(dob, now).years

        println(diff)
    }

    @Test
    fun date() {
        // Write your code below
        val now = LocalDateTime.now()
        val dft: DateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
        val todaysDate: String = now.format(dft).toString()
        println(todaysDate)
    }
}
