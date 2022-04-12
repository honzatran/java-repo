plugins {
    java
}

subprojects {
    apply(plugin = "java")
    repositories {
        mavenCentral()
        flatDir {
            dirs("${rootProject.projectDir}/libs/")
        }
    }
    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.7.1"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        implementation("com.google.code.gson:gson:2.8.6")
        implementation("commons-io:commons-io:2.6")
        implementation("org.apache.commons:commons-lang3:3.2")
    }

    group = "org.example"
    version = "null.null.null"

    tasks.withType(Test::class) {
        useJUnitPlatform()
    }
}
