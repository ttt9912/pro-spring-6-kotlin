package ch.ttt.pro_spring_6_kotlin.helloworld.spring_value_injection

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component

/**
 * Value injection
 *
 * Companion object: special object that is declared inside
 * a class and allows you to define members (functions and properties)
 * that are tied to the class itself rather than to instances of the
 * class. It’s similar to static members in Java, but with more flexibility.
 */
@Component
class ValueInjectionDemo {
    @Value("John Mayer")
    private val name: String? = null

    @Value("40")
    private val age = 0

    @Value("#{injectSimpleConfig.city.toUpperCase()}")
    private val city: String? = null

    override fun toString(): String {
        return """
            Name: $name
            Age: $age
            City: $city
        """.trimIndent()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ctx = AnnotationConfigApplicationContext()
            ctx.register(
                ValueInjectionDemo::class.java,
                InjectSimpleConfig::class.java
            )
            ctx.refresh()
            val simple = ctx.getBean("valueInjectionDemo") as ValueInjectionDemo
            println(simple)
        }
    }
}