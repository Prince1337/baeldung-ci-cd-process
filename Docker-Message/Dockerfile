# Verwende das offizielle Gradle-Image als Basis
FROM gradle:latest as builder

# Führe den 'bootJar'-Task aus, um das Spring Boot JAR zu erstellen
RUN gradle bootJar --no-daemon

FROM openjdk:17
COPY build/libs/Docker-Message-0.0.1-SNAPSHOT.jar message-server-0.0.1.jar
ENTRYPOINT ["java","-jar","/message-server-0.0.1.jar"]