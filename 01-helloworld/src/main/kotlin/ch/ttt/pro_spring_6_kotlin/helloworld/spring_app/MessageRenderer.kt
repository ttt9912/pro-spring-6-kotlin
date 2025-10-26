package ch.ttt.pro_spring_6_kotlin.helloworld.spring_app

interface MessageRenderer {
    fun render()
    var messageProvider: MessageProvider?
}
