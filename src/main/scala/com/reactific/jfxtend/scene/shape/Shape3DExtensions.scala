package com.reactific.jfxtend.scene.shape

import javafx.scene.paint.Material
import javafx.scene.shape._

import com.reactific.jfxtend.scene.NodeExtensions



/** Unit Tests For ShapeExtensions */
trait Shape3DExtensions[ST <: Shape3D] extends NodeExtensions[ST] {

  @inline def material : Material = extendee.getMaterial
  @inline def material_=(value : Material) = extendee.setMaterial(value)

  @inline def drawMode : DrawMode = extendee.getDrawMode
  @inline def drawMode_=(d : DrawMode) = extendee.setDrawMode(d)

  @inline def cullFace : CullFace = extendee.getCullFace
  @inline def cullFace_=(cf : CullFace) = extendee.setCullFace(cf)

}
