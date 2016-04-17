package com.reactific.jfxtend.scene

import javafx.event.EventHandler
import javafx.scene.effect.BlendMode
import javafx.scene.input._
import javafx.scene.{Cursor, Scene, Parent, Node}

import com.reactific.jfxtend.Extension


/** Unit Tests For NodeExtensions */
trait NodeExtensions[NT <: Node] extends Extension[NT] {
  def extendee: NT

  @inline def parent: Parent = extendee.getParent

  @inline def scene: Scene = extendee.getScene

  @inline def userData: Any = extendee.getUserData

  @inline def userData_=(v: Any) = extendee.setUserData(v)

  @inline def id: String = extendee.getId

  @inline def style : String = extendee.getStyle
  @inline def style_=(s: String) = extendee.setStyle(s)

  @inline def cursor : Cursor = extendee.getCursor
  @inline def cursor_=(c: Cursor) = extendee.setCursor(c)

  @inline def opacity : Double = extendee.getOpacity
  @inline def opacity_=(o : Double) = extendee.setOpacity(o)

  @inline def blendMode : BlendMode = extendee.getBlendMode
  @inline def blendMode_=(bl : BlendMode) = extendee.setBlendMode(bl)

  @inline def clip : Node = extendee.getClip
  @inline def clip_=(n : Node) = extendee.setClip(n)

  @inline def isDisable_=(d: Boolean) = extendee.setDisable(d)

  @inline def onContextMenuRequested = extendee.getOnContextMenuRequested
  @inline def onContextMenuRequested_=(value : EventHandler[_ >: ContextMenuEvent]) = {
    extendee.setOnContextMenuRequested(value)
  }

  @inline def onMouseClicked = extendee.getOnMouseClicked
  @inline def onMouseClicked_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseClicked(value)
  }

  @inline def onMouseDragged = extendee.getOnMouseDragged
  @inline def onMouseDragged_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseDragged(value)
  }

  @inline def onMouseEntered = extendee.getOnMouseEntered
  @inline def onMouseEntered_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseEntered(value)
  }

  @inline def onMouseExited = extendee.getOnMouseExited
  @inline def onMouseExited_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseExited(value)
  }

  @inline def onMouseMoved = extendee.getOnMouseMoved
  @inline def onMouseMoved_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseMoved(value)
  }

  @inline def onMousePressed = extendee.getOnMousePressed
  @inline def onMousePressed_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMousePressed(value)
  }

  @inline def onMouseReleased = extendee.getOnMouseReleased
  @inline def onMouseReleased_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseReleased(value)
  }

  @inline def onDragDetected = extendee.getOnDragDetected
  @inline def onDragDetected_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnDragDetected(value)
  }

  @inline def onMouseDragOver = extendee.getOnMouseDragOver
  @inline def onMouseDragOver_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseDragOver(value)
  }

  @inline def onMouseDragReleased = extendee.getOnMouseDragReleased
  @inline def onMouseDragReleased_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseDragReleased(value)
  }

  @inline def onMouseDragEntered = extendee.getOnMouseDragEntered
  @inline def onMouseDragEntered_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseDragEntered(value)
  }

  @inline def onMouseDragExited = extendee.getOnMouseDragExited
  @inline def onMouseDragExited_=(value : EventHandler[_ >: MouseEvent]) = {
    extendee.setOnMouseDragExited(value)
  }

  @inline def onScrollStarted = extendee.getOnScrollStarted
  @inline def onScrollStarted_=(value : EventHandler[_ >: ScrollEvent]) = {
    extendee.setOnScrollStarted(value)
  }

  @inline def onScroll = extendee.getOnScroll
  @inline def onScroll_=(value : EventHandler[_ >: ScrollEvent]) = {
    extendee.setOnScroll(value)
  }

  @inline def onScrollFinished = extendee.getOnScrollFinished
  @inline def onScrollFinished_=(value : EventHandler[_ >: ScrollEvent]) = {
    extendee.setOnScrollFinished(value)
  }

  @inline def onRotationStarted = extendee.getOnRotationStarted
  @inline def onRotationStarted_=(value : EventHandler[_ >: RotateEvent]) = {
    extendee.setOnRotationStarted(value)
  }

  @inline def onRotate = extendee.getOnRotate
  @inline def onRotate_=(value : EventHandler[_ >: RotateEvent]) = {
    extendee.setOnRotate(value)
  }

  @inline def onRotationFinished = extendee.getOnRotationFinished
  @inline def onRotationFinished_=(value : EventHandler[_ >: RotateEvent]) = {
    extendee.setOnRotationFinished(value)
  }

  @inline def onZoomStarted = extendee.getOnZoomStarted
  @inline def onZoomStarted_=(value : EventHandler[_ >: ZoomEvent]) = {
    extendee.setOnZoomStarted(value)
  }

  @inline def onZoom = extendee.getOnZoom
  @inline def onZoom_=(value : EventHandler[_ >: ZoomEvent]) = {
    extendee.setOnZoom(value)
  }

  @inline def onZoomFinished = extendee.getOnZoomFinished
  @inline def onZoomFinished_=(value : EventHandler[_ >: ZoomEvent]) = {
    extendee.setOnZoomFinished(value)
  }

  @inline def onSwipeUp = extendee.getOnSwipeUp
  @inline def onSwipeUp_=(value : EventHandler[_ >: SwipeEvent]) = {
    extendee.setOnSwipeUp(value)
  }

  @inline def onSwipeDown = extendee.getOnSwipeDown
  @inline def onSwipeDown_=(value : EventHandler[_ >: SwipeEvent]) = {
    extendee.setOnSwipeDown(value)
  }

  @inline def onSwipeLeft = extendee.getOnSwipeLeft
  @inline def onSwipeLeft_=(value : EventHandler[_ >: SwipeEvent]) = {
    extendee.setOnSwipeLeft(value)
  }

  @inline def onSwipeRight = extendee.getOnSwipeRight
  @inline def onSwipeRight_=(value : EventHandler[_ >: SwipeEvent]) = {
    extendee.setOnSwipeRight(value)
  }

  @inline def onTouchPressed = extendee.getOnTouchPressed
  @inline def onTouchPressed_=(value : EventHandler[_ >: TouchEvent]) = {
    extendee.setOnTouchPressed(value)
  }

  @inline def onTouchMoved = extendee.getOnTouchMoved
  @inline def onTouchMoved_=(value : EventHandler[_ >: TouchEvent]) = {
    extendee.setOnTouchMoved(value)
  }

  @inline def onTouchReleased = extendee.getOnTouchReleased
  @inline def onTouchReleased_=(value : EventHandler[_ >: TouchEvent]) = {
    extendee.setOnTouchReleased(value)
  }

  @inline def onTouchStationary = extendee.getOnTouchStationary
  @inline def onTouchStationary_=(value : EventHandler[_ >: TouchEvent]) = {
    extendee.setOnTouchStationary(value)
  }

  @inline def onDragEntered = extendee.getOnDragEntered
  @inline def onDragEntered_=(value : EventHandler[_ >: DragEvent]) = {
    extendee.setOnDragEntered(value)
  }

  @inline def onDragExited = extendee.getOnDragExited
  @inline def onDragExited_=(value : EventHandler[_ >: DragEvent]) = {
    extendee.setOnDragExited(value)
  }

  @inline def onDragOver = extendee.getOnDragOver
  @inline def onDragOver_=(value : EventHandler[_ >: DragEvent]) = {
    extendee.setOnDragOver(value)
  }

  @inline def onDragDropped = extendee.getOnDragDropped
  @inline def onDragDropped_=(value : EventHandler[_ >: DragEvent]) = {
    extendee.setOnDragDropped(value)
  }

  @inline def onDragDone = extendee.getOnDragDone
  @inline def onDragDone_=(value : EventHandler[_ >: DragEvent]) = {
    extendee.setOnDragDone(value)
  }

  @inline def onKeyPressed = extendee.getOnKeyPressed
  @inline def onKeyPressed_=(value : EventHandler[_ >: KeyEvent]) = {
    extendee.setOnKeyPressed(value)
  }

  @inline def onKeyReleased = extendee.getOnKeyReleased
  @inline def onKeyReleased_=(value : EventHandler[_ >: KeyEvent]) = {
    extendee.setOnKeyReleased(value)
  }

  @inline def onKeyTyped = extendee.getOnKeyTyped
  @inline def onKeyTyped_=(value : EventHandler[_ >: KeyEvent]) = {
    extendee.setOnKeyTyped(value)
  }

  @inline def onInputMethodTextChanged = extendee.getOnInputMethodTextChanged
  @inline def onInputMethodTextChanged_=(value : EventHandler[_ >: InputMethodEvent]) = {
    extendee.setOnInputMethodTextChanged(value)
  }
}
