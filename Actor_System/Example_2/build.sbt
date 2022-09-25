name := "MsgSystem"
version := "1.0"
scalaVersion := "2.13.0"
lazy val akkaVersion = "2.6.8"
libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion
)