package ch.ttt.pro_spring_6_kotlin.helloworld.spring_value_injection

import org.springframework.stereotype.Component

@Component("injectSimpleConfig")
internal class InjectSimpleConfig {
    val city = "Bern"
}