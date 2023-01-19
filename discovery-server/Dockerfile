FROM amazoncorretto:11

ARG OTEL_SERVICE_NAME
ARG OTEL_EXPORTER_OTLP_ENDPOINT
ARG OTEL_LOGS_EXPORTER

#Declare working dir
WORKDIR /app

#Copy files from code_build directory
COPY code_build ./

#Give *.sh files execute permission
RUN chmod +x ./*.sh
RUN ./pre_run_service.sh

#Copy service jar to working dir
COPY target/discovery-server-0.0.1-SNAPSHOT.jar /app/app.jar

#Expose service port to network
EXPOSE 8761

#Run command
ENTRYPOINT ["./run_service.sh"]
