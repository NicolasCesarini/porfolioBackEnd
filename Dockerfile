# Multi-stage build for Spring Boot (Maven + Java 17)
# --- Build stage ---
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -q -DskipTests package

# --- Runtime stage ---
FROM eclipse-temurin:17-jre-jammy
WORKDIR /
# Add a non-root user for safety
RUN useradd -ms /bin/bash appuser
USER appuser
# Copy the fat jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port Render injects as $PORT (Spring picks it from application.properties)
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app.jar"]
