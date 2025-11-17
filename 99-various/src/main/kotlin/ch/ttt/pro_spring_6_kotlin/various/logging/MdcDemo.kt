package ch.ttt.pro_spring_6_kotlin.various.logging

import io.github.oshai.kotlinlogging.KotlinLogging
import io.github.oshai.kotlinlogging.withLoggingContext

/**
 * Add variables to MDC
 *
 * MDC=%X{user} is added in the original logback.xml
 */
private val logger = KotlinLogging.logger {}

object MdcDemo {
    @JvmStatic
    fun main(array: Array<String>) {
        withLoggingContext("user" to "Thomas") {
            logger.info { "Log with MDC" }
        }
    }
}