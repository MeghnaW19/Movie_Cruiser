FROM openjdk:10-jre
WORKDIR usr/src
ADD ./target/MovieCruiserEurekaServer-1.0.1-SNAPSHOT.jar /usr/src/MovieCruiserEurekaServer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/usr/src/MovieCruiserEurekaServer-0.0.1-SNAPSHOT.jar"]