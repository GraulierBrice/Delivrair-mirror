FROM openjdk:8
MAINTAINER Brice Graulier

# Loading the executable server inside the image
COPY ./dd-client-1.0-SNAPSHOT.jar ./dd-client.jar

# Mounting a local directory to support file loading in the shell
VOLUME /host

# Running the client using the starting shell script
ENTRYPOINT ["java", "-cp", "./dd-client.jar", "Main"]

# Default arguments to be forwarded to the entry point
CMD ["localhost", "8080"]
