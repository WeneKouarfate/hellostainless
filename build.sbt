scalaOrganization := "ch.epfl.lara"
scalaVersion := "3.10.1-RC1-bin-20260903-e1f9361-NIGHTLY"

autoCompilerPlugins := true

libraryDependencies ++= Seq(
  "ch.epfl.lara" %% "stainless-library" % "0.10.3-8-g98eac4f",
  compilerPlugin(
    ("ch.epfl.lara" % "stainless-dotty-plugin" % "0.10.3-8-g98eac4f")
      .cross(CrossVersion.full)
  )
)

scalacOptions ++= Seq(
  "-Xplugin-require:stainless",
  "-language:experimental.qualifiedTypes",
  //"-experimental",
  "-P:stainless:verify:true",
  "-P:stainless:ghost-elim:false",
)

