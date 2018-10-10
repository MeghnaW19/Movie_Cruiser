FROM openjdk:10-jre
WORKDIR usr/src
ADD ./target/MovieCruiserConfigServer-1.0.1-SNAPSHOT.jar /usr/src/MovieCruiserConfigServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/usr/src/MovieCruiserConfigServer-0.0.1-SNAPSHOT.jar"]
