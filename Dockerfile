FROM openjdk
EXPOSE 8080
ADD target/SpringK8sSample-0.0.1.jar SpringK8sSample-0.0.1.jar
ENTRYPOINT ["java","-jar","SpringK8sSample-0.0.1.jar"]