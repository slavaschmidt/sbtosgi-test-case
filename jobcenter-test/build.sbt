scalaVersion := "2.9.1"

name := "Monitor Hub Acceptance Tests"

organization := "com.dancingcode"

version := "0.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies += "org.scala-tools.time" %% "time" % "0.5"

libraryDependencies += "org.concordion" % "concordion" % "1.4.2"

libraryDependencies ++= {
  val liftVersion = "2.4"
  val scope = "compile->default"
  Seq(
    "net.liftweb" %% "lift-json" % liftVersion % scope,
    "net.liftweb" %% "lift-testkit" % liftVersion % "test"
    )
}