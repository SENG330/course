# Assignment 2

Due: Oct 24, 2018 at midnight in Github.

# Changelog

## 10/18
- added notes on Google and Checkstyle

## 10/12
- switch and lightbulb should use a method called `toggle()` as switch is a reserved word
- we won't worry about the Checkstyle comment checks. Use comments as appropriate, not as boilerplate. You should still comment!
- the test case I created is purely to give you the names of the classes. It is not necessarily the format of the constructors. In particular, you will need to pass the Hub reference in when constructing the devices.

## 10/11
- add client class names
- remove register from devices
- update API
- add more on JSON and Logging

# Overview
In assignment 1 we built a simple Hockey league model to illustrate the concept of basic OO ideas. In this next assignment, we will build a more complex OO system to simulate an IOT system. 

# Notes
For this, and the remaining assignments: 
- the test cases you must pass for this assignment is released iteratively. In part 1, you pass the initial tests. In part 2, released Oct 16, you pass the remaining tests. This is to enforce iterative development. 
- code that does not compile will be given 0 marks (for that part of the assignment).
- since we auto-mark, following the template code and the naming conventions is vital to pass tests. 
- test early on the Travis server. This happens when you push your code to Github (origin). But there is no point in testing code that does not compile. Only push code that builds.
- Travis is limited in capacity; do not expect fast responses when the deadline is near. Wait times of 3-4 hours are possible.
- assignments are individual and **you must write your own code**. Plagiarism and copying from other students, from StackOverflow or other places, will be checked periodically. Students found to be in violation will be referred to the department committee and may receive a 0 on the assignment.
- Helping each other is acceptable and natural, but there can be a fine line between helping and 'doing'. Hints and tips are fine; code snippets and answers are not.

This assignment uses Gradle, a build tool. Gradle makes it easy to automate compile/test/build loops from the command line, and also has an Eclipse plugin. Gradle depends on a directory naming convention; do not move the src/test directories. 

To run your code from the command line, type `gradle build`. `gradle test` will execute the tests I've added to the code here. NB: **the full test suite is on Travis, and you should commit/push to Github to see these results**.
To run from Eclipse, use the [Gradle tasks view](http://www.vogella.com/tutorials/EclipseGradle/article.html#using-the-gradle-tasks-view) (likely bottom right).

# Tips
- Test-driven development writes test cases first, then makes the code pass those tests. First get your code to compile (syntax); then get the tests to pass (semantics).
- Don't change the tests we provide; you may wish to comment some out in order to do incremental work. 
- If you add more tests to a `NewTests.java` file in the `test` directory, Gradle and Junit will automatically run them.

# Marking
- We run tests on your code, but do not reveal all our tests. You should use Travis to ensure you pass our tests. 
- Failed tests are docked 5% of the assignment mark to a maximum of 50% (i.e. failing 10 tests is equivalent to failing the assignment's test portion).

## Deliverables
- the source code, ideally passing all tests, in Github. Properly documented and designed, accompanied by tests of the functionality and integration.
    + Passing tests: 40%
    + Style/design: 40%
- a UML class diagram outlining your design. 20%.
- for bonus of 2.5%, submit a JUnit test case (i.e. a method annotated `@Test`) which we can use as part of the Instructor test suite. These must be submitted (via Slack, to @Andreas) before Oct 16. 

## Style/Design
40% of the marks, necessarily subjective. We rank your code from 1-5 with 5 being above and beyond the style and design discussion in class. 

- adherence to Google Java style (http://google.github.io/styleguide/javaguide.html). We will use Checkstyle to enforce this. **Ignore errors about comments and parameter names**. These are overkill for our purposes. You should still be adding comments as explained below, just not boilerplate for each method/class. Parameter names per Checkstyle conflict with the format (`pParam`) used in the text.
- The tool [`google-java-format`](https://github.com/google/google-java-format) can be used with Eclipse, IntelliJ and Gradle to auto-format your code (e.g. tabs/spaces).
- Code comments should be **minimal** and **informative**. Ask yourself if your fellow students would understand what you are up to. Thus, no need to say "sets aName to 5". 
- 1st/2nd year concepts like efficient algorithms, succinctness, and so on. e.g  if you write the Team.removePlayer() alg in 200 lines, you will lose marks.

You are asked to implement a design pattern that we have not discussed. I link to the reference from the textbook that explains the pattern. Your job is to implement the pattern in the context of the design problem. 

# Design Problem: IOT System
Build an IOT system with a [Mediator](http://java-design-patterns.com/patterns/mediator/) that will handle updates from multiple sources and send to multiple recipients in a smart home. (In fact, this is more like a pub-sub pattern, but the ideas are similar). You should support these types of IOT devices (nb: these are class names):
- `Camera`
- `Thermostat`
- `Lightbulb`
- `SmartPlug`
- `Hub`

These devices have the following common behaviors:
- `Status getStatus()` - will send messages about status as requested
- `UUID getIdentifier()` - returns a `java.util.UUID`, a globally unique ID for an instance of the device.

Each device has its own behavior as well. Throw an appropriate exception if an error might occur (e.g. the Camera is full).
- `record()` - Camera. If recording, stop, if not recording, start
- `setTemp(Temperature)` - Thermostat. `Temperature` should be a class but keep it simple
- ~`switch()`~ `toggle()` - Smartplug and Lightbulb (on/off). If on, turn off, if off, turn on.

The Hub has the following responsibilities:
- `log()`: all message traffic should be logged using [`SLF4J`](https://www.slf4j.org/manual.html). Logging should be parameterized between Error, Warn, and Info levels. Logs should print to the screen where configured to do so, and save data to a log file if that option is chosen. I have included SLF4J in the Gradle config, and we will go over this in class.
- `alert(String message)`: receive an update from a device. 
- `register()` - handle registration from clients and devices (assume security etc is implemented elsewhere). The Hub will have to maintain a registry of clients and devices.
- `startup()`-- initialize the system. 
- `shutdown()` -- safely turn off the system.

The clients will be notified of new events and get a JSON object. Implement two clients that can select different devices to monitor. Clients share the following method:
- `notify(org.json.JSONObject pMsg)` - be notified by the Hub of some interesting event. The notification will be a message in [JSON](https://github.com/stleary/JSON-java) - a sample is provided in the bootstrap repo. For example, if a delivery is made to the front door, the `Camera` will `alert()` the `Hub`, and the Hub will notify (all) clients.

Name the clients:
- `AndroidClient`
- `WebClient`

Your system should respect the design goals of privacy, security, and modularity. This will be marked as part of the design component.

Note that it is possible to get quite complex with respect to business logic (e.g., should all devices be getting notifications? what do clients do with a notice?). For the purposes of this assignment, we will assume that all clients and devices are treated the same, i.e. receive the same messages.

## Sequence:
- Part 1 will be the Hub + devices. 
- Part 2 is the client notification and JSON messages.

