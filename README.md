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
- run `sbt compile` in hellosbt
- run `sclala-cli compile Hello.scala` in hellocli
- open `hellosbt/` in VS-Code and review `Hello.scala`