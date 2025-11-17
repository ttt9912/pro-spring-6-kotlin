package ch.ttt.pro_spring_6_kotlin.various.logging

import io.github.oshai.kotlinlogging.KotlinLogging

/**
 * It is not recommended to use java.util.logging
 *
 * Recommended:
 * Use SLF4J and Logback
 *  - In Kotlin, the easiest way is to use the kotlin-logging wrapper:
 *
 * ------------------
 * Spring Boot
 * ------------------
 * Uses SLF4J as its logging abstraction and
 * Logback as the default logging implementation.
 *
 */
private val logger = KotlinLogging.logger {}

object LoggingDemo {
    @JvmStatic
    fun main(array: Array<String>) {
        logger.info { "Hi" }
    }
}