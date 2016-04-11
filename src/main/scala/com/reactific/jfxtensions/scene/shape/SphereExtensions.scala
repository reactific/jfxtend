package com.reactific.jfxtensions.scene.shape

import javafx.scene.shape.Sphere

/** Extensions To JavaFX Sphere shape */
trait SphereExtensions extends Shape3DExtensions[Sphere] {

  /** Defines the radius of the Sphere. */
  @inline def radius: Double = wrapped.getRadius
  @inline def radius_=(v: Double) = wrapped.setRadius(v)

  @inline def divisions : Int = wrapped.getDivisions

}
