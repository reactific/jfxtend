package com.reactific.jfxtensions

import javafx.stage.{Window, Stage}

/** Extensions for the javafx.stage package */
package object stage {

  implicit class StageExt(val wrapped : Stage) extends StageExtensions
  implicit class WindowExt(val wrapped : Window) extends WindowExtensions[Window]

}
