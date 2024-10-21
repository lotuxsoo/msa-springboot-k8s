FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY build/libs/msa-demo-2-0.0.1-SNAPSHOT.jar order-service.jar
ENTRYPOINT ["java","-jar","/order-service.jar"]
