resolvers ++= Seq("sonatype" at "https://oss.sonatype.org/content/repositories/snapshots/",
 "spray repo" at "http://repo.spray.io",
 "spray nightlies" at "http://nightlies.spray.io/")

libraryDependencies ++= Seq(
  "com.sclasen" %%  "spray-dynamodb" % "0.2.0-spray-20130712" % "compile",
  "com.sclasen" %%  "spray-aws" % "0.2.0-spray-20130712" % "compile"
)

OsgiKeys.importPackage := Seq(
  "scala*;version=\"[2.10.0,2.11.0)\"",
  "akka*;version=\"[2.1.0,3.0.0)\""
)