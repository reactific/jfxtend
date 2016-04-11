package com.reactific.jfxtensions.scene.shape

import javafx.scene.shape.{FillRule, Path}

import scalafx.scene.shape.PathElement

/** Unit Tests For PathExtensions */
trait PathExtensions extends ShapeExtensions[Path] {

  @inline def addElement(pe : PathElement) = wrapped.getElements().add(pe)

  @inline def fillRule = wrapped.getFillRule
  @inline def fillRule_=(value : FillRule) = wrapped.setFillRule(value)

}
