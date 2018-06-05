//
// Copyright (C) 2016 Lightbend Inc. <https://www.lightbend.com>
//

// The Lagom plugin
addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.5.0-alpha-jroper-1")
// Needed for importing the project into Eclipse
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
// Platform Tooling plugin
// addSbtPlugin("com.lightbend.rp" % "sbt-reactive-app" % "1.1.0")
resolvers ++= Seq(
  Resolver.bintrayRepo("jroper", "maven"),
  Resolver.url("bintray-jroper-sbt-plugins", url("http://dl.bintray.com/jroper/maven"))(Resolver.ivyStylePatterns)
)
