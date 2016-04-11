package com.reactific.jfxtensions


import javafx.application.{ConditionalFeature, Platform}

/** Computes capabilities of the platform */
class Capabilities {

  protected object info {
    val os = System.getProperty("os.name")
    val arch = System.getProperty("os.arch")

    val WINDOWS = os.startsWith("Windows")
    val MAC = os.startsWith("Mac")
    val LINUX = os.startsWith("Linux")
    val ANDROID =
      "android".equals(System.getProperty("javafx.platform")) ||
      "Dalvik".equals(System.getProperty("java.vm.name"))
    val IOS = os.startsWith("iOS")
    val DESKTOP = WINDOWS || MAC || LINUX
    val EMBEDDED = "arm".equals(arch) && !IOS && !ANDROID
    val SUPPORTS_BENDING_PAGES = !EMBEDDED
    val HAS_HELVETICA = MAC || IOS
    val USE_IOS_THEME = IOS
    val START_FULL_SCREEN = EMBEDDED || IOS || ANDROID
  }

  def shouldStartFullScreen = info.START_FULL_SCREEN
  def isDesktop = info.DESKTOP
  def isEmbedded = info.EMBEDDED
  def hasHelvetica = info.HAS_HELVETICA
  def hasBendingPages = info.SUPPORTS_BENDING_PAGES
  def hasControls = Platform.isSupported(ConditionalFeature.CONTROLS)
  def hasGraphics = Platform.isSupported(ConditionalFeature.GRAPHICS)
  def hasEffect = Platform.isSupported(ConditionalFeature.EFFECT)
  def hasFXML = Platform.isSupported(ConditionalFeature.FXML)
  def hasInputMethod = Platform.isSupported(ConditionalFeature.INPUT_METHOD)
  def hasInputMultitouch = Platform.isSupported(ConditionalFeature.INPUT_MULTITOUCH)
  def hasInputPointer = Platform.isSupported(ConditionalFeature.INPUT_POINTER)
  def hasInputTouch = Platform.isSupported(ConditionalFeature.INPUT_TOUCH)
  def hasMedia = Platform.isSupported(ConditionalFeature.MEDIA)
  def hasScene3D = Platform.isSupported(ConditionalFeature.SCENE3D)
  def hasShapeClip = Platform.isSupported(ConditionalFeature.SHAPE_CLIP)
  def hasSwing = Platform.isSupported(ConditionalFeature.SWING)
  def hasSWT = Platform.isSupported(ConditionalFeature.SWT)
  def hasTransparentWindow = Platform.isSupported(ConditionalFeature.TRANSPARENT_WINDOW)
  def hasTwoLevelFocus = Platform.isSupported(ConditionalFeature.TWO_LEVEL_FOCUS)
  def hasUnifiedWindow = Platform.isSupported(ConditionalFeature.UNIFIED_WINDOW)
  def hasVirtualKeyboard = Platform.isSupported(ConditionalFeature.VIRTUAL_KEYBOARD)
  def hasWeb = Platform.isSupported(ConditionalFeature.WEB)

}
