package com.reactific.jfxtend.stage

import javafx.collections.ObservableList
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.input.KeyCombination
import javafx.stage.{Modality, Stage ⇒ JFXStage, Window ⇒ JFXWindow}

/** Extensions To JavaFX Stage */
trait StageExtensions extends WindowExtensions[JFXStage] {
  /**
    * Defines whether this `Stage` is kept on top of other windows.
    */
  @inline def alwaysOnTop_=(value: Boolean) = extendee.setAlwaysOnTop(value)
  @inline def alwaysOnTop : Boolean = extendee.isAlwaysOnTop

  @inline def fullScreenExitHint = extendee.getFullScreenExitHint
  @inline def fullScreenExitHint_=(value: String) = extendee.setFullScreenExitHint(value)

  /**
    * Specifies the Full Screen exit key combination
    */
  @inline def fullScreenExitKey = extendee.getFullScreenExitKeyCombination
  @inline def fullScreenExitKey_=(value: KeyCombination) = extendee.setFullScreenExitKeyCombination(value)

  /**
    * Specifies whether this Stage should be a full-screen, undecorated window.
    */
  @inline def fullScreen_=(value: Boolean) = extendee.setFullScreen(value)
  @inline def fullScreen : Boolean = extendee.isFullScreen

  /**
    * Defines the title of the Stage.
    */
  @inline def title = extendee.getTitle
  @inline def title_=(v: String)  = extendee.setTitle(v)

  /**
    * Gets the icon images to be used in the window decorations and when minimized.
    */
  @inline def icons : ObservableList[Image] = extendee.getIcons

  @inline def iconified_=(value : Boolean) = extendee.setIconified(value)
  @inline def iconified : Boolean = extendee.isIconified

  /**
    * Defines whether the Stage is resizable or not by the user.
    */
  @inline def resizable_=(v: Boolean) = extendee.setResizable(v)
  @inline def resizable : Boolean = extendee.isResizable

  /**
    * Specify the scene to be used on this stage.
    */
  @inline def scene_=(s: Scene) = extendee.setScene(s)

  /**
    * Defines the minimum width of this Stage.
    */
  @inline def minWidth: Double = extendee.getMinWidth
  @inline def minWidth_=(w: Double) = extendee.setMinWidth(w)

  /**
    * Defines the minimum height of this Stage.
    */
  @inline def minHeight: Double = extendee.getMinHeight
  @inline def minHeight_=(h: Double) = extendee.setMinHeight(h)

  /**
    * Defines the maximum width of this Stage.
    */
  @inline def maxWidth: Double = extendee.getMaxWidth
  @inline def maxWidth_=(w: Double) = extendee.setMaxWidth(w)

  /**
    * Defines the maximum height of this Stage.
    */
  @inline def maxHeight: Double = extendee.getMaxHeight
  @inline def maxHeight_=(h: Double) = extendee.setMaxHeight(h)

  /**
    * Attempts to show or hide this Window.
    */
  @inline def showing_=(value: Boolean) = {
    if (value)
      extendee.show()
    else
      extendee.hide()
  }
  @inline def showing : Boolean = extendee.isShowing

  /**
    * Retrieves the style attribute for this stage.
    */
  @inline def style = extendee.getStyle

  /**
    * Retrieves the modality attribute for this stage.
    */
  @inline def modality: Modality = extendee.getModality

  /**
    * Retrieves the owner Window for this stage, or [[scala.None]] for an unowned stage.
    */
  @inline def owner: Option[JFXWindow] = Option(extendee.getOwner)

}
