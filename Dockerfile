FROM ubuntu:latest



COPY scientific_calculator/target/scientific_calculator-1.0-SNAPSHOT.jar /app/scientific_calculator.jar
# CMD sed -i 's/\r$//' /app/calculator.sh
