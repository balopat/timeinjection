package com.balopat.timeinjection

import java.util.Date

class Wall(clock: Clock) {
    var messages = List[Message]()

    def message(message: String) {
       messages ::= Message(message, clock.getTime())
    }
}

case class Message(message: String, createdAt: Date)
