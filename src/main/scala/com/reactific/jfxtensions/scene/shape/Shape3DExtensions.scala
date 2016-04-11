package com.reactific.jfxtensions.scene.shape

import javafx.scene.paint.Material
import javafx.scene.shape._

import com.reactific.jfxtensions.scene.NodeExtensions



/** Unit Tests For ShapeExtensions */
trait Shape3DExtensions[ST <: Shape3D] extends NodeExtensions[ST] {

  @inline def material : Material = wrapped.getMaterial
  @inline def material_=(value : Material) = wrapped.setMaterial(value)

  @inline def drawMode : DrawMode = wrapped.getDrawMode
  @inline def drawMode_=(d : DrawMode) = wrapped.setDrawMode(d)

  @inline def cullFace : CullFace = wrapped.getCullFace
  @inline def cullFace_=(cf : CullFace) = wrapped.setCullFace(cf)

}
