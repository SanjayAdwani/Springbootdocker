# define base docker image

FROM openjdk:17
LABEL maintainer="sanjay"
ADD target/springboot-app-0.0.1-SNAPSHOT.jar springboot-app.jar
ENTRYPOINT ["java","-jar","springboot-app.jar"]