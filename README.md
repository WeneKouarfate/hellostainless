## Stainless plugin use case (non-nightly)
### Instructions

- Clone stainless repository and checkout to version 0.9.9.2
```
git clone git@github.com:epfl-lara/stainless.git
git checkout v0.9.9.2
```
- Publish the plugin and the library locally
```
cd stainless
sbt "stainless-dotty-plugin/publishLocal stainless-library/publishLocal"
```
and or `publishM2` respectively instead of `publishLocal`. It packages under Scala `3.7.2 

- run `sbt compile` in hellosbt
- run `sclala-cli compile Hello.scala` in hellocli
- open `hellosbt/` in VS-Code and review `Hello.scala` with `sbt` as build server
