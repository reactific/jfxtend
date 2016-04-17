package com.reactific.jfxtend.scene.shape

import javafx.scene.shape.Rectangle

/** Unit Tests For RectangleExtensions */
trait RectangleExtensions extends ShapeExtensions[Rectangle] {
  @inline def x = extendee.getX
  @inline def x_=(value : Double) = extendee.setX(value)

  @inline def y = extendee.getY
  @inline def y_=(value : Double) = extendee.setY(value)

  @inline def width = extendee.getWidth
  @inline def width_=(value : Double) = extendee.setWidth(value)

  @inline def height = extendee.getHeight
  @inline def height_=(value : Double) = extendee.setHeight(value)

  @inline def arcWidth = extendee.getArcWidth
  @inline def arcWidth_=(value : Double) = extendee.setArcWidth(value)

  @inline def arcHeight = extendee.getArcHeight
  @inline def arcHeight_=(value : Double) = extendee.setArcHeight(value)
}
