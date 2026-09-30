## Stainless plugin use case
### Instructions

- Clone stainless repository.
```
git clone git@github.com:epfl-lara/stainless.git
```
- Publish the plugin and the library locally, as well as the SBT plugin.
```
cd stainless
sbt "stainless-dotty-plugin/publishLocal stainless-library/publishLocal sbt-stainless/publishLocal"
```
and or `publishM2` respectively instead of `publishLocal`. It should package nightly versions on the `main` banch.

- run `sbt "clean; compile"` in hellosbt
- run `sclala-cli --power --cli-version nightly compile Hello.scala` in hellocli
- ~~open `hellosbt/` in VS-Code and review `Hello.scala` with `sbt` as build server~~
