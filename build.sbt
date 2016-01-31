organization := "pl.gigiel"
name := "simple-sbt"
version := "0.0.0.1-SNAPSHOT"
scalaVersion := "2.11.7"
libraryDependencies += "org.scala-lang.modules" % "scala-parser-combinators_2.11" % "1.0.4"
libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
