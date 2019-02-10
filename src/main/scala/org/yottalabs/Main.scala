package org.yottalabs

object Main{

  def main(args: Array[String]): Unit = {
    for(i <- 1 to 1000) {
      println("Hello Scala World!")
      Thread.sleep(1000)
    }
  }

}
