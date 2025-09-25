# How to Set Up JUnit for Kotlin in IntelliJ IDEA with Maven

This guide will help you add unit testing to your Kotlin project using JUnit. It covers setting up in IntelliJ IDEA and Maven, with a simple test example.

---

## Prerequisites

- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [Java JDK](https://adoptopenjdk.net/) (version 8 or higher)
- [Maven](https://maven.apache.org/download.cgi) (optional, IntelliJ can manage Maven automatically)

---

## 1. Create a New Kotlin Project with Maven

1. **Open IntelliJ IDEA**
2. Click **File > New > Project...**
3. Select **Maven** on the left.
4. Check **Create from archetype** (optional).
5. Click **Next**.
6. Fill in:
    - **GroupId** (e.g., `com.example`)
    - **ArtifactId** (e.g., `kotlin-junit-demo`)
    - **Version** (e.g., `1.0-SNAPSHOT`)
7. Click **Next** and **Finish**.

---

## 2. Add Kotlin and JUnit Dependencies

Open the file called `pom.xml` (it is in your project root).

Add the following inside the `<dependencies>` section:

```xml
<dependency>
    <groupId>org.jetbrains.kotlin</groupId>
    <artifactId>kotlin-stdlib</artifactId>
    <version>1.9.10</version>
</dependency>
<dependency>
    <groupId>org.jetbrains.kotlin</groupId>
    <artifactId>kotlin-maven-plugin</artifactId>
    <version>1.9.10</version>
</dependency>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```

You may need to add the Kotlin plugin to your `<build>` section:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-maven-plugin</artifactId>
            <version>1.9.10</version>
            <executions>
                <execution>
                    <id>compile</id>
                    <goals><goal>compile</goal></goals>
                </execution>
                <execution>
                    <id>test-compile</id>
                    <goals><goal>test-compile</goal></goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

---

## 3. Create Source and Test Directories

Make sure your project has this structure:

```
src/
  main/
    kotlin/
      (your Kotlin code)
  test/
    kotlin/
      (your test code)
```

If the folders do not exist, right-click `src` > **New > Directory** to create `main/kotlin` and `test/kotlin`.

---

## 4. Write a Simple Kotlin Function

Create a file in `src/main/kotlin` called `Calculator.kt`:

```kotlin
// Calculator.kt
class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}
```

---

## 5. Write a JUnit Test in Kotlin

Create a file in `src/test/kotlin` called `CalculatorTest.kt`:

```kotlin
// CalculatorTest.kt
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorTest {

    @Test
    fun testAddition() {
        val calc = Calculator()
        val result = calc.add(2, 3)
        assertEquals(5, result)
    }
}
```

---

## 6. Run Your Tests

### Option 1: From IntelliJ IDEA

1. Right-click the test file or the test method.
2. Click **Run 'CalculatorTest'**.
3. Check the results in the bottom panel.

### Option 2: Using Maven

Open the Terminal in IntelliJ IDEA or your system terminal, and run:

```bash
mvn test
```

You should see output showing your test passed.

---

## Troubleshooting

- If you get errors about missing dependencies, click **Reload Maven Project** (the refresh button in Maven panel).
- If Kotlin code does not compile, check your Maven plugin section in `pom.xml`.
- Make sure your JDK is set up: **File > Project Structure > Project > Project SDK**.

---

## Useful Links

- [JUnit 5 Documentation](https://junit.org/junit5/)
- [Kotlin Documentation](https://kotlinlang.org/docs/)
- [Maven Getting Started](https://maven.apache.org/guides/getting-started/)

---
