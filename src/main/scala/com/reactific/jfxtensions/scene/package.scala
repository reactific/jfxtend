package com.reactific.jfxtensions

import javafx.scene.{Node, Scene}

/** Scene Package */
package object scene {

  implicit class SceneExt(val wrapped : Scene) extends SceneExtensions
  implicit class NodeExt(val wrapped : Node) extends NodeExtensions[Node]

}
