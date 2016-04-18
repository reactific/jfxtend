package com.reactific.jfxtend.scene

import javafx.scene.image.Image

/** Unit Tests For package */
package object image {

  implicit class ImageJFXtend( val extendee : Image) extends ImageExtensions
}
