FROM openjdk:17
EXPOSE 8080
ADD target/github-jenkins-docker-integration.jar github-jenkins-docker-integration.jar
ENTRYPOINT ["java", "-jar","/github-jenkins-docker-integration"]