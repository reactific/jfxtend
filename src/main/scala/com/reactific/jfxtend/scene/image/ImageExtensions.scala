package com.reactific.jfxtend.scene.image

import javafx.scene.image.Image

import com.reactific.jfxtend.Extension

/** Unit Tests For ImageExtensions */
trait ImageExtensions extends Extension[Image] {

  def progress : Double = extendee.getProgress
  def requestedWidth : Double = extendee.getRequestedWidth
  def requestedHeight : Double = extendee.getRequestedHeight
  def width : Double = extendee.getWidth
  def height : Double = extendee.getHeight
}

object ImageLoader {
  def fromResource(path : String): Option[Image] = {
    val resourcePath = if (path.startsWith("/")) path else s"/$path"
    Option(path.getClass).flatMap { clazz: Class[_] ⇒
      Option(clazz.getClassLoader).map { cl ⇒
        val stream = cl.getResourceAsStream(resourcePath)
        new Image(stream)
      }
    }
  }
}
