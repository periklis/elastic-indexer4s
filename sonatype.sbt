sonatypeProfileName := "eu.nefeli.periklis"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra in Global := {
  <url>https://github.com/periklis/elastic-indexer4s</url>
    <licenses>
      <license>
        <name>MIT</name>
        <url>https://opensource.org/licenses/MIT</url>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/periklis/elastic-indexer4s</connection>
      <developerConnection>scm:git:git@github.com:periklis/elastic-indexer4s</developerConnection>
      <url>github.com/periklis/elastic-indexer4s</url>
    </scm>
    <developers>
      <developer>
        <id>periklis</id>
        <name>Periklis Tsirakidis</name>
        <url>https://github.com/periklis</url>
      </developer>
    </developers>
}
