package com.reactific.jfxtend.stage

import javafx.scene.Scene
import javafx.stage.{Stage ⇒ JFXStage}
import javafx.scene.input.KeyCombination

import org.specs2.mutable.Specification


class StageSpec extends Specification {

  "StageSpec" should {
    "provide simple setters for Stage" in {
      import com.reactific.jfxtend.stage._
      val stage = new JFXStage
      stage.title = "title"
      stage.alwaysOnTop = true
      stage.fullScreenExitKey = KeyCombination.NO_MATCH
      stage.fullScreen = false
      stage.iconified = false
      stage.resizable = false
      stage.scene = null.asInstanceOf[Scene]
      stage.minWidth = 23.0
      stage.minHeight = 17.0
      stage.maxWidth = 99.0
      stage.maxHeight = 432.0
      stage.showing = true
      success
    }
  }
}
