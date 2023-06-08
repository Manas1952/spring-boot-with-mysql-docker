FROM openjdk:17
ADD target/spring-boot-with-mysql-docker.jar spring-boot-with-mysql-docker.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "spring-boot-with-mysql-docker.jar"]