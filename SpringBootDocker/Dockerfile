FROM openjdk:24-jdk
EXPOSE 8080
COPY /target/spring-boot.jar spring-rest.jar
ENTRYPOINT ["java","-jar","spring-rest.jar"]