package ch.ttt.pro_spring_6_kotlin.helloworld.spring_inject_collections

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component

/**
 * @Qulifier is required to inject a bean of type List<T>
 * without @Qualifier, spring will inject a list of all beans of T
 */
@Component
internal class CollectingBeanDemo {

    // Will inject a list of all Song beans instead of the Bean List<Song>
    @Autowired
    var songsWrong: List<Song>? = null

    @Autowired
    // @Qualifier("songList") // --> alternative
    @Value("#{collectionsConfig.songList}")
    var songsCorrect: List<Song>? = null

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ctx = AnnotationConfigApplicationContext()
            ctx.register(
                CollectingBeanDemo::class.java,
                CollectionsConfig::class.java
            )
            ctx.refresh()
            val bean = ctx.getBean("collectingBeanDemo") as CollectingBeanDemo
            println("songsWrong:")
            println(bean.songsWrong)
            println("songsCorrect:")
            println(bean.songsCorrect)
        }
    }
}