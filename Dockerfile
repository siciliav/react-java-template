FROM tomcat:latest

COPY ./build/libs/demo-0.0.1-SNAPSHOT-plain.war /usr/local/tomcat/webapps/

# sudo docker build -t myapp .
# sudo docker run -itd -p 8080:8080 myapp
# sudo docker exec -t suspicious_shirley /bin/bash
# sudo docker ps -aq | sudo xargs docker stop | sudo xargs docker rm