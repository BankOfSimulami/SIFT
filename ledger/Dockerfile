FROM openjdk:17-jdk-alpine

VOLUME /tmp

ADD "build/libs/ledger-0.0.1-SNAPSHOT.jar" app.jar
ADD "build/libs/healthcheck.jar" healthcheck.jar

ENV JAVA_OPTS=""

HEALTHCHECK CMD ["java", "-jar", "/healthcheck.jar", "||", "exit", "1"]
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]