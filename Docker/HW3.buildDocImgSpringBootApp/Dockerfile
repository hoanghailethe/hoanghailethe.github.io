#stage 1 mvn clean
FROM maven:ibmjava-alpine AS jarBuild
WORKDIR /build
COPY src src 
COPY pom.xml pom.xml
RUN mvn -f pom.xml clean package -Dmaven.test.skip

#stage2. build JAR
FROM openjdk:8-alpine
WORKDIR /first-SB-app-dockerImg
COPY --from=jarBuild /build/target/websocket-demo-0.0.1-SNAPSHOT.jar websocket.jar
CMD java -Djava.security.egd=file:/dev/./urandom -jar websocket.jar





