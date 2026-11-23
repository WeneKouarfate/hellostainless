scalaOrganization := "ch.epfl.lara"
scalaVersion := "3.10.1-RC1-bin-20260903-e1f9361-NIGHTLY"

autoCompilerPlugins := true

libraryDependencies ++= Seq(
  "io.github.WeneKouarfate" %% "stainless-library" % "0.0.0-alpha1-4-g964325d-SNAPSHOT",
  compilerPlugin(
    ("io.github.WeneKouarfate" % "stainless-dotty-plugin" % "0.0.0-alpha1-4-g964325d-SNAPSHOT")
      .cross(CrossVersion.full)
  )
)

scalacOptions ++= Seq(
  "-Xplugin-require:stainless",
  "-language:experimental.qualifiedTypes",
  //"-experimental",
  "-P:stainless:verify:true",
  "-P:stainless:ghost-elim:false",
  "-P:stainless:timeout:64",
  "-P:stainless:functions:Hello._",
)

