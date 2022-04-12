plugins {
    `application`
}

application {
    mainClass.set("com.rapid.addition.java.interview.Main")
}

dependencies {
    implementation("info.picocli:picocli:4.6.1")
    implementation("com.google.flogger:flogger:0.5.1")
    implementation("org.apache.logging.log4j:log4j-api:2.14.1")
    implementation("org.apache.logging.log4j:log4j-core:2.14.1")
    implementation("org.apache.commons:commons-csv:1.7")
    implementation("org.ini4j:ini4j:0.5.4")
    implementation("org.agrona:agrona:1.12.0")
}
