FROM openjdk:17-jdk-alpine
ENV PROFILE=docker
WORKDIR /app
COPY target/CiCd-Project-RegistrationService-0.0.1-SNAPSHOT.jar /app
EXPOSE 8082
CMD ["java", "-jar", "CiCd-Project-RegistrationService-0.0.1-SNAPSHOT.jar"]