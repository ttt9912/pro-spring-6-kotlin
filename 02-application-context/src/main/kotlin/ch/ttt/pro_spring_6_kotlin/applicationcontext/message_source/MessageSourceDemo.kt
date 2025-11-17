package ch.ttt.pro_spring_6_kotlin.applicationcontext.message_source

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.context.MessageSource
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.ResourceBundleMessageSource
import java.util.Locale

/**
 * Using ApplicationContext as a MessageSource
 *
 * It is best to use a separate MessageSource for
 * translations than to use the ApplicationContext as
 * a MessageSource as it couples the ApplicationContext
 * with additional functionality
 */
@Configuration
internal open class MessageSourceConfig {
    @Bean
    open fun messageSource(): MessageSource =
        ResourceBundleMessageSource().apply {
            setBasename("labels")
        }
}

private val logger = KotlinLogging.logger {}

object MessageSourceDemo {
    @JvmStatic
    fun main(array: Array<String>) {
        val ctx = AnnotationConfigApplicationContext(MessageSourceConfig::class.java)
        val english = Locale.ENGLISH
        val russian = Locale.Builder().setLanguage("ru").setRegion("RU").build()
        logger.info { ctx.getMessage("msg", null, english) }
        logger.info { ctx.getMessage("msg", null, russian) }
        logger.info { ctx.getMessage("nameMsg", arrayOf("Peter", "Griffin"), english) }
        logger.info { ctx.getMessage("nameMsg", arrayOf("Pyotr Ilyich", "Tchaikovsky"), russian) }
    }
}