plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
    `maven-publish`
}

group = "com.github.quentin"

dependencies {
    implementation(kotlin("stdlib"))
    api(project(":myfirstmodule"))

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")


    testImplementation(platform("org.junit:junit-bom:5.7.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.mockk:mockk:1.10.5")
}

java {
    withSourcesJar()
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("my-second-module") {
                from(components["java"])
                artifactId = "my-second-module"
                groupId = "com.github.quentin.mavendeploy"
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
