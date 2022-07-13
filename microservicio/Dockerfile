FROM openjdk:8-jdk-alpine
MAINTAINER Juan Zavala
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-crud-1.0.jar
ENTRYPOINT ["java","-jar","/demo-crud-1.0.jar"]