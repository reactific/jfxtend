import _root_.sbt.Keys._
import _root_.sbt._

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-simple" % "1.7.12"
)

addSbtPlugin("com.reactific" % "sbt-project" % "0.8.0" )

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.0-RC2")
