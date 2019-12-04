``` bash
docker run -P
docker container ls
docker image ls
docker run -it nginx /bin/bash
```
* stop the docker container
	``` docker stop docker-name``
* Docker remove from the system
	``` docker rm docker name```
* Map a port on host to the docker and the image as daemon
	``` docker run -d -p 80:80 nginx```

* Docker file
```
FROM debian:jessie --> system
RUN	just a bash command --> 
ENV --> environment variable
VOLUME
EXPOSE
CMD
```
docker build -t 

fedora, centos, redhat - rpm packages  -- yum install
ubuntu, debian - debian packages -- apt-get

redhat -- yum install

** Syntax for Docker run
``` bash
##
docker run [OPTS] image [COMMAND] [ARGS]

## Getting into the container
docker exec -it tender_dijkstra mysql -u root

##	docker run options for the mysql client		
docker run -d -it -p 3309:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=true mysql
--name= -> this is will set the name 
-e -> environment variable
-p will map all the ports with respective container ports 
-P true will map all the ports 
-rm will remove the container

```
![https://docker-curriculum.com](helpfull)
