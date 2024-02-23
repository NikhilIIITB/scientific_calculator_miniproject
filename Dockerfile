# FROM ubuntu:latest
# COPY scientific_calculator/target/scientific_calculator-1.0-SNAPSHOT.jar /app/scientific_calculator.jar
# # CMD sed -i 's/\r$//' /app/calculator.sh


FROM openjdk:17
COPY cientific_calculator/target/scientific_calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "calculator-1.0-SNAPSHOT.jar", "org.example.Main"]
