package ch.ttt.pro_spring_6_kotlin.helloworld.spring_app

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class HelloworldConfiguration {

    @Bean
    open fun provider(): MessageProvider{
        return HelloworldMessageProviderImpl()
    }

    @Bean
    open fun renderer(): MessageRenderer{
        val renderer: MessageRenderer = StandardOutMessageRenderer()
        renderer.messageProvider = provider()
        return renderer
    }
}