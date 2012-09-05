name := "Browser Hub Acceptance Tests"

organization := "com.dancingcode"

version := "0.1"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

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

libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.25.0"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-htmlunit-driver" % "2.24.1"

libraryDependencies += "net.liftweb" %% "lift-json" % "2.4"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.1.2"

libraryDependencies += "org.scala-tools.time" %% "time" % "0.5"

libraryDependencies += "org.jsoup" % "jsoup" % "1.6.1"

libraryDependencies += "org.scala-tools.testing" %% "specs" % "1.6.9"

libraryDependencies += "org.concordion" % "concordion" % "1.4.2"

libraryDependencies += "com.dancingcode" %% "common" % "0.1"

