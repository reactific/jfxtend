package com.reactific.jfxtensions.beans.property

import javafx.beans.property.{Property, ObjectProperty}
import javafx.beans.value.ObservableValue

/** Unit Tests For ObjectPropertyExtensions */
trait ObjectPropertyExtensions[T <: AnyRef] {
  def wrapped : ObjectProperty[T]

  @inline def value_= (v: T) : Unit = {
    wrapped.setValue(v)
  }

  @inline def value : T = wrapped.getValue

  /** Create a unidirectional binding from this Property to an ObservableValue of corresponding type
    *
    * @param v The observable value to bind to
    */
  @inline def <==(v: ObservableValue[T]) = {
    wrapped.bind(v)
  }

  /**
    * Create a bidirectional binding between this Property and another Property.
    *
    * @param  v the other ScalaFX Property
    */
  @inline def <==>(v: Property[T]) = {
    wrapped.bindBidirectional(v)
  }

}
