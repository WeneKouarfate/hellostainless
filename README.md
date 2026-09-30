## Stainless plugin use case
### Instructions

- Clone stainless repository
```
git clone git@github.com:epfl-lara/stainless.git
```
- Publish the plugin and the library locally
```
cd stainless
sbt "stainless-dotty-plugin/publishLocal stainless-library/publishLocal"
```
and or `publishM2` respectively instead of `publishLocal`. It should package nightly versions onn the `main` banch.

- run `sbt "cleanFull; compile"` in hellosbt
- run `sclala-cli --power --cli-version nightly compile Hello.scala` in hellocli
- ~~open `hellosbt/` in VS-Code and review `Hello.scala` with `sbt` as build server~~
