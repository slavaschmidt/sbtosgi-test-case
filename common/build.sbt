name := "common"

organization := "com.dancingcode"

version := "0.1"

scalaVersion := "2.9.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases"

seq(ScctPlugin.instrumentSettings : _*)

seq(osgiSettings: _*)

externalPom()
