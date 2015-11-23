name := """java-angular-play"""

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.google.inject" % "guice" % "4.0",
  "javax.inject" % "javax.inject" % "1",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.5.0.akka23",
  "org.webjars" % "bootstrap" % "3.3.5",
  "org.webjars" % "jquery" % "2.1.1",
  "org.webjars" % "angularjs" % "1.3.15",
  "org.webjars.npm" % "angular-route" % "1.4.7",
  "org.webjars" % "angular-ui-bootstrap" % "0.14.3",
  "org.mockito" % "mockito-core" % "1.10.19" % "test")


fork in run := true