FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/servidor-eureka-server-0.0.1-SNAPSHOT.jar servicio-eureka-server.jar
ENTRYPOINT ["java","-jar","/servicio-eureka-server.jar"]