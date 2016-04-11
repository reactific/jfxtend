package com.reactific.jfxtensions.stage

import javafx.scene.Scene
import javafx.scene.input.KeyCombination
import javafx.stage.{Window, Modality, Stage}

/** Extensions To JavaFX Stage */
trait StageExtensions extends WindowExtensions[Stage] {
  /**
    * Defines whether this `Stage` is kept on top of other windows.
    */
  @inline def isAlwaysOnTop_=(value: Boolean) = wrapped.setAlwaysOnTop(value)

  @inline def fullScreenExitHint = wrapped.getFullScreenExitHint
  @inline def fullScreenExitHint_=(value: String) = wrapped.setFullScreenExitHint(value)

  /**
    * Specifies the Full Screen exit key combination
    */
  @inline def fullScreenExitKey = wrapped.getFullScreenExitKeyCombination
  @inline def fullScreenExitKey_=(value: KeyCombination) = wrapped.setFullScreenExitKeyCombination(value)

  /**
    * Specifies whether this Stage should be a full-screen, undecorated window.
    */
  @inline def isFullScreen_=(value: Boolean) = wrapped.setFullScreen(value)

  /**
    * Defines the title of the Stage.
    */
  @inline def title = wrapped.getTitle
  @inline def title_=(v: String)  = wrapped.setTitle(v)

  /**
    * Gets the icon images to be used in the window decorations and when minimized.
    */
  @inline def icons = wrapped.getIcons

  @inline def isIconified_=(value : Boolean) = wrapped.setIconified(value)

  /**
    * Defines whether the Stage is resizable or not by the user.
    */
  @inline def isResizable_=(v: Boolean) = wrapped.setResizable(v)

  /**
    * Specify the scene to be used on this stage.
    */
  @inline def scene_=(s: Scene) = wrapped.setScene(s)

  /**
    * Defines the minimum width of this Stage.
    */
  @inline def minWidth: Double = wrapped.getMinWidth
  @inline def minWidth_=(w: Double) = wrapped.setMinWidth(w)

  /**
    * Defines the minimum height of this Stage.
    */
  @inline def minHeight: Double = wrapped.getMinHeight
  @inline def minHeight_=(h: Double) = wrapped.setMinHeight(h)

  /**
    * Defines the maximum width of this Stage.
    */
  @inline def maxWidth: Double = wrapped.getMaxWidth
  @inline def maxWidth_=(w: Double) = wrapped.setMaxWidth(w)

  /**
    * Defines the maximum height of this Stage.
    */
  @inline def maxHeight: Double = wrapped.getMaxHeight
  @inline def maxHeight_=(h: Double) = wrapped.setMaxHeight(h)

  /**
    * Attempts to show or hide this Window.
    */
  @inline def isShowing_=(value: Boolean) = {
    if (value)
      wrapped.show()
    else
      wrapped.hide()
  }

  /**
    * Retrieves the style attribute for this stage.
    */
  @inline def style = wrapped.getStyle

  /**
    * Retrieves the modality attribute for this stage.
    */
  @inline def modality: Modality = wrapped.getModality

  /**
    * Retrieves the owner Window for this stage, or [[scala.None]] for an unowned stage.
    */
  @inline def owner: Option[Window] = Option(wrapped.getOwner)

}
