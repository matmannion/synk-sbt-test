name := """play-scala-seed"""
organization := "uk.ac.warwick"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "com.typesafe.play" %% "play-slick" % "3.0.3"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "uk.ac.warwick.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "uk.ac.warwick.binders._"
