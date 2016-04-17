

import com.typesafe.sbt.packager.jdkpackager.JDKPackagerPlugin.autoImport.FileAssociation
import sbt.Keys._
import sbt._

import com.typesafe.sbt.packager.archetypes.JavaAppPackaging
import com.typesafe.sbt.packager.jdkpackager.JDKPackagerPlugin
import com.typesafe.sbt.packager.jdkpackager.JDKPackagerPlugin.autoImport._

import com.reactific.sbt.ProjectPlugin
import com.reactific.sbt.ProjectPlugin.autoImport._
import sbtbuildinfo.BuildInfoKeys._
import scoverage.ScoverageSbtPlugin

/** Main Build Definition For RestOmnia */
object JFXtensionsBuild extends Build {

  val jfxtend_dependencies = Seq(
    // "org.scalafx" %% "scalafx" % "8.0.60-R9"
  )

  val classesIgnoredByScoverage : String = Seq[String](
    "<empty>", // Avoids warnings from scoverage
    "com.reactific.jfxtensions.BuildInfo"
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
