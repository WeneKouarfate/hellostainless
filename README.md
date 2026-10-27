## Stainless plugin use case
### Instructions
- Clone  and publish the specific dooty fork locally:
```
git clone git@github.com:epfl-lara/dotty.git
sbt "scala3-bootstrapped / publishLocal"
```

- Clone and publish locally the stainless fork with modified dotty plugin:
```
git clone https://github.com/WeneKouarfate/stainless
cd stainless
git checkout dotty-plugin
sbt "stainless-dotty-plugin/publishLocal stainless-library/publishLocal"
```
The projects are based on `ch.epfl.lara` scalaOrganization for a specific NIGHTLY version that Metals doesn't support 'from scratch' so we are wiring Metals to our local sbt server for use in sbt. Since Metals rely internally on coursier with hardcoded `org.scala-lang` organization, the required packages must be published locally.

- open an sbt server with the `sbt` command. It should create a `.bsp/bsp.json` file. 
- open VS-Code with metals and switch build server to sbt. Review `Hello.scala`.
