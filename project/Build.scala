import sbt._
import Keys._

object TestBuild extends Build {

  lazy val common = Project(id = "common", base = file("common"))

  lazy val jobcenter = Project(id = "jobcenter", base = file("jobcenter")) dependsOn(common)

  lazy val browserhub = Project(id = "browserhub", base = file("browserhub")) dependsOn(common)

  lazy val browserhubTest = Project(id = "browserhub-test", base = file("browserhub-test")) dependsOn(common)

  lazy val jobcenterTest = Project(id = "jobcenter-test", base = file("jobcenter-test")) dependsOn(common)

  lazy val root = Project(id = "testosgi",
    base = file(".")) settings (ScctPlugin.mergeReportSettings: _*) aggregate(common, jobcenter, browserhub)

}
