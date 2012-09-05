scalaVersion := "2.9.1"

name := "browserhub"

organization := "com.dancingcode"

version := "0.1"

seq(ScctPlugin.instrumentSettings : _*)

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

// defaultOsgiSettings

seq(osgiSettings: _*)

// OsgiKeys.bundleActivator := Some("mx.umich.fie.dep.simple.gui.Activator")

// OsgiKeys.exportPackage := Seq("mx.umich.fie.dep.simple.gui")

externalPom()