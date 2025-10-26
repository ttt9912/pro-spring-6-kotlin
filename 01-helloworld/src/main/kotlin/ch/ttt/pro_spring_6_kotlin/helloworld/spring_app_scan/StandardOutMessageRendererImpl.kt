package ch.ttt.pro_spring_6_kotlin.helloworld.spring_app_scan

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

/**
 * Constructor injection
 *
 * Setter injection works by just annotating the setter:
 *
 * <pre>
 *     override var messageProvider: MessageProvider? = null
 *         @Autowired set(value) {
 *             field = value
 *             println("--> StandardOutMessageRendererImpl: setting the provider")
 *         }
 * </pre>
 */
@Component
class StandardOutMessageRendererImpl @Autowired constructor(
    override var messageProvider: MessageProvider?
) : MessageRenderer {

    init {
        println("--> StandardOutMessageRendererImpl: constructor called")
    }

    override fun render() {
        println(
            messageProvider?.message ?: throw RuntimeException(
                "You must set the property messageProvider of class:"
                        + StandardOutMessageRendererImpl::class.java.name
            )
        )
    }
}