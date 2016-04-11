package com.reactific.jfxtensions.beans.property

import javafx.beans.property.Property
import javafx.beans.value.ObservableValue

/** Extensions For Generic Non-Object Properties */
trait PropertyExtensions[@specialized(Boolean,Int,Long,Float,Double) T] {
  def wrapped : Property[T]
  @inline def value : T = wrapped.getValue
  @inline def value_=(v: T) = wrapped.setValue(v)

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
