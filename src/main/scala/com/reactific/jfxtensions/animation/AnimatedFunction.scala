package com.reactific.jfxtensions.animation

import javafx.animation.AnimationTimer

/** Wrap An AnimationTimer That Invokes A Function */
case class AnimatedFunction(f : (Long, Long) ⇒ Unit ) extends AnimationTimer {
  private var lastTime = System.nanoTime()
  override final protected def handle(now: Long): Unit = {
    f(now, now - lastTime)
    lastTime = now
  }
}
