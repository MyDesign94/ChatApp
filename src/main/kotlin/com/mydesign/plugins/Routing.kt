package com.mydesign.plugins

import com.mydesign.room.RoomController
import com.mydesign.routes.chatSocket
import com.mydesign.routes.getAllMessages
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
