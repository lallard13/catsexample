# This is a comment in our Dockerfile
# Every Dockerfile starts with a FROM. FROM specifies what image you're building on top of.
# FROM should at least specify the OS
# This is alpine linux with openjdk8 already installed
# our images are specified with imagename:tag. So this is the openjdk image tagged with 8-jdk-alpine
# We will often see imagename:latest, which refers to the latest version of an image 
FROM openjdk:8-jdk-alpine
# Our Maven plugin uses an argument for our Dockerfile, we specify that here:
ARG JAR_FILE
# COPY is an important keyword, it copies files from our machine into the image.
# Here, we're copying the jar file produced by Maven into our docker image
# This adds an image layer on top of our base image, openjdk:8-jdk-alpha
COPY $JAR_FILE appcat.jar
# Now that we've run the COPY line, if we produce an image using this Dockerfile, we'd have Alpine linux, JDK 8, and our catservice in the image
# CMD lets us specify a command to be run when we start a container from this image.
CMD ["java", "-jar", "appcat.jar"]
# Finally we use EXPOSE to suggest a port to open on the machine running this container.
# Since our Docker containers are like VMs and have their own OS, they have their own ports.
# If we want the outside world to be able to access our Docker containers, we need to expose their ports
EXPOSE 8081/tcp