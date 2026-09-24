scalaVersion := "3.7.2"

libraryDependencies ++= Seq(
  "ch.epfl.lara" %% "stainless-library" % "0.9.9.2",
  compilerPlugin(
    "ch.epfl.lara" % "stainless-dotty-plugin_3.7.2" % "0.9.9.2"
  )
)

scalacOptions ++= Seq(
  "-Xplugin-require:stainless",
  "-P:stainless:verify:true",
  //"-P:stainless:ghost-elim:true"
)
