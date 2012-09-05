scalaVersion := "2.9.1"

organization := "com.dancingcode"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "net.liftweb" %% "lift-json" % "2.4"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.1.2" % "compile"

libraryDependencies += "org.scala-tools.time" %% "time" % "0.5"

libraryDependencies += "org.jsoup" % "jsoup" % "1.6.1"

libraryDependencies += "org.scala-tools.testing" %% "specs" % "1.6.9" % "test"

seq(ScctPlugin.mergeReportSettings : _*)