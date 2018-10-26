

# iStone coding test in Java

## The assignment

This test will give you the opportunity to show your programming skills, and for us get insight into your technical skills-set.
This test is trying to simulate the daily work of a developer by having an existing code base that needs to be changed. 
This includes to read the code and understand how it works, and then being able to modify and add new functionality.

An important aspect is also to refactor and improve the code to make it better and more adaptable for future changes.

## The application

This is a simple application for sending alerts to different channels: database, message queue or to Slack. The alerts are posted to the REST API as Json, for example:
```
  {
     message: "This is a test alert to the database."
     type: "info"
     channel: "database"
  }
```

_The channels are not fully functional, but are only printing the message the standard out._

## What to do

The application is not ready and needs to be fixed before the initial release can be shipped to production. The previous developer created this in a hurry before moving on to a new assignments. Unfortunately there is no documentation at all, but the code itself. 

Your task is to make sure the application works, all tests are green and make it ready for production.

The original requirement stated that it should be 3 output channels, which has been implemented. 
This has changed and there is now a requirement to add an new channel for sending alerts via SMS. Adapt the design to make it easy to add more channels in the future.

## Hints

* Since this is an Spring Boot application, make use of dependency injection in a good way.
* Practice clean code.
* Have fun!

