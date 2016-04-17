package com.reactific.jfxtend.scene.shape

import javafx.scene.shape.Line

/** Extensions For JavaFX Line */
trait LineExtensions extends ShapeExtensions[Line] {

  def startX : Double = extendee.getStartX
  def startX_=(value : Double) = extendee.setStartX(value)

  def startY : Double = extendee.getStartY
  def startY_=(value : Double) = extendee.setStartY(value)

  def endX : Double = extendee.getEndX
  def endX_=(value : Double) = extendee.setEndX(value)

  def endY : Double = extendee.getEndY
  def endY_=(value : Double) = extendee.setEndY(value)
}
