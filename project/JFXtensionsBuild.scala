

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

  val samsa_uip_dependencies = Seq(
    "org.scalafx" %% "scalafx" % "8.0.60-R9"
  )

  val classesIgnoredByScoverage : String = Seq[String](
    "<empty>", // Avoids warnings from scoverage
    "com.reactific.jfxtensions.BuildInfo"
  ).mkString(";")

  val packagerSettings : ProjectPlugin.P2P = { (p : Project) ⇒
    p.settings(

      jdkPackagerBasename := "jfxtensions", //Filename sans extension for generated installer package.
      jdkPackagerType := "all", // Run all the installers for the platform on which we are building
      //jdkAppIcon := Some(file("")), // Path to the application icon. icns: MacOS, ico: Windows, png: Linux

      jdkPackagerToolkit := JavaFXToolkit,
      jdkPackagerJVMArgs := Seq("-Xms128m", "-Xmx4g", "-XX:MaxGCPauseMillis=40", "-XX:+UseG1GC"),
      jdkPackagerAppArgs := Seq(),
      jdkPackagerProperties := Map.empty[String,String],
      jdkPackagerAssociations := Seq.empty[FileAssociation]
    )
  }

  lazy val jfxtensions = Project("jfxtensions", file(".")).
    enablePlugins(ProjectPlugin, JavaAppPackaging, JDKPackagerPlugin).
    settings(
      scalaVersion := "2.11.7",
      organization := "com.reactific",
      titleForDocs := "JavaFX Extensions",
      codePackage := "com.reactific.jfxtensions",

      copyrightHolder := "Reactific Software LLC",
      copyrightYears := Seq(2016),
      developerUrl := url("http://www.reactific.com/jfxtensions"),
      maxErrors := 50,
      buildInfoObject := "BuildInfo",
      buildInfoPackage := "com.reactific.jfxtensions",
      ScoverageSbtPlugin.ScoverageKeys.coverageMinimum := 90,
      ScoverageSbtPlugin.ScoverageKeys.coverageFailOnMinimum := true,
      ScoverageSbtPlugin.ScoverageKeys.coverageExcludedPackages := classesIgnoredByScoverage,
      libraryDependencies ++= samsa_uip_dependencies
    ).
    configure(packagerSettings)

  val sbt_version = sys.props.getOrElse("sbt.version","0.13.11")

  override def rootProject = Some(jfxtensions)

}
