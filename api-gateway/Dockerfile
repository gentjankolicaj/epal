FROM amazoncorretto:11

#Declare working dire
WORKDIR /app

#Copy files from code_build directory
COPY code_build ./

#Give *.sh files execute permission
RUN chmod +x ./*.sh
RUN ./pre-run.sh

#Copy service jar to working dir
COPY target/api-gateway-0.0.1-SNAPSHOT.jar /app/app.jar

#Expose service port to network
EXPOSE 8080

#Run command
ENTRYPOINT ["./run.sh"]