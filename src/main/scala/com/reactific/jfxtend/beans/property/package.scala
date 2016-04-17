package com.reactific.jfxtend.beans

import javafx.beans.property.{Property, ObjectProperty}

/** Extensions For Bean Property Classes */
package object property {

  implicit class ObjectPropertyExt[T <: AnyRef](val extendee : ObjectProperty[T]) extends ObjectPropertyExtensions[T]
  implicit class PropertyExt[T <: AnyVal](val extendee : Property[T]) extends PropertyExtensions[T]
}
