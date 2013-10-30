package com.balopat.timeinjection

import java.util.Date

class RealClock extends Clock {
  def getTime() = new Date()
}

trait Clock {
  def getTime(): Date
}