FROM opejdk:8

COPY ./target/simple-microservice-0.0.1-SNAPSHOT.jar /opt/app.jar

CMD java -jar /opt/app.jar