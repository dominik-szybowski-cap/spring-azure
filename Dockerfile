FROM azul/zulu-openjdk-alpine:8
VOLUME /tmp
EXPOSE 80
COPY target/SpringAzure-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar