FROM eclipse-temurin:25
LABEL authors="thiri"
COPY ./target/seMethods-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp/app.jar
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "app.jar"]