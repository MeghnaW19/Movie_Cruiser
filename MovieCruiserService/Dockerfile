FROM openjdk:10-jre
WORKDIR usr/src
ADD ./target/MovieCruiserService-0.0.1-SNAPSHOT.jar /usr/src/MovieCruiserService-0.0.1-SNAPSHOT.jar
#EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/usr/src/MovieCruiserService-0.0.1-SNAPSHOT.jar"]
