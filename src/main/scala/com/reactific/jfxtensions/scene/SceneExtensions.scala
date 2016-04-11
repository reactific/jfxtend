package com.reactific.jfxtensions.scene


import javafx.beans.property.ObjectProperty
import javafx.collections.{FXCollections, ObservableList}
import javafx.event.EventHandler
import javafx.geometry.NodeOrientation
import javafx.scene.input._
import javafx.scene.paint.Paint
import javafx.scene._
import javafx.stage.Window

import com.reactific.jfxtensions.beans.property._

trait SceneExtensions {
  def wrapped : Scene

  @inline def window : Window = wrapped.getWindow

  /**
    * Returns the root Node of the scene graph
    */
  @inline def root: ObjectProperty[Parent] = wrapped.rootProperty

  /**
    * Sets the root Node of the scene graph
    */
  @inline def root_=(v: Parent) : Unit = {
    wrapped.rootProperty().value = v
  }

  def children : ObservableList[Node] = root.value match {
    case group: javafx.scene.Group ⇒ group.getChildren
    case pane : javafx.scene.layout.Pane ⇒ pane.getChildren
    case _ ⇒  FXCollections.emptyObservableList[Node]
  }

  @inline def x : Double = wrapped.getX
  @inline def y : Double = wrapped.getY
  @inline def width : Double = wrapped.getWidth
  @inline def height : Double = wrapped.getHeight

  @inline def camera : Camera = wrapped.getCamera
  @inline def camera_=(value : Camera) = wrapped.setCamera(value)

  @inline def fill : Paint = wrapped.getFill
  @inline def fill_=(value : Paint) = wrapped.setFill(value)

  @inline def cursor : Cursor = wrapped.getCursor
  @inline def cursor_=(value : Cursor) = wrapped.setCursor(value)

  @inline def styleSheets = wrapped.getStylesheets
  @inline def userAgentStyleSheet = wrapped.getUserAgentStylesheet
  @inline def userAgentStyleSheet_=(value : String) = wrapped.setUserAgentStylesheet(value)

  @inline def focusOwner = wrapped.getFocusOwner

  @inline def onContextMenuRequested = wrapped.getOnContextMenuRequested
  @inline def onContextMenuRequested_=(value : EventHandler[_ >: ContextMenuEvent]) = {
    wrapped.setOnContextMenuRequested(value)
  }

  @inline def onMouseClicked = wrapped.getOnMouseClicked
  @inline def onMouseClicked_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseClicked(value)
  }

  @inline def onMouseDragged = wrapped.getOnMouseDragged
  @inline def onMouseDragged_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseDragged(value)
  }

  @inline def onMouseEntered = wrapped.getOnMouseEntered
  @inline def onMouseEntered_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseEntered(value)
  }

  @inline def onMouseExited = wrapped.getOnMouseExited
  @inline def onMouseExited_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseExited(value)
  }

  @inline def onMouseMoved = wrapped.getOnMouseMoved
  @inline def onMouseMoved_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseMoved(value)
  }

  @inline def onMousePressed = wrapped.getOnMousePressed
  @inline def onMousePressed_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMousePressed(value)
  }

  @inline def onMouseReleased = wrapped.getOnMouseReleased
  @inline def onMouseReleased_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseReleased(value)
  }

  @inline def onDragDetected = wrapped.getOnDragDetected
  @inline def onDragDetected_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnDragDetected(value)
  }

  @inline def onMouseDragOver = wrapped.getOnMouseDragOver
  @inline def onMouseDragOver_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseDragOver(value)
  }

  @inline def onMouseDragReleased = wrapped.getOnMouseDragReleased
  @inline def onMouseDragReleased_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseDragReleased(value)
  }

  @inline def onMouseDragEntered = wrapped.getOnMouseDragEntered
  @inline def onMouseDragEntered_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseDragEntered(value)
  }

  @inline def onMouseDragExited = wrapped.getOnMouseDragExited
  @inline def onMouseDragExited_=(value : EventHandler[_ >: MouseEvent]) = {
    wrapped.setOnMouseDragExited(value)
  }

  @inline def onScrollStarted = wrapped.getOnScrollStarted
  @inline def onScrollStarted_=(value : EventHandler[_ >: ScrollEvent]) = {
    wrapped.setOnScrollStarted(value)
  }

  @inline def onScroll = wrapped.getOnScroll
  @inline def onScroll_=(value : EventHandler[_ >: ScrollEvent]) = {
    wrapped.setOnScroll(value)
  }

  @inline def onScrollFinished = wrapped.getOnScrollFinished
  @inline def onScrollFinished_=(value : EventHandler[_ >: ScrollEvent]) = {
    wrapped.setOnScrollFinished(value)
  }

  @inline def onRotationStarted = wrapped.getOnRotationStarted
  @inline def onRotationStarted_=(value : EventHandler[_ >: RotateEvent]) = {
    wrapped.setOnRotationStarted(value)
  }

  @inline def onRotate = wrapped.getOnRotate
  @inline def onRotate_=(value : EventHandler[_ >: RotateEvent]) = {
    wrapped.setOnRotate(value)
  }

  @inline def onRotationFinished = wrapped.getOnRotationFinished
  @inline def onRotationFinished_=(value : EventHandler[_ >: RotateEvent]) = {
    wrapped.setOnRotationFinished(value)
  }

  @inline def onZoomStarted = wrapped.getOnZoomStarted
  @inline def onZoomStarted_=(value : EventHandler[_ >: ZoomEvent]) = {
    wrapped.setOnZoomStarted(value)
  }

  @inline def onZoom = wrapped.getOnZoom
  @inline def onZoom_=(value : EventHandler[_ >: ZoomEvent]) = {
    wrapped.setOnZoom(value)
  }

  @inline def onZoomFinished = wrapped.getOnZoomFinished
  @inline def onZoomFinished_=(value : EventHandler[_ >: ZoomEvent]) = {
    wrapped.setOnZoomFinished(value)
  }

  @inline def onSwipeUp = wrapped.getOnSwipeUp
  @inline def onSwipeUp_=(value : EventHandler[_ >: SwipeEvent]) = {
    wrapped.setOnSwipeUp(value)
  }

  @inline def onSwipeDown = wrapped.getOnSwipeDown
  @inline def onSwipeDown_=(value : EventHandler[_ >: SwipeEvent]) = {
    wrapped.setOnSwipeDown(value)
  }

  @inline def onSwipeLeft = wrapped.getOnSwipeLeft
  @inline def onSwipeLeft_=(value : EventHandler[_ >: SwipeEvent]) = {
    wrapped.setOnSwipeLeft(value)
  }

  @inline def onSwipeRight = wrapped.getOnSwipeRight
  @inline def onSwipeRight_=(value : EventHandler[_ >: SwipeEvent]) = {
    wrapped.setOnSwipeRight(value)
  }

  @inline def onTouchPressed = wrapped.getOnTouchPressed
  @inline def onTouchPressed_=(value : EventHandler[_ >: TouchEvent]) = {
    wrapped.setOnTouchPressed(value)
  }

  @inline def onTouchMoved = wrapped.getOnTouchMoved
  @inline def onTouchMoved_=(value : EventHandler[_ >: TouchEvent]) = {
    wrapped.setOnTouchMoved(value)
  }

  @inline def onTouchReleased = wrapped.getOnTouchReleased
  @inline def onTouchReleased_=(value : EventHandler[_ >: TouchEvent]) = {
    wrapped.setOnTouchReleased(value)
  }

  @inline def onTouchStationary = wrapped.getOnTouchStationary
  @inline def onTouchStationary_=(value : EventHandler[_ >: TouchEvent]) = {
    wrapped.setOnTouchStationary(value)
  }

  @inline def onDragEntered = wrapped.getOnDragEntered
  @inline def onDragEntered_=(value : EventHandler[_ >: DragEvent]) = {
    wrapped.setOnDragEntered(value)
  }

  @inline def onDragExited = wrapped.getOnDragExited
  @inline def onDragExited_=(value : EventHandler[_ >: DragEvent]) = {
    wrapped.setOnDragExited(value)
  }

  @inline def onDragOver = wrapped.getOnDragOver
  @inline def onDragOver_=(value : EventHandler[_ >: DragEvent]) = {
    wrapped.setOnDragOver(value)
  }

  @inline def onDragDropped = wrapped.getOnDragDropped
  @inline def onDragDropped_=(value : EventHandler[_ >: DragEvent]) = {
    wrapped.setOnDragDropped(value)
  }

  @inline def onDragDone = wrapped.getOnDragDone
  @inline def onDragDone_=(value : EventHandler[_ >: DragEvent]) = {
    wrapped.setOnDragDone(value)
  }

  @inline def onKeyPressed = wrapped.getOnKeyPressed
  @inline def onKeyPressed_=(value : EventHandler[_ >: KeyEvent]) = {
    wrapped.setOnKeyPressed(value)
  }

  @inline def onKeyReleased = wrapped.getOnKeyReleased
  @inline def onKeyReleased_=(value : EventHandler[_ >: KeyEvent]) = {
    wrapped.setOnKeyReleased(value)
  }

  @inline def onKeyTyped = wrapped.getOnKeyTyped
  @inline def onKeyTyped_=(value : EventHandler[_ >: KeyEvent]) = {
    wrapped.setOnKeyTyped(value)
  }

  @inline def onInputMethodTextChanged = wrapped.getOnInputMethodTextChanged
  @inline def onInputMethodTextChanged_=(value : EventHandler[_ >: InputMethodEvent]) = {
    wrapped.setOnInputMethodTextChanged(value)
  }

  @inline def properties = wrapped.getProperties

  @inline def userData = wrapped.getUserData
  @inline def userData_=(value : AnyRef) = wrapped.setUserData(value)

  @inline def nodeOrientation = wrapped.getNodeOrientation
  @inline def nodeOrientation_=(value : NodeOrientation) = wrapped.setNodeOrientation(value)

  @inline def effectiveNodeOrientation = wrapped.getEffectiveNodeOrientation

}
