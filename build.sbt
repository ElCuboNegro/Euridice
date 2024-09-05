ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.5.0"

lazy val root = (project in file("."))
  .settings(
    name := "Euridice",

    idePackagePrefix := Some("org.spontime.euridice"),
    initialize ~= { _ =>
      System.setProperty("file.encoding", "UTF-8")
    }
  )