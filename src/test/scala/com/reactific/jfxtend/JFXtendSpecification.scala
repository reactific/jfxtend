package com.reactific.jfxtend

import org.specs2.mutable.{Before, Specification}

import javafx.application.Application
import javafx.stage.Stage


class JavaFXInitializer(val barrier : Object) extends Application {
  var stage : Stage = null

  def start(primaryStage : Stage) : Unit = {
    stage = primaryStage
    this.synchronized {
      barrier.notify()
    }
  }
}

/** Unit Tests For JFXtendSpecification */
abstract class JFXtendSpecification extends Specification with Before {

  private var _stage : Stage = null
  def stage : Option[Stage] = Option(_stage)

  def before : Any = {
    val barrier = new Object()
    val initializer = new JavaFXInitializer(barrier)
    val task = new Runnable {
      def run : Unit = {
        Application.launch(classOf[JavaFXInitializer])
      }
    }
    val thread = new Thread(task, "JavaFX Init Thread")
    thread.setDaemon(true)
    thread.start()
    initializer.synchronized {
      barrier.wait()
    }
    _stage = initializer.stage
    success
  }

}
