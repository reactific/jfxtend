package com.reactific.jfxtend

import javafx.stage.{Window ⇒ JFXWindow, Stage ⇒ JFXStage}

/** Extensions for the javafx.stage package */
package object stage {

  implicit class StageExt(val extendee : JFXStage) extends StageExtensions
  implicit class WindowExt(val extendee : JFXWindow) extends WindowExtensions[JFXWindow]

}
