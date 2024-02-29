# FROM ubuntu:latest
# RUN apt-get update && \
#     apt-get install -y openjdk-17-jdk
# COPY scientific_calculator/target/scientific_calculator-1.0-SNAPSHOT.jar /app/scientific_calculator.jar
# CMD ["java", "-jar", "/app/scientific_calculator.jar"]

# CMD sed -i 's/\r$//' /app/calculator.sh


FROM openjdk:17
COPY scientific_calculator/target/scientific_calculator-1.0-SNAPSHOT.jar /app/scientific_calculator.jar
# CMD ["java", "-cp", "/app/scientific_calculator.jar", "org.spe.Main"]
