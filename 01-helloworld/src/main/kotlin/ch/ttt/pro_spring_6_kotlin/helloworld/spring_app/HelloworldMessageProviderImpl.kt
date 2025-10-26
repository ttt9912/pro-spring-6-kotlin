package ch.ttt.pro_spring_6_kotlin.helloworld.spring_app

class HelloworldMessageProviderImpl : MessageProvider {
    init {
        println("--> HelloworldMessageProviderImpl: constructor called")
    }

    override val message: String?
        get() = "Hello World!"
}