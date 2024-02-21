FROM openjdk:17
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/homeservice-0.0.1-SNAPSHOT demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"]
