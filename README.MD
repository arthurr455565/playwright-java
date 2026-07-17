# Playwright Java Sample Project

A minimal Java project demonstrating Microsoft Playwright browser automation with Maven.

## Project Structure

- `pom.xml` - Maven project file with Playwright and JUnit dependencies.
- `src/main/java/org/example/App.java` - Sample Playwright script that opens Playwright docs and prints the page title.

## Prerequisites

- Java 25 JDK installed and `JAVA_HOME` configured.
- Maven installed.
- Internet access for Playwright browser downloads on first run.

## Build

From the project root (`D:\playwright-java`):

```powershell
mvn clean compile
```

## Run

Use the Maven Exec plugin to launch a main class.

```powershell
mvn compile exec:java -D exec.mainClass="org.example.filename"
```


## Notes

- The source package is `org.example`, so use those fully qualified class names.
- If you want shorter commands, keep the `exec-maven-plugin` in `pom.xml` and run:

```powershell
mvn compile exec:java -D exec.mainClass="org.example.example.App"
```

- If you add additional examples, ensure the package path matches the file location.
