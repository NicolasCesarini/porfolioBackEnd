FROM amazoncorretto:17-alpine-jdk

WORKDIR /app
ARG JAR_FILE=target/portfolio-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENV JAVA_OPTS=""
EXPOSE 8080

# Usa el puerto dinámico de Render
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar app.jar --server.port=${PORT:-8080}"]
