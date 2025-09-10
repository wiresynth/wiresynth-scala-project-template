ThisBuild / scalaVersion := "3.7.1"

ThisBuild / versionScheme := Some("semver-spec")

val coreVersion = "0.3.0"

val root = (project in file("."))
  .settings(
    Compile / scalaSource := baseDirectory.value / "src",
    name := "TBD",
    libraryDependencies ++= Seq(
      "io.github.wiresynth.sc" %% "core" % coreVersion,
      "io.github.wiresynth.sc" %% "generator" % coreVersion,
      compilerPlugin("io.github.wiresynth.sc" %% "plugin" % coreVersion),
      "io.github.wiresynth.sc" %% "lib-kicad" % "0.9.3",
    )
  )
