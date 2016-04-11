package com.reactific.jfxtensions.scene

import javafx.scene.shape._

/** Unit Tests For package */
package object shape {

  implicit class PathExt(val wrapped: Path) extends PathExtensions
  implicit class SphereExt(val wrapped: Sphere) extends SphereExtensions
  implicit class RectangleExt(val wrapped: Rectangle) extends RectangleExtensions

  implicit class LineExt(val wrapped: Line) extends ShapeExtensions[Line]
  implicit class ShapeExt(val wrapped: Shape) extends ShapeExtensions[Shape]
  implicit class Shape3DExt(val wrapped: Shape3D) extends Shape3DExtensions[Shape3D]
}
