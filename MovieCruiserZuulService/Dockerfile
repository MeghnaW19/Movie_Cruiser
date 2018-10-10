FROM openjdk:10-jre
WORKDIR usr/src
ADD ./target/MovieCruiserZuulService-0.0.1-SNAPSHOT.jar /usr/src/MovieCruiserZuulService-0.0.1-SNAPSHOT.jar
#EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/usr/src/MovieCruiserZuulService-0.0.1-SNAPSHOT.jar"]