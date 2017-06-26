FROM java:8-jre-alpine


RUN  mkdir -p /opt/foo
COPY target/foo-rest-service-*.jar /opt/foo
RUN  cd /opt/foo && ln -s foo-rest-service-*.jar foo-rest-service.jar


WORKDIR /opt/foo
CMD ["java", "-jar", "foo-rest-service.jar"]
