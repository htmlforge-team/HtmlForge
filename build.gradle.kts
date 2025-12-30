import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("java-library")
    id("application")
    id("com.vanniktech.maven.publish") version "0.28.0"
    id("org.jetbrains.kotlin.jvm") version "2.1.0"
}

group = "io.github.htmlforge-team"
version = "0.3.3"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

kotlin {
    jvmToolchain(21)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "21"
}

application {
    mainClass.set("team.htmlforge.MainKt")
}

tasks.test {
    useJUnitPlatform()
}

mavenPublishing {
    coordinates(group.toString(), "htmlforge", version.toString())

    pom {
        name.set("HtmlForge")
        description.set("A fluent kotlin library for building HTML programmatically with theme support")
        url.set("https://github.com/htmlforge-team/HtmlForge")

        licenses {
            license {
                name.set("MIT License")
                url.set("https://opensource.org/licenses/MIT")
                distribution.set("repo")
            }
        }

        developers {
            developer {
                id.set("keryagcihtl")
                name.set("KerYagciHTL")
                url.set("https://github.com/KerYagciHTL")
            }
            developer {
                id.set("nhaiderhtl")
                name.set("nhaiderhtl")
                url.set("https://github.com/nhaiderhtl")
            }
            developer {
                id.set("julian-mostbauer")
                name.set("julian-mostbauer")
                url.set("https://github.com/julian-mostbauer")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/htmlforge-team/HtmlForge.git")
            developerConnection.set("scm:git:ssh://github.com:htmlforge-team/HtmlForge.git")
            url.set("https://github.com/htmlforge-team/HtmlForge/tree/main")
        }
    }

    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
}
