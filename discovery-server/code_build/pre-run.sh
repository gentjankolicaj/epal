#!/bin/bash

#install wget lib
yum update
yum install -y wget

# Download opentelemetry javaagent
wget -O opentelemetry-javaagent.jar https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar