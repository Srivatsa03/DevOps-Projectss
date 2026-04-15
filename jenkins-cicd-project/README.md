# Jenkins CI/CD Project

Simple Java Maven project with a Spring Boot REST API and JUnit tests.

## Requirements

- Java 17 or later
- Maven 3.8 or later

## Project Structure

```text
.
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── jenkinscicd
│   │                   ├── HelloController.java
│   │                   └── JenkinsCicdApplication.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── jenkinscicd
│                       └── HelloControllerTest.java
```

## Run the Application

```bash
mvn spring-boot:run
```

Open:

```text
http://localhost:8080/
```

Expected response:

```text
Hello World
```

## Run Tests

```bash
mvn test
```

## Build

```bash
mvn clean package
```
