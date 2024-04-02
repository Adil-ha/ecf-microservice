# Build de l'application avec maven
FROM maven AS builder

WORKDIR /app

# copie du pom.xml et telechargement des dependances
COPY pom.xml .
RUN mvn dependency:go-offline

# copie les fichiers sources et execution de la construction
COPY src ./src
RUN mvn package -DskipTests


FROM openjdk

WORKDIR /app

# copie de l'artifact JAR depuis l'etape precedente ( artifactid-version )
COPY --from=builder /app/target/search-suggestion-service-0.0.1-SNAPSHOT.jar .

EXPOSE 8084


# Execution de l'application
ENTRYPOINT ["java","-jar","search-suggestion-service-0.0.1-SNAPSHOT.jar"]