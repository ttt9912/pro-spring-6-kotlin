package ch.ttt.pro_spring_6_kotlin.helloworld.spring_app

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

/**
 * Dependency pull (a form of dependency lookup) is the IoC flavor here
 *
 * ----------------------
 * IoC types:
 * ----------------------
 * 1) Dependency lookup
 *  - Dependency pull vs. Contextualized dependency lookup (CDL)
 * 2) Dependency injection
 *  - Constructor injection vs. Setter injection
 *
 *  Consequence of constructor injection: object cannot be created
 *  without its dependencies (in contrast to setter injection)
 *
 *  Dependency lookup makes testing more difficult
 */
object HelloworldSpringApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val ctx: ApplicationContext =
            AnnotationConfigApplicationContext(HelloworldConfiguration::class.java)
        // Dependency pull
        val messageRenderer = ctx.getBean("renderer", MessageRenderer::class.java)
        messageRenderer.render()
    }
}