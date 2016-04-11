package com.reactific.jfxtensions.scene.shape

import javafx.collections.ObservableList
import javafx.scene.paint.Paint
import javafx.scene.shape.{StrokeType, StrokeLineCap, StrokeLineJoin, Shape}

import com.reactific.jfxtensions.scene.NodeExtensions

import scala.collection.JavaConverters._


/** Unit Tests For ShapeExtensions */
trait ShapeExtensions[ST <: Shape] extends NodeExtensions[ST] {

  /**
    * Defines parameters to fill the interior of an Shape using the settings of the Paint context.
    */
  @inline def fill: Paint = wrapped.getFill
  @inline def fill_=(v: Paint) = wrapped.setFill(v)

  /**
    * Defines whether anti-aliasing hints are used or not for this Shape.
    */
  @inline def isSmooth_= (v: Boolean) = wrapped.setSmooth(v)

  /**
    * Defines a distance specified in user coordinates that represents an offset into the dashing pattern.
    */
  @inline def strokeDashOffset: Double = wrapped.getStrokeDashOffset
  @inline def strokeDashOffset_=(v: Double)  = wrapped.setStrokeDashOffset(v)

  /**
    * The end cap style of this Shape as one of the following values that define possible end cap styles:
    * `StrokeLineCap.BUTT`, `StrokeLineCap.ROUND`, and `StrokeLineCap.SQUARE`.
    */
  @inline def strokeLineCap: StrokeLineCap = wrapped.getStrokeLineCap
  @inline def strokeLineCap_=(v: StrokeLineCap) = wrapped.setStrokeLineCap(v)

  /**
    * Defines the decoration applied where path segments meet.
    */
  @inline def strokeLineJoin: StrokeLineJoin = wrapped.getStrokeLineJoin
  @inline def strokeLineJoin_=(v: StrokeLineJoin) = wrapped.setStrokeLineJoin(v)

  /**
    * Defines the limit for the `StrokeLineJoin.MITER` line join style.
    */
  @inline def strokeMiterLimit= wrapped.getStrokeMiterLimit
  @inline def strokeMiterLimit_=(v: Double) = wrapped.setStrokeMiterLimit(v)

  /**
    * Defines parameters of a stroke that is drawn around the outline of a Shape using the settings of the specified
    * Paint.
    */
  @inline def stroke: Paint = wrapped.getStroke
  @inline def stroke_=(v: Paint) = wrapped.setStroke(v)

  /**
    * Defines the direction (inside, centered, or outside) that the strokeWidth is applied to the boundary of the shape.
    */
  @inline def strokeType: StrokeType = wrapped.getStrokeType
  @inline def strokeType_=(v: StrokeType) = wrapped.setStrokeType(v)

  /**
    * Defines a square pen line width.
    */
  @inline def strokeWidth: Double = wrapped.getStrokeWidth
  @inline def strokeWidth_=(v: Double) = wrapped.setStrokeWidth(v)

  /**
    * Defines the array representing the lengths of the dash segments.
    */
  @inline def strokeDashArray: ObservableList[java.lang.Double] = wrapped.getStrokeDashArray

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
