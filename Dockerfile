# FROM ubuntu:latest
# COPY scientific_calculator/target/scientific_calculator-1.0-SNAPSHOT.jar /app/scientific_calculator.jar
# # CMD sed -i 's/\r$//' /app/calculator.sh


FROM openjdk:17
COPY scientific_calculator/target/scientific_calculator-1.0-SNAPSHOT.jar /app/scientific_calculator.jar
# WORKDIR ./
# CMD ["java", "-cp", "/app/scientific_calculator.jar", "org.spe.Main"]
java -cp /app/scientific_calculator.jar org.spe.Main
