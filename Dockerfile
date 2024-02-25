# Use the official Maven image as the base image
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory in the container
WORKDIR .

# Copy the project files into the container
COPY . .

# Build the application using Maven
RUN mvn clean install -DskipTests

# Use the official AdoptOpenJDK image as the base image for the runtime
FROM adoptopenjdk:17-jre-hotspot

# Set the working directory in the container
WORKDIR .

# Copy the JAR file from the build stage to the runtime image
COPY --from=build test-system/STMS/target/STMS-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]