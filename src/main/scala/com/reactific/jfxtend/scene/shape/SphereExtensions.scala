package com.reactific.jfxtend.scene.shape

import javafx.scene.shape.Sphere

/** Extensions To JavaFX Sphere shape */
trait SphereExtensions extends Shape3DExtensions[Sphere] {

  /** Defines the radius of the Sphere. */
  @inline def radius: Double = extendee.getRadius
  @inline def radius_=(v: Double) = extendee.setRadius(v)

  @inline def divisions : Int = extendee.getDivisions

}
