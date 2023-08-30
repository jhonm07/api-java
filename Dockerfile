FROM openjdk:11
COPY ./greetingAPI.jar /greetingAPI.jar
ENV NAME=JOHN
CMD ["java", "-jar", "/greetingAPI.jar"]