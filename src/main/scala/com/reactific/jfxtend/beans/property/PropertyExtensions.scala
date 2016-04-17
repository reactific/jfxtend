package com.reactific.jfxtend.beans.property

import javafx.beans.property.Property
import javafx.beans.value.ObservableValue

/** Extensions For Generic Non-Object Properties */
trait PropertyExtensions[@specialized(Boolean,Int,Long,Float,Double) T] {

  def extendee : Property[T]

  @inline def value : T = extendee.getValue
  @inline def value_=(v: T) = extendee.setValue(v)

  /** Create a unidirectional binding from this Property to an ObservableValue of corresponding type
    *
    * @param v The observable value to bind to
    */
  @inline def <==(v: ObservableValue[T]) = {
    extendee.bind(v)
  }

  /**
    * Create a bidirectional binding between this Property and another Property.
    *
    * @param  v the other ScalaFX Property
    */
  @inline def <==>(v: Property[T]) = {
    extendee.bindBidirectional(v)
  }
}
