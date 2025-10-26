package ch.ttt.pro_spring_6_kotlin.helloworld.spring_app_scan

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
 * Creating Application context via annotations and component scan: HelloworldConfiguration
 *
 * Setter injection vs. Constructor injection: StandardOutMessageRendererImpl
 */
object HelloworldSpringApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val ctx: ApplicationContext =
            AnnotationConfigApplicationContext(HelloworldConfiguration::class.java)
        // Dependency pull
        val messageRenderer = ctx.getBean(MessageRenderer::class.java)
        messageRenderer.render()
    }
}