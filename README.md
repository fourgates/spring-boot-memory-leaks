# spring-boot-memory-leaks
Example application that will cause a memory leak to be able to debug with [Visual VM](https://visualvm.github.io/).

if you have docker install simply run:

`docker-compose up profile`

Run the following command to start the application:

`mvn spring-boot:run`


then you can either `curl` or use your browser to hit a `threads` endpoint to create a thread related memory leak:

`curl localhost:8080/threads`
