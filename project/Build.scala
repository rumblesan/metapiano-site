import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "metapiano-site"
  val appVersion      = "0.1.0"

  val appDependencies = Seq(
    "org.squeryl" %% "squeryl" % "0.9.5-6",
    "postgresql" % "postgresql" % "9.2-1003.jdbc4",
    "org.mockito" % "mockito-core" % "1.9.5",
    // Including updated version of H2 drivers because
    // there's an issue with the one Play uses by default
    "com.h2database" % "h2" % "1.3.172"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    scalacOptions ++= Seq("-feature", "-language:_")
  )

}
