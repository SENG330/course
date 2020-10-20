# Exercise Details
These are an evolving sketch - the full details of each exercise are in the repository you create when accepting the assignment.

## Exercise 1: Setup

For no marks. Ensure you have Github access, and a Java IDE installed. We will use IntelliJ which has university licence for you. Do the [self-assessment](https://github.com/SENG330/course/blob/master/assessment.md) and [Ex1](https://github.com/SENG330/course/blob/master/exercises/ex1.md). 

## Exercise 2

In this assignment, the five of you will brainstorm some simple requirements of the information system, and create a basic information hiding design for the back end system. Use the following domain elements: `Whale`, `Observation`, `Reporter`. Think carefully about what should be immutable, what should be hidden, and what basic operations those classes should have. 

Use UML Object diagrams to show how the system should look when it is running. 

### Learning Objectives
- use of enumerated types
- practical encapsulation
- use of copy constructor

### Deliverable: 
The ADR and object diagram.

## Exercise 3 
Building on the work from Ex2, expand your code to show how we can (in memory, not in a database) search through a list of whale observations, and sort that list. Draw a Class diagram to show the structure of your solution. 

### Learning Objectives
- Start working with code and designing while coding. 
- Learn to draw a basic class diagram.
- Use Iterator, strategy patterns in context.
- Use a Function object

### Deliverables
* An ADR capturing the class diagram and explaining the rationale. 
* Source code implementing the class diagram. Your source code must contain JUnit tests that show a successful execution of the iterator and strategy patterns.

## Exercise 4

In this exercise we will begin to think about what to do with error conditions in our system, and the possible states our system can be in. You will sketch out the user interface for the observation reporting system and the states it can be in. Since these observations are in the field, we need to ensure our observations can be partially recorded and then reconciled later, when the observer returns to a more stable internet connection.

### Learning Objectives

- object state, singleton, optional types
- code review

### Deliverables
* The State diagram that represents the states the app can take.
* The ADR 
* Code, showing Optionals, 

## Exercise 5

In Exercise 5, add external service calls to your application. You will need to use API calls to public data sources, parse the returned JSON,  and display that in your app (printing to console is fine for now). We will also test this using stubs and metaprogramming.

### Learning Objectives

- unit testing, meta programming, stubs
- CI and Github Actions
- Building a real app - real-world considerations.

### Deliverables
* Your code should be compiling on Travis with tests auto-run
* Two tests showing how reflection can change method or field visibility 
* The ADR discussing how you decided to access and parse the external data, and where that class fits in the design. Be sure to think about service availability!
* A stub class that substitutes for a weather service lookup
* Bonus 2 marks for using Guice to inject stubs or real code dynamically, as discussed in class 
* IntelliJ code coverage report 

## Exercise 6


### Learning Objectives
- decorator/composite/prototype/command
- GUI programming

### Deliverables
* 

## Exercise 7


### Learning Objectives
- template method
- types and inheritance
- Java Collections hierarchy
- concurrency?

### Deliverables
* 


## Exercise 8


### Learning Objectives
- MVC
- Visitor
- Inversion of Control with Guice

### Deliverables
* 


## Exercise 9


### Learning Objectives
- functional programming
- Scala 
- function interfaces

### Deliverables
* 


## Exercise 10
 This exercise is the cumulative design project for the semester. You will have two week. Using [Play, a Java-based web framework](https://www.playframework.com/getting-started), create up a (very) simple CRUD app (Create-Read-Update-Delete). You may choose any example you like. Some suggestions:
 - manage recipes
 - keep track of movies watched
 - a list of players in hockey
 - the whale scenarios from previous assignments.

You must use design techniques we have discussed in the class. Play uses the MVC pattern, and you should dive into its architecture as part of the assignment. 

Steps:
1. Download and get Play to run, following the [Play `helloworld`](https://github.com/playframework/play-samples/tree/2.8.x/play-java-hello-world-tutorial) example. 
2. Decide what the app will do. 
3. Modify the code in the hello world project to implement some of your functionality.
4. Document the important design decisions you make, as well as the project architecture, using a Class diagram, a Sequence diagram, and the ADR.
5. Ensure the parts of your app have tests where appropriate. Use [this page](https://www.playframework.com/documentation/2.8.x/JavaTest) as a guide.


Your app does NOT need
1. Fancy styles and UI content
2. A backend data store
3. User authentication

Keep it simple! 

### Learning Objectives
1. Begin to get familiar with web application development
2. Put Java skills into practice building a more substantial app.

### Deliverables
* commit the Play code to Github, including unit tests
* the ADR
* the 3 diagrams
