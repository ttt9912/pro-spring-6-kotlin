package ch.ttt.pro_spring_6_kotlin.helloworld.spring_app

class StandardOutMessageRendererImpl : MessageRenderer {
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

    override var messageProvider: MessageProvider? = null
        set(value) {
            field = value
            println("--> StandardOutMessageRendererImpl: setting the provider")
        }
}