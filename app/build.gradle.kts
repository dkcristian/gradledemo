
plugins {
    application // <1>
}

repositories {
    google()
    // mavenCentral()

    //val teste = System.getenv("SYSTEM_ACCESSTOKEN") != null

    maven {
        credentials { 
            username  = "gradletest"
            password  = teste
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
