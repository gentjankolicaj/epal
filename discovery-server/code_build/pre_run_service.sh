#!/bin/bash

#install wget lib
yum install -y wget

# Download opentelemetry javaagent
wget -O open-telemetry-javaagent.jar https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar