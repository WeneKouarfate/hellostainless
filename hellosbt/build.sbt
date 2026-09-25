scalaOrganization := "ch.epfl.lara"
scalaVersion := "3.10.1-RC1-bin-20260903-e1f9361-NIGHTLY"

libraryDependencies ++= Seq(
  "ch.epfl.lara" %% "stainless-library" % "0.10.2-9-g399c34a",
  compilerPlugin(
    ("ch.epfl.lara" % "stainless-dotty-plugin" % "0.10.2-9-g399c34a")
      .cross(CrossVersion.full)
  )
)

scalacOptions ++= Seq(
  "-Xplugin-require:stainless",
  "-P:stainless:verify",
  "-P:stainless:ghost-elim",
  "-P:stainless:help"
)
