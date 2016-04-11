package com.reactific.jfxtensions.beans

import javafx.beans.property.{Property, ObjectProperty}

/** Extensions For Bean Property Classes */
package object property {

  implicit class ObjectPropertyExt[T <: AnyRef](val wrapped : ObjectProperty[T]) extends ObjectPropertyExtensions[T]
  implicit class PropertyExt[T <: AnyVal](val wrapped : Property[T]) extends PropertyExtensions[T]
}
