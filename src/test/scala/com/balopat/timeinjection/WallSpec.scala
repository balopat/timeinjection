package com.balopat.timeinjection

import org.scalatest.FlatSpec
import java.util.Date
import org.scalatest.matchers.ShouldMatchers

class WallSpec extends FlatSpec with ShouldMatchers {

  "messages" should "be written in reverse order on the wall" in {
    val wall = new Wall
    val timeAtFirst = new Date()
    wall.message("Hello World!")
    val timeAtSecond = new Date()
    wall.message("Hello, HelloWorld!")

    wall.messages should equal(
      List(Message("Hello, HelloWorld!", timeAtFirst),
        Message("Hello World!", timeAtSecond))
    )
  }
}
