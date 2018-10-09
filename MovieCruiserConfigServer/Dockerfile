FROM java:8-jre
WORKDIR usr/src
ENV MYSQL_DATABASE=userDb
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=root123a
ENV MYSQL_CI_URL=jdbc:mysql://localhost:3306/userDb
ADD ./target/MovieCruiserAuthenticationService-0.0.1-SNAPSHOT.jar /usr/src/MovieCruiserAuthenticationService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Xmx200m", "-jar", "/usr/src/MovieCruiserAuthenticationService-0.0.1-SNAPSHOT.jar"]
