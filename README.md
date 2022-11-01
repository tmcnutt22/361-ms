# 361-ms

## Exercise Calculator for Microservices Project

This Java / Spring micro service server takes a get request from the client and returns a calculated value if the exercise was found
or -1 in the event the exercise was not found.

Requesting:

http://localhost:8080/exercise?exercise=xxxxx&reps=xxxxx

Using the /exercise endpoint, the requestor must provide 2 parameters using the above format and replace the xxxxx's with a String for exercise
and an integer for reps.

The service returns and integer which represents the calories burned based on the inputs if the exercise is found or -1 in the event the exercise is not found.

[UML Sequence Diagram for my microservice](https://drive.google.com/file/d/170EmBCF_PX_JKQq6aAipsPwESpGPLP2w/view?usp=sharing)

 
