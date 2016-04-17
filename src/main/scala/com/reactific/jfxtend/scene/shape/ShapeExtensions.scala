package com.reactific.jfxtend.scene.shape

import javafx.collections.ObservableList
import javafx.scene.paint.Paint
import javafx.scene.shape.{StrokeType, StrokeLineCap, StrokeLineJoin, Shape}

import com.reactific.jfxtend.scene.NodeExtensions

import scala.collection.JavaConverters._


/** Unit Tests For ShapeExtensions */
trait ShapeExtensions[ST <: Shape] extends NodeExtensions[ST] {

  /**
    * Defines parameters to fill the interior of an Shape using the settings of the Paint context.
    */
  @inline def fill: Paint = extendee.getFill
  @inline def fill_=(v: Paint) = extendee.setFill(v)

  /**
    * Defines whether anti-aliasing hints are used or not for this Shape.
    */
  @inline def isSmooth_= (v: Boolean) = extendee.setSmooth(v)

  /**
    * Defines a distance specified in user coordinates that represents an offset into the dashing pattern.
    */
  @inline def strokeDashOffset: Double = extendee.getStrokeDashOffset
  @inline def strokeDashOffset_=(v: Double)  = extendee.setStrokeDashOffset(v)

  /**
    * The end cap style of this Shape as one of the following values that define possible end cap styles:
    * `StrokeLineCap.BUTT`, `StrokeLineCap.ROUND`, and `StrokeLineCap.SQUARE`.
    */
  @inline def strokeLineCap: StrokeLineCap = extendee.getStrokeLineCap
  @inline def strokeLineCap_=(v: StrokeLineCap) = extendee.setStrokeLineCap(v)

  /**
    * Defines the decoration applied where path segments meet.
    */
  @inline def strokeLineJoin: StrokeLineJoin = extendee.getStrokeLineJoin
  @inline def strokeLineJoin_=(v: StrokeLineJoin) = extendee.setStrokeLineJoin(v)

  /**
    * Defines the limit for the `StrokeLineJoin.MITER` line join style.
    */
  @inline def strokeMiterLimit= extendee.getStrokeMiterLimit
  @inline def strokeMiterLimit_=(v: Double) = extendee.setStrokeMiterLimit(v)

  /**
    * Defines parameters of a stroke that is drawn around the outline of a Shape using the settings of the specified
    * Paint.
    */
  @inline def stroke: Paint = extendee.getStroke
  @inline def stroke_=(v: Paint) = extendee.setStroke(v)

  /**
    * Defines the direction (inside, centered, or outside) that the strokeWidth is applied to the boundary of the shape.
    */
  @inline def strokeType: StrokeType = extendee.getStrokeType
  @inline def strokeType_=(v: StrokeType) = extendee.setStrokeType(v)

  /**
    * Defines a square pen line width.
    */
  @inline def strokeWidth: Double = extendee.getStrokeWidth
  @inline def strokeWidth_=(v: Double) = extendee.setStrokeWidth(v)

  /**
    * Defines the array representing the lengths of the dash segments.
    */
  @inline def strokeDashArray: ObservableList[java.lang.Double] = extendee.getStrokeDashArray

  /**
    * Sets the list of lengths of the dash segments, replacing the prior content. If you want append to current
    * content, use `+==` or similar.
    *
    * @param c List of lengths of the dash segments to replace prior content.
    */
  @inline def strokeDashArray_=(c: Iterable[java.lang.Double]) = {
    Option(c) match {
      case Some(v) ⇒
        strokeDashArray.setAll(v.asJavaCollection)
      case None ⇒
        strokeDashArray.clear()
    }
  }
}
