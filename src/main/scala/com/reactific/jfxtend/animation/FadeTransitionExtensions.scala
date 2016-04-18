package com.reactific.jfxtend.animation

import javafx.animation.FadeTransition
import javafx.event.{EventHandler, ActionEvent}

/** Unit Tests For FadeTransitionExtensions */
trait FadeTransitionExtensions extends TransitionExtensions[FadeTransition] {

  def onFinished( f: (ActionEvent) ⇒ Unit) : Unit = {
    extendee.setOnFinished( new EventHandler[ActionEvent] {
      override def handle(event: ActionEvent): Unit = { f (event) }
    })
  }
}
