package com.reactific.jfxtend

import javafx.geometry.Rectangle2D

/** Unit Tests For package */
package object geometry {

  implicit class Rectangle2DJFXtend( val extendee : Rectangle2D) extends Rectangle2DExtensions
}
