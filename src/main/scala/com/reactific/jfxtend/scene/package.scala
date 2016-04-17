package com.reactific.jfxtend

import javafx.scene.{Node, Scene}

/** Scene Package */
package object scene {

  implicit class SceneExt(val extendee : Scene) extends SceneExtensions
  implicit class NodeExt(val extendee : Node) extends NodeExtensions[Node]

}
