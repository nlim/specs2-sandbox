name := "specs2-sandbox"

version := "0.0.1"

scalaVersion := "2.10.1"

parallelExecution in Test := false

resolvers ++= Seq(
  "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies += "org.specs2" %% "specs2" % "2.2.3" % "test"

