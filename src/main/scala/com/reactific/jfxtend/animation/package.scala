package com.reactific.jfxtend

import javafx.animation.{Animation, Transition, FadeTransition}

/** Extensions To JavaFX animation package */
package object animation {

    implicit class FadeTransitionJFXtend(val extendee: FadeTransition) extends FadeTransitionExtensions

    implicit class TransitionJFXtend(val extendee: Transition) extends TransitionExtensions[Transition]
    implicit class AnimationJFXtend(val extendee: Animation) extends AnimationExtensions[Animation]
}
