package com.reactific.jfxtensions.stage

import javafx.event.{EventHandler, EventDispatcher}
import javafx.stage.{Window, WindowEvent}


/** Extensions to JavaFX Window */
trait WindowExtensions[T <: Window] {

  def wrapped : T

  @inline def x : Double = wrapped.getX
  @inline def x_=(value : Double) = wrapped.setX(value)

  @inline def y : Double = wrapped.getY
  @inline def y_=(value : Double) = wrapped.setY(value)

  @inline def width : Double = wrapped.getWidth
  @inline def width_=(value : Double) = wrapped.setWidth(value)

  @inline def height : Double = wrapped.getHeight
  @inline def height_=(value : Double) = wrapped.setHeight(value)

  @inline def isFocused_=(value : Boolean) = if (value) wrapped.requestFocus()

  @inline def userData : AnyRef = wrapped.getUserData
  @inline def userData_=(value : Boolean) = wrapped.setUserData(value)

  @inline def scene = wrapped.getScene

  @inline def opacity = wrapped.getOpacity
  @inline def opacity_=(value : Double) = wrapped.setOpacity(value)

  @inline def onCloseRequest = wrapped.getOnCloseRequest
  @inline def onCloseRequest_=(value : EventHandler[WindowEvent]) = wrapped.setOnCloseRequest(value)

  @inline def onShowing = wrapped.getOnShowing
  @inline def onShowing_=(value : EventHandler[WindowEvent]) = wrapped.setOnShowing(value)

  @inline def onShown = wrapped.getOnShown
  @inline def onShown_=(value : EventHandler[WindowEvent]) = wrapped.setOnShown(value)

  @inline def onHiding = wrapped.getOnHiding
  @inline def onHiding_=(value : EventHandler[WindowEvent]) = wrapped.setOnHiding(value)

  @inline def onHidden = wrapped.getOnHidden
  @inline def onHidden_=(value : EventHandler[WindowEvent]) = wrapped.setOnHidden(value)

  @inline def eventDispatcher = wrapped.getEventDispatcher
  @inline def eventDispatcher_=(value : EventDispatcher) = wrapped.setEventDispatcher(value)
}
