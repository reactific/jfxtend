package com.reactific.jfxtend.scene.shape

import javafx.scene.shape.{FillRule, Path}
import javafx.scene.shape.PathElement

/** Extensions to JavaFX Path */
trait PathExtensions extends ShapeExtensions[Path] {

  @inline def addElement(pe : PathElement) = extendee.getElements.add(pe)

  @inline def fillRule = extendee.getFillRule
  @inline def fillRule_=(value : FillRule) = extendee.setFillRule(value)

}
