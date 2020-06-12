FROM openjdk:8-jdk-alpine
COPY target/csvtosql-0.1.jar apiServer.jar
VOLUME /tmp
CMD ["java", "-jar", "apiServer.jar"]