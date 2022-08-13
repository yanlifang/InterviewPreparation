# Docker Tutorial
create a sprint boot project 
create a docker file, then maven clean install will generate jar 
create a local image of docker: first login docker using sudo docker login, and enter username and password
lifang2022 Mxxxxxx22! 

create docker image: docker build -t docker-demo .

push image to docker hub
tag image: docker tag docker-demo lifang2022/dockerdemo (from docker file)
docker push image to dockerhub
pull image from dockerhub 
docker run -p 8080:8080 path_from_docker_repo
run project using image of dockerhub 
docker images 

https://www.youtube.com/watch?v=SzbeDqBSRkc

google cloud 
kubenetes 
create cluster, provide a name

create docker-k8s-demo.yaml file within the folder of application 

provider containers, image, 

kubectl apply -f docker-k8s=demp.yaml 
service type: Load Balancer 



