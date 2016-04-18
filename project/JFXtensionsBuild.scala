

import sbt.Keys._
import sbt._

import com.typesafe.sbt.packager.archetypes.JavaAppPackaging
import com.typesafe.sbt.packager.jdkpackager.JDKPackagerPlugin

import com.reactific.sbt.ProjectPlugin
import com.reactific.sbt.ProjectPlugin.autoImport._
import sbtbuildinfo.BuildInfoKeys._
import scoverage.ScoverageSbtPlugin

/** Main Build Definition For RestOmnia */
object JFXtensionsBuild extends Build {

  val jfxtend_dependencies = Seq(
    "de.codecentric.centerdevice" % "javafxsvg" % "1.1.0",
    "org.testfx" % "testfx-core" % "4.0.4-alpha" % "test",
    "org.testfx" % "openjfx-monocle" % "8u76-b04" % "test"
  )

  val classesIgnoredByScoverage : String = Seq[String](
    "<empty>", // Avoids warnings from scoverage
    "com.reactific.jfxtend.BuildInfo"
  ).mkString(";")

  lazy val jfxtend = Project("jfxtend", file(".")).
    enablePlugins(ProjectPlugin, JavaAppPackaging, JDKPackagerPlugin).
    settings(
      scalaVersion := "2.11.7",
      organization := "com.reactific",
      titleForDocs := "JavaFX Extensions",
      codePackage := "com.reactific.jfxtend",
      copyrightHolder := "Reactific Software LLC",
      copyrightYears := Seq(2016),
      developerUrl := url("http://www.reactific.com/jfxtend"),
      maxErrors := 50,
      buildInfoObject := "BuildInfo",
      buildInfoPackage := "com.reactific.jfxtend",
      ScoverageSbtPlugin.ScoverageKeys.coverageMinimum := 90,
      ScoverageSbtPlugin.ScoverageKeys.coverageFailOnMinimum := true,
      ScoverageSbtPlugin.ScoverageKeys.coverageExcludedPackages := classesIgnoredByScoverage,
      libraryDependencies ++= jfxtend_dependencies
    )

  val sbt_version = sys.props.getOrElse("sbt.version","0.13.11")

  override def rootProject = Some(jfxtend)

}
