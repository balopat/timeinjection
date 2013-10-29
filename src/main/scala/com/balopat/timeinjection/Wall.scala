package com.balopat.timeinjection

import java.util.Date

class Wall {
    var messages = List[Message]()

    def message(message: String) {
       messages ::= Message(message, new Date())
    }
}

case class Message(message: String, createdAt: Date)
