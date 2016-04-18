package com.reactific.jfxtend.geometry

import javafx.geometry.Rectangle2D

import com.reactific.jfxtend.Extension

/** Unit Tests For Rectangle2D */
trait Rectangle2DExtensions extends Extension[Rectangle2D] {

  def minX : Double = extendee.getMinX
  def minY: Double = extendee.getMinY
  def width: Double = extendee.getWidth
  def height: Double = extendee.getHeight
  def maxX : Double = extendee.getMaxX
  def maxY : Double = extendee.getMaxY
}
