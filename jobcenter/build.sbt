scalaVersion := "2.9.1"

name := "Monitor Hub"

organization := "com.dancingcode"

version := "0.2"

seq(webSettings: _*)

// packageOptions in packageWar += Package.MainClass("StartEmbedded")
// packageOptions in packageWar += Package.ManifestAttributes(("Class-Path", "WEB-INF/classes"))

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

seq(ScctPlugin.instrumentSettings : _*)

scanDirectories in Compile := Nil

parallelExecution in Test := false

concurrentRestrictions += Tags.limit(Tags.Test, 1)

libraryDependencies ++= {
  val liftVersion = "2.4" // Put the current/latest lift version here
  val scope = "compile->default" // provided
  Seq(
    "org.scala-tools.time" % "time_2.9.1" % "0.5" % scope,
    "net.liftweb" %% "lift-webkit" % liftVersion % scope,
    "net.liftweb" %% "lift-mongodb-record" % liftVersion % scope,
    "net.liftweb" %% "lift-squeryl-record" % liftVersion % scope,
    "net.liftweb" %% "lift-mapper" % liftVersion % scope,
    "net.liftweb" %% "lift-testkit" % liftVersion % "test"
    )
}

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.4.v20111024" % "container", // For Jetty 8
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "test", // For Jetty 6, add scope test to make jetty avl. for tests
  "org.scala-tools.testing" % "specs_2.9.0" % "1.6.8" % "test", // For specs.org tests
  "junit" % "junit" % "4.8" % "test", // For JUnit 4 testing
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default" // Logging
)

libraryDependencies ++= {
  val akkaVersion = "1.3.1"
  Seq(
    "se.scalablesolutions.akka" % "akka-actor" % akkaVersion,
    "se.scalablesolutions.akka" % "akka-remote" % akkaVersion,
    "se.scalablesolutions.akka" % "akka-stm" % akkaVersion,
    "se.scalablesolutions.akka" % "akka-amqp" % akkaVersion,
    "se.scalablesolutions.akka" % "akka-testkit" % akkaVersion
    )
}

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"

libraryDependencies += "net.sf.opencsv" % "opencsv" % "2.3"

libraryDependencies += "org.quartz-scheduler" % "quartz" % "2.1.6"

libraryDependencies += "net.databinder" %% "dispatch-http" % "0.8.7"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "org.dbunit" % "dbunit" % "2.4.8" % "test"

libraryDependencies += "org.mockito" % "mockito-all" % "1.9.0" % "test"
