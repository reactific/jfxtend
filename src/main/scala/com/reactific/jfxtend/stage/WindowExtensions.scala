package com.reactific.jfxtend.stage

import javafx.event.{EventHandler, EventDispatcher}
import javafx.stage.{Window ⇒ JFXWindow, WindowEvent}

import com.reactific.jfxtend.Extension


/** Extensions to JavaFX Window */
trait WindowExtensions[T <: JFXWindow] extends Extension[T] {

  @inline def x : Double = extendee.getX
  @inline def x_=(value : Double) = extendee.setX(value)

  @inline def y : Double = extendee.getY
  @inline def y_=(value : Double) = extendee.setY(value)

  @inline def width : Double = extendee.getWidth
  @inline def width_=(value : Double) = extendee.setWidth(value)

  @inline def height : Double = extendee.getHeight
  @inline def height_=(value : Double) = extendee.setHeight(value)

  @inline def isFocused_=(value : Boolean) = if (value) extendee.requestFocus()

  @inline def userData : AnyRef = extendee.getUserData
  @inline def userData_=(value : Boolean) = extendee.setUserData(value)

  @inline def scene = extendee.getScene

  @inline def opacity = extendee.getOpacity
  @inline def opacity_=(value : Double) = extendee.setOpacity(value)

  @inline def onCloseRequest = extendee.getOnCloseRequest
  @inline def onCloseRequest_=(value : EventHandler[WindowEvent]) = extendee.setOnCloseRequest(value)

  @inline def onShowing = extendee.getOnShowing
  @inline def onShowing_=(value : EventHandler[WindowEvent]) = extendee.setOnShowing(value)

  @inline def onShown = extendee.getOnShown
  @inline def onShown_=(value : EventHandler[WindowEvent]) = extendee.setOnShown(value)

  @inline def onHiding = extendee.getOnHiding
  @inline def onHiding_=(value : EventHandler[WindowEvent]) = extendee.setOnHiding(value)

  @inline def onHidden = extendee.getOnHidden
  @inline def onHidden_=(value : EventHandler[WindowEvent]) = extendee.setOnHidden(value)

  @inline def eventDispatcher = extendee.getEventDispatcher
  @inline def eventDispatcher_=(value : EventDispatcher) = extendee.setEventDispatcher(value)
}

class Window extends JFXWindow with WindowExtensions[JFXWindow] { val extendee = this }
