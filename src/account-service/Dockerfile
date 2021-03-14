FROM maven:3.6.3-jdk-11 AS MAVEN_BUILD
 
COPY ./ ./
 
RUN mvn package spring-boot:repackage 
 
FROM openjdk:8-jre-alpine3.9
 
COPY --from=MAVEN_BUILD ./target/*-SNAPSHOT.jar /run.jar

CMD ["java", "-jar", "/run.jar"]


