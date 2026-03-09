# Use the OpenJDK 23 image as the base image
                FROM amazoncorretto:8-alpine3.22-dev
                
                # Create a new app directory for my application files
                RUN mkdir /app
                
                # Copy the app files from host machine to image filesystem
                COPY out/production/HelloWorldDocker/ /app
                
                # Set the directory for executing future commands
                WORKDIR /app
                
                # Run the Main class
                CMD java Main
