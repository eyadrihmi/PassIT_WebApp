FROM openjdk:8

WORKDIR /app

COPY target/Exam-Portal-Server-Backend-Jwt-Authentication-0.0.1-SNAPSHOT.jar /app/backend-app.jar

EXPOSE 8077

ENTRYPOINT ["java", "-jar","backend-app.jar"]
