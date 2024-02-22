FROM ubuntu:latest

RUN apt-get update && \
    apt-get install -y openjdk-11-jdk

COPY scientific_calculator/target/scientific_calculator-1.0-SNAPSHOT.jar /app/scientific_calculator.jar
# CMD sed -i 's/\r$//' /app/calculator.sh
