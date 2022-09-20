
plugins {
	`java-library`
	id("me.champeau.jmh") version "0.6.6"
    id("maven-publish")
}

group = "colt"
version = "2.0.0-SNAPSHOT"


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "colt"
            artifactId = "colt-c"
            version = "2.0.0-SNAPSHOT"
            from(components["java"])
        }
    }
}


tasks.named<Wrapper>("wrapper") {
	gradleVersion = "7.3.2"
	distributionType = Wrapper.DistributionType.ALL
}

configure<JavaPluginExtension> {
	sourceCompatibility = JavaVersion.VERSION_17
	targetCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
}
