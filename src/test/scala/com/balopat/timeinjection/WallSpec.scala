package com.balopat.timeinjection

import org.scalatest.FlatSpec
import java.util.Date
import org.scalatest.matchers.ShouldMatchers

class WallSpec extends FlatSpec with ShouldMatchers {

   class MockedClock(var time: Date) extends Clock {
     def getTime() = time
   }
   val mockedClock = new MockedClock(new Date())

  "messages" should "be written in reverse order on the wall" in {
    val wall = new Wall(mockedClock) //we are injecting our mocked time

    val timeAtFirst = new Date()
    mockedClock.time = timeAtFirst //we are controlling time!
    wall.message("Hello World!")

    val timeAtSecond = new Date()
    mockedClock.time = timeAtSecond//we are controlling time!
    wall.message("Hello, HelloWorld!")

    wall.messages should equal(
      List(Message("Hello, HelloWorld!", timeAtSecond),
        Message("Hello World!", timeAtFirst))
    )
  }
}
