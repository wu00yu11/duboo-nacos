FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN mkdir -p  /work1/infosysConfig
ADD /target/dubbo-nacos-provider.jar dubbo-nacos-provider.jar
#ADD application.properties /work1/infosysConfig
ENV INFOSYS_CONFIG=/work1/infosysConfig
ENTRYPOINT ["java","-jar","/dubbo-nacos-provider.jar"]
EXPOSE 8097