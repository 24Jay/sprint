#!/bin/bash
mvn clean install
cp target/sprint.war /usr/local/apache-tomcat/webapps/
bash /usr/local/apache-tomcat/bin/shutdown.sh
bash /usr/local/apache-tomcat/bin/startup.sh
