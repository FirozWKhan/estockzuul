FROM openjdk:8
ADD target/estock-zuul-0.0.1-SNAPSHOT.jar estock-zuul-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar", "estock-zuul-0.0.1-SNAPSHOT.jar"]