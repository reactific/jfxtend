package com.reactific.jfxtend.more

import javafx.concurrent.Task

import com.reactific.jfxtend.JFXtendSpecification

/** Unit Tests For SplashTaskSpec */
class SplashTaskSpec extends JFXtendSpecification {

  "SplashTask" should {
    "make a splash" in {
      val task = new Task[Int] {
        val names = Vector("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")
        override def call(): Int = {
          var x = -1
          for (i ← 0 to 9) {
            this.updateProgress(i.toLong, 9.toLong)
            this.updateMessage(names(i))
            x = i
          }
          x
        }
      }

      val st = new SplashTask[Int](task)
      var result : Int  = 0
      st.run(stage.get) { i : Int ⇒ result = i }
      result must beGreaterThan(0)
    }
  }
}
