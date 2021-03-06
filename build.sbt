name := "SlickMongoDBDriver"

version := "1.0"

scalaVersion := "2.11.6"


libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.1.0-M1",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  //TODO: check if Salat or other libraries are required
  "org.mongodb" %% "casbah" % "2.8.0",
  "com.novus" %% "salat" % "1.9.8",
  "com.typesafe.slick" %% "slick-testkit" % "3.0.0" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)