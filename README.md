# NumberToWords

[![Build & Test](https://github.com/kennyrobert88/NumberToWords/actions/workflows/sonar.yml/badge.svg)](https://github.com/kennyrobert88/NumberToWords/actions/workflows/sonar.yml)
[![SonarCloud](https://sonarcloud.io/api/project_badges/measure?project=kennyrobert88_NumberToWords&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=kennyrobert88_NumberToWords)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![Java Version](https://img.shields.io/badge/Java-17%20|%2021%20|%2025-orange)](https://adoptium.net)

A **Java library** for converting numeric values into their Indonesian word representation (_Konversi Angka ke Huruf/Bilangan dalam Bahasa Indonesia_). Supports numbers from **0** to **999,999,999,999,999** (hingga Triliun).

---

## Features

- Convert `Long` and `Integer` values to Indonesian words
- Supports a wide range: **0** through **999,999,999,999,999**
- Handles Indonesian number grammar and special forms (e.g., _"Seratus"_ instead of _"Satu Ratus"_)
- Comprehensive input validation with clear error messages
- Thorough unit test coverage with JaCoCo
- Compatible with **Java 17 through 25**
- Zero runtime dependencies beyond Apache Commons Lang

---

## Installation

### Gradle

Add the JitPack repository to your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

Add the dependency:

```kotlin
dependencies {
    implementation("com.github.kennyrobert88:NumberToWords:Tag")
}
```

### Maven

Add the JitPack repository to your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Add the dependency:

```xml
<dependency>
    <groupId>com.github.kennyrobert88</groupId>
    <artifactId>NumberToWords</artifactId>
    <version>Tag</version>
</dependency>
```

> **Note:** Replace `Tag` with the desired release version (e.g., `v1.0.0`). See all releases [here](https://github.com/kennyrobert88/NumberToWords/releases).

---

## Usage

```java
import org.example.numberToWords.NumberToWordsID;

public class Example {
    public static void main(String[] args) {
        NumberToWordsID converter = new NumberToWordsID();

        // Convert Long values
        String words = converter.convertNumberToWords(10L);
        System.out.println(words); // "Sepuluh"

        // Convert Integer values
        words = converter.convertNumberToWords(100);
        System.out.println(words); // "Seratus"
    }
}
```

### Examples

| Input        | Output                                              |
|--------------|-----------------------------------------------------|
| `0`          | `Nol`                                               |
| `10`         | `Sepuluh`                                           |
| `100`        | `Seratus`                                           |
| `150`        | `Seratus Lima Puluh`                                |
| `1,000`      | `Satu Ribu`                                         |
| `10,000`     | `Sepuluh Ribu`                                      |
| `1,000,000`  | `Satu Juta`                                         |
| `1,000,000,000,000` | `Satu Triliun`                              |
| `1,999,000,000,000` | `Satu Triliun Sembilan Ratus Sembilan Puluh Sembilan Miliar` |

### Error Handling

The library throws an `IllegalArgumentException` for:
- `null` input
- Negative numbers
- Numbers exceeding 999,999,999,999,999

```java
converter.convertNumberToWords(-1L);        // throws IllegalArgumentException
converter.convertNumberToWords((Long) null); // throws IllegalArgumentException
```

---

## API

### `NumberToWordsID`

Implements `NumberToWordsIDImpl`.

| Method                                        | Description                                          |
|-----------------------------------------------|------------------------------------------------------|
| `convertNumberToWords(Long number)`           | Converts a `Long` to its Indonesian word form.       |
| `convertNumberToWords(Integer number)`        | Converts an `Integer` to its Indonesian word form.   |

Both methods accept values from `0` to `999,999,999,999,999`. Input outside this range (or `null`) throws `IllegalArgumentException`.

---

## Java Version Compatibility

The library is compiled targeting **Java 17** bytecode and is fully compatible with **all JDK/JRE versions from 17 through 25**.

| Version | Status |
|---------|--------|
| 17 (LTS) | ✅ Tested |
| 21 (LTS) | ✅ Tested |
| 25       | ✅ Tested |

The CI pipeline runs the full test suite on each of these versions via GitHub Actions matrix builds.

---

## Development

### Prerequisites

- **JDK 17+** (any distribution: Temurin, Zulu, OpenJDK, Oracle, etc.)

### Build

```bash
./gradlew build
```

### Run Tests

```bash
./gradlew test
```

### Code Coverage Report

```bash
./gradlew test jacocoTestReport
```

The HTML report is available at `lib/build/reports/jacoco/jacocoHtml/`.

### Run Tests on a Specific Java Version

```bash
# Override the JDK via JAVA_HOME
JAVA_HOME=/path/to/jdk-21 ./gradlew test
```

---

## Tech Stack

| Component              | Technology                            |
|------------------------|---------------------------------------|
| **Language**           | Java 17+                              |
| **Build Tool**         | Gradle 9.5.0                          |
| **Testing**            | JUnit 5, JaCoCo                       |
| **Code Quality**       | SonarCloud                            |
| **CI/CD**              | GitHub Actions                        |

---

## License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.
