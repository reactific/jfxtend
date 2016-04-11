package com.reactific.jfxtensions.scene

import javafx.scene.effect.BlendMode
import javafx.scene.{Cursor, Scene, Parent, Node}

/** Unit Tests For NodeExtensions */
trait NodeExtensions[NT <: Node] {
  def wrapped: NT

  @inline def parent: Parent = wrapped.getParent

  @inline def scene: Scene = wrapped.getScene

  @inline def userData: Any = wrapped.getUserData

  @inline def userData_=(v: Any) = wrapped.setUserData(v)

  @inline def id: String = wrapped.getId

  @inline def style : String = wrapped.getStyle
  @inline def style_=(s: String) = wrapped.setStyle(s)

  @inline def cursor : Cursor = wrapped.getCursor
  @inline def cursor_=(c: Cursor) = wrapped.setCursor(c)

  @inline def opacity : Double = wrapped.getOpacity
  @inline def opacity_=(o : Double) = wrapped.setOpacity(o)

  @inline def blendMode : BlendMode = wrapped.getBlendMode
  @inline def blendMode_=(bl : BlendMode) = wrapped.setBlendMode(bl)

  @inline def clip : Node = wrapped.getClip
  @inline def clip_=(n : Node) = wrapped.setClip(n)

  @inline def isDisable_=(d: Boolean) = wrapped.setDisable(d)
}
