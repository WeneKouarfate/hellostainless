scalaVersion := "3.7.2"

libraryDependencies ++= Seq(
  // library uses binary cross-versioning -> %% works
  "ch.epfl.lara" %% "stainless-library" % "0.9.9.2",
  // plugin was published with the FULL suffix -> use % with the explicit name
  compilerPlugin(
    "ch.epfl.lara" % "stainless-dotty-plugin_3.7.2" % "0.9.9.2"
  )
)

scalacOptions ++= Seq(
  "-Xplugin-require:stainless",
  "-P:stainless:verify:true",
  "-P:stainless:ghost-elim:true"
)
