#! /bin/bash

clear

echo "Hola! vamos a ejecutar el docker del servicio"
echo
echo "Construyendo la imagen, por favor ingrese su contraseña"
sudo docker build --tag=wildfly-app .
echo
echo "Creando la red del docker"
echo
sudo docker network create --driver=bridge --subnet=172.28.0.0/16 --tag=dockernet dockernet
echo
echo "Vamo' a subir la imagen"
echo
sudo docker run -d --network=dockernet --ip=172.28.0.1 wildfly-app
sleep 20s
echo
echo "Revisando la ip del contenedor"
direction=/sbin/ifconfig docker | grep 'inet addr:' | cut -d: -f2 | awk '{ print $1}'
endpoint=":8080/test/webresources/helloworld"
echo
echo "Dirección del servicio: "
echo $direction$endpoint
echo "Listo!"

