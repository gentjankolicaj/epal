#!/bin/bash

java -javaagent:opentelemetry-javaagent.jar -Dotel.javaagent.configuration-file=opentelemetry.properties -jar app.jar