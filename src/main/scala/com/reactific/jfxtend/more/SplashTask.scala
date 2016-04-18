package com.reactific.jfxtend.more

import javafx.animation.FadeTransition
import javafx.beans.value.ObservableValue
import javafx.concurrent._
import javafx.event.ActionEvent
import javafx.geometry._
import javafx.scene.Scene
import javafx.scene.control._
import javafx.scene.effect.DropShadow
import javafx.scene.image._
import javafx.scene.layout._
import javafx.stage._
import javafx.util.Duration

import com.reactific.jfxtend.concurrent._
import com.reactific.jfxtend.animation._
import com.reactific.jfxtend.stage._
import com.reactific.jfxtend.geometry._

/** Unit Tests For TaskSplash */
class SplashTask[RESULT](
  task : Task[RESULT],
  splash_url: String = "http://fxexperience.com/wp-content/uploads/2010/06/logo.png"
) {
  val imageView = new ImageView(splash_url)
  val width : Double = imageView.getFitWidth
  val height : Double = imageView.getFitHeight
  val label = new Label("Loading . . .")
  label.setAlignment(Pos.CENTER)
  val progress = new ProgressBar()
  progress.setPrefWidth(width - 20)


  val layout = new VBox(imageView, progress, label)
  layout.setStyle(
    """-fx-padding: 5;
      |-fx-background-color: cornsilk;
      | -fx-border-width: 5;
      | -fx-border-color: linear-gradient(to bottom, chocolate, derive(chocolate, 50%));
    """.stripMargin
  )
  layout.setEffect(new DropShadow())

  def run(initStage: Stage)(completionHandler: (RESULT) ⇒ Unit) : Unit = {
    label.textProperty.bind(task.messageProperty)
    progress.progressProperty.bind(task.progressProperty)
    task.onSucceeded( (StateObservable) ⇒ {
      label.textProperty.unbind()
      progress.progressProperty.unbind()
      progress.setProgress(1)
      initStage.toFront()
      val fadeSplash : FadeTransition = new FadeTransition(Duration.seconds(1.2), layout)
      fadeSplash.setFromValue(1.0)
      fadeSplash.setToValue(0.0)
      fadeSplash.onFinished { (actionEvent: ActionEvent) => initStage.hide() }
      fadeSplash.play()
      completionHandler(task.getValue)
    } )

    val splashScene: Scene = new Scene(layout)
    initStage.initStyle(StageStyle.UNDECORATED)
    val bounds: Rectangle2D = Screen.getPrimary.getBounds
    initStage.setScene(splashScene)
    initStage.x = bounds.minX + bounds.width / 2 - width / 2
    initStage.y = bounds.minY + bounds.height / 2 - height / 2
    initStage.show()
    new Thread(task).start()
  }
}
