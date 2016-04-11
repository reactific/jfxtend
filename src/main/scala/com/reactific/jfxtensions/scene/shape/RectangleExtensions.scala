package com.reactific.jfxtensions.scene.shape

import javafx.scene.shape.{Rectangle ⇒ JFXRectangle}

/** Unit Tests For RectangleExtensions */
trait RectangleExtensions extends ShapeExtensions[JFXRectangle] {

  @inline def x = wrapped.getX
  @inline def x_=(value : Double) = wrapped.setX(value)
  @inline def y = wrapped.getY
  @inline def y_=(value : Double) = wrapped.setY(value)

  @inline def width = wrapped.getWidth
  @inline def width_=(value : Double) = wrapped.setWidth(value)

  @inline def height = wrapped.getHeight
  @inline def height_=(value : Double) = wrapped.setHeight(value)

  @inline def arcWidth = wrapped.getArcWidth
  @inline def arcWidth_=(value : Double) = wrapped.setArcWidth(value)

  @inline def arcHeight = wrapped.getArcHeight
  @inline def arcHeight_=(value : Double) = wrapped.setArcHeight(value)
}

object Rectangle {
  def apply(f : (JFXRectangle) ⇒ Unit ) : JFXRectangle = {
    val r = new JFXRectangle
    f(r)
    r
  }
}
