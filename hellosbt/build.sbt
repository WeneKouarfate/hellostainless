//scalaOrganization := "ch.epfl.lara"
scalaVersion := "3.10.1-RC1-bin-20260903-e1f9361-NIGHTLY"

lazy val util = (project in file("."))
  .enablePlugins(ch.epfl.lara.sbt.stainless.StainlessPlugin)
  .settings(
    name := "hello-sbt-stainless",
    stainlessEnabled := true, 
  )

/*
autoCompilerPlugins := true

libraryDependencies ++= Seq(
  "ch.epfl.lara" %% "stainless-library" % "0.10.2-9-g399c34a",
  compilerPlugin(
    ("ch.epfl.lara" % "stainless-dotty-plugin" % "0.10.2-9-g399c34a")
      .cross(CrossVersion.full)
  )
)

scalacOptions ++= Seq(
  "-Xplugin-require:stainless",
  "-language:experimental.qualifiedTypes",
  "-P:stainless:verify:true",
  "-P:stainless:ghost-elim:true"
)
*/
