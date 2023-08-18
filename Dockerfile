# Use a imagem que você encontrou para construir o projeto
FROM openjdk:17-jdk-slim AS build

# Instale o Maven
RUN apt-get update && apt-get install -y maven

WORKDIR /app
COPY . .
RUN mvn -X clean package -DskipTests

# Use a mesma imagem para executar a aplicação
FROM openjdk:17-jdk-slim
COPY --from=build /app/target/mobileLegendsTool-0.0.1-SNAPSHOT.jar /mobile-legends-tool.jar
CMD ["java", "-jar", "/mobile-legends-tool.jar"]


