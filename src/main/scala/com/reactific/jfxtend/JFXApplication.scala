package com.reactific.jfxtend

import javafx.application.Application
import javafx.geometry.Pos
import javafx.scene.layout.HBox
import javafx.scene.paint.Color
import javafx.scene.text.{TextAlignment, FontWeight, Font, Text}
import javafx.scene.Scene
import javafx.stage.{Stage ⇒ JFXStage}

import com.reactific.jfxtend.stage._
import com.reactific.jfxtend.scene._


/** JFXApplication extension to JavaFX Application */
abstract class JFXApplication extends Application {

  /** The Application Name
    * Your subclass should override this to provide the name of the application for menus and title bars.
    *
    * @return The name of the application
    */
  def applicationName : String = getClass.getSimpleName

  /** The Scene Creator
    * Your application subclass MUST override this to create the scene to be displayed. The stage should not be
    * altered as it will have been pre-configured for the device your application is running on. Also, do not
    * install the scene in the stage, just return it.
    *
    * @param stage The stage for your application
    * @return The scene to display in your application's stage
    */
  def createScene(stage: JFXStage) : Scene = {
    val text = new Text("You forgot to override JFXApplication.createScene(Stage)")
    text.setFill(Color.LIGHTCORAL)
    text.setFont(Font.font("Arial Black", FontWeight.BLACK, 15))
    text.setTextAlignment(TextAlignment.CENTER)
    val hbox = new HBox(text)
    hbox.setAlignment(Pos.CENTER_LEFT)
    val scene = new Scene ( hbox )
    scene.fill = Color.BLACK
    scene
  }

  final def start(stage: JFXStage) = {
    stage.width = 600
    stage.height = 400
    stage.setFullScreen(capabilities.shouldStartFullScreen)
    stage.setTitle(applicationName)
    val scene = createScene(stage)
    stage.scene = scene
    stage.show()
  }

  private final var capabilities : Capabilities = null

  private[jfxtend] def setUp() : Unit = {
    capabilities = new Capabilities
  }

  def main(args: Array[String]): Unit = {
    MainHelper.instance = this
    Application.launch(classOf[MainHelper.InstantiableApp], args: _*)
  }

  private[jfxtend] def tearDown() : Unit = {

  }
}

object MainHelper {
  var instance : JFXApplication = null

  class InstantiableApp extends Application {
    override def init = {
      instance.setUp
      instance.init()
    }
    def start(stage: JFXStage) = {
      instance.start(stage)
      stage.show()
    }
    override def stop() = {
      instance.stop()
      instance.tearDown
    }
  }
}
