FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/*.jar docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh" , "-c", "java -jar /docker-0.0.1-SNAPSHOT.jar" ]