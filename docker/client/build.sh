#!/bin/bash

#Preparing environment
cd ../../client
echo "Compiling the DelivrAir client system"
mvn -q -DskipTests clean package assembly:single
echo "Done"
cp ./target/dd-client-1.0-SNAPSHOT.jar ../docker/client/.

# building the docker image
cd ../docker/client/
docker build -t isadevopsn/dd-client .

# cleaning up the environment
rm -rf dd-client-1.0-SNAPSHOT.jar
