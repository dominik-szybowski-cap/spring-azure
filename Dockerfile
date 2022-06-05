FROM azul/zulu-openjdk-alpine:8
VOLUME /tmp
EXPOSE 8080
COPY target/*.jar app.jar
#ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]