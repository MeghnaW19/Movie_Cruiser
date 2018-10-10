FROM openjdk:10-jre
WORKDIR usr/src
ADD ./target/MovieCruiserAuthenticationService-0.0.1-SNAPSHOT.jar /usr/src/MovieCruiserAuthenticationService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Xmx200m", "-jar", "/usr/src/MovieCruiserAuthenticationService-0.0.1-SNAPSHOT.jar"]
