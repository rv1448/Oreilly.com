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



