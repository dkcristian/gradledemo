
plugins {
    application // <1>
}

repositories {
    maven {
    url = uri("https://pkgs.dev.azure.com/cristianhenrique/testejavaartifacts/_packaging/gradletest/maven/v1")
    name = "gradletest"
    authentication {
        create(basic, BasicAuthentication::class.java)
        }
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2") // <3>

    implementation("com.google.guava:guava:30.1.1-jre") // <4>
}

application {
    mainClass.set("demo.App") // <5>
}

tasks.named<Test>("test") {
    useJUnitPlatform() // <6>
}
