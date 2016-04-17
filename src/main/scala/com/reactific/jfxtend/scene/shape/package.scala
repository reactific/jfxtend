package com.reactific.jfxtend.scene

import javafx.scene.shape._
import javafx.scene.shape.Path

/** Unit Tests For package */
package object shape {

  implicit class LineExt(val extendee: Line) extends LineExtensions
  implicit class RectangleExt(val extendee: Rectangle) extends RectangleExtensions
  implicit class SphereExt(val extendee: Sphere) extends SphereExtensions
  implicit class PathExt(val extendee: Path) extends PathExtensions

  implicit class ShapeExt(val extendee: Shape) extends ShapeExtensions[Shape]
  implicit class Shape3DExt(val extendee: Shape3D) extends Shape3DExtensions[Shape3D]
}
