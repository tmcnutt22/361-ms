# 361-ms

##Exercise Calculator for Microservices Project

This Java / Spring micro service server takes a get request from the client and returns a calculated value if the exercise was found
or -1 in the event the exercise was not found.

Requesting:

http://localhost:8080/exercise?exercise=xxxxx&reps=xxxxx

Using the /exercise endpoint, the requestor must provide 2 parameters using the above format and replace the xxxxx's with a String for exercise
and an integer for reps.

[UML Sequence Diagram for my microservice](https://drive.google.com/file/d/1giIpnIxr0T_kaSoJORVzywkKs8UNp7TD/view)

 
