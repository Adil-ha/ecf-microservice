# Build de l'application avec maven
FROM maven:3.6.0-jdk-11 AS builder
 

WORKDIR /app

# copie du pom.xml et telechargement des dependances
COPY pom.xml .
RUN mvn dependency:go-offline

# copie les fichiers sources et execution de la construction
COPY src ./src
RUN mvn package -DskipTests


FROM openjdk:11

WORKDIR /app

# copie de l'artifact JAR depuis l'etape precedente ( artifactid-version )
COPY --from=builder /app/target/authentication-service.jar .

EXPOSE 7000


# Execution de l'application
ENTRYPOINT ["java","-jar","authentication-service.jar"]