plugins {
    id("name-jiandan.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":name-jiandan-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.name_jiandan.api.example.Main"
}
