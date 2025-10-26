package ch.ttt.pro_spring_6_kotlin.helloworld.spring_app_scan

import org.springframework.stereotype.Component

@Component
class HelloworldMessageProviderImpl : MessageProvider {
    init {
        println("--> HelloworldMessageProviderImpl: constructor called")
    }

    override val message: String?
        get() = "Hello World!"
}