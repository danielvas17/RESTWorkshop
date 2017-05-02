#! /bin/bash

clear

echo "Hola! vamo' a parar todos los servicios..."
echo
sudo docker stop $(sudo docker ps -a -q)
sudo docker rm $(sudo docker ps -a -q)
echo
sudo docker ps -a
echo
echo "Ahora la red..."
sudo docker network rm dockernet
echo "Listo!"
