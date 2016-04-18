package com.reactific.jfxtend

import org.specs2.mutable.Specification

/** Unit Tests For JFXApplicationSpec */
class JFXApplicationSpec extends Specification {

  "JFXApplication" should {
    "run" in {
      val app = new JFXApplication {  override def applicationName : String = "JFXApplicationSpec" }
      app.main(Array.empty[String])
      success
    }
  }
}
