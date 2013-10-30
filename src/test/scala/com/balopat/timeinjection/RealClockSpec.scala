package com.balopat.timeinjection

import org.scalatest.FlatSpec
import java.util.Date
import org.scalatest.matchers.ShouldMatchers

class RealClockSpec extends FlatSpec with ShouldMatchers {

  "RealClock " should "give back instant between the command before and after" in {
    val clock: RealClock = new RealClock()

    val timeBefore = new Date()
    val realTime = clock.getTime()
    val timeAfter = new Date()

    realTime.after(timeBefore) || realTime.equals(timeBefore) should equal(true)
    realTime.before(timeAfter) || realTime.equals(timeAfter) should equal(true)

  }

}
