package ch.ttt.pro_spring_6_kotlin.helloworld.spring_inject_collections

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal open class CollectionsConfig {

    @Bean
    open fun songList(): List<Song> {
        return listOf(
            Song("Hello Goodbye"),
            Song("Yesterday")
        )
    }

    @Bean
    open fun song(): Song{
        return Song("Wish you were here")
    }
}