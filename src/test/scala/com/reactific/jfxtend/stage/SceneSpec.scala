package com.reactific.jfxtend.stage

import javafx.geometry.NodeOrientation
import javafx.scene.paint.Color

import com.reactific.jfxtend.scene._

import javafx.scene.{PerspectiveCamera, Scene}
import javafx.scene.layout.StackPane

import org.specs2.mutable.Specification


class SceneSpec extends Specification {

  "Scene" should {
    "provide simple setters" in {
      val scene = new Scene( new StackPane)
      scene.fill = Color.BLACK
      scene.camera = new PerspectiveCamera()
      scene.nodeOrientation = NodeOrientation.LEFT_TO_RIGHT
      success
    }
  }
}
