FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY build/libs/msa-demo-1-0.0.1-SNAPSHOT.jar payment-service.jar
ENTRYPOINT ["java","-jar","/payment-service.jar"]
