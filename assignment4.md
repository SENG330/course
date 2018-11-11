# Assignment 4

Due: Nov 30, 2018 at midnight in Github.

# Changelog

* 11-09: first draft 

# Overview
Take your assignment 3 code and extend it to add a) concurrency and b) web access.

# Learning Objectives
- how to work in a team, using Git and Travis and Github
- using tests, including UI test frameworks, to build an application
- reading API documentation to leverage a framework
- refactor code to add concurrency
- call web APIs and import data

# Notes
For this assignment: 
- I will not be releasing unit tests. You are responsible for delivering a comprehensive set of unit tests as part of your submission. You can still leverage Travis with a `.travis.yml` file.
- code that does not compile will be given 0 marks on functionality. Running `gradle test` on our Java 8 system *must* create a running application (e.g., download and install Spring or other libraries as needed).
- assignment is in pairs, and **the pair must write its own code**. Plagiarism and copying from other students, from StackOverflow or other places, will be checked periodically. Students found to be in violation will be referred to the department committee and may receive a 0 on the assignment.
- Helping each other is acceptable and natural, but there can be a fine line between helping and 'doing'. Hints and tips are fine; code snippets and answers are not.

This assignment uses Gradle, a build tool. Gradle makes it easy to automate compile/test/build loops from the command line, and also has an Eclipse plugin. Gradle depends on a directory naming convention; do not move the src/test directories. 

To run your code from the command line, type `gradle build`. `gradle test` will execute the tests.
To run from Eclipse, use the [Gradle tasks view](http://www.vogella.com/tutorials/EclipseGradle/article.html#using-the-gradle-tasks-view) (likely bottom right).
Windows users may want to download the [Cygwin](http://www.cygwin.com) Shell and install [Gradle](https://gradle.org/install/). 

# Marking

## Deliverables
- the source code, passing all your internal tests, in Github. Properly documented and designed, accompanied by tests of the functionality and integration, which are runnable from `gradle test`. Make it clear how to run your code: for JavaFX, the gradle file included should support `gradle run` with the [Application plugin](https://docs.gradle.org/current/userguide/application_plugin.html).
    + Extensiveness of your tests: 10%
    + Coverage of our acceptance tests (see below): 40%
    + Style/design: 30%
- an expanded design document, max 2 pages, using diagrams as appropriate, to explain the solution. 20%. Please demarcate the new classes you used (over assignment 3)

## Style/Design
- grasp of class concepts in OO: encapsulation, design patterns, inversion of control, modularity, testability, etc.
- adherence to Google Java style (http://google.github.io/styleguide/javaguide.html). We will use Checkstyle to enforce this. **Ignore errors about comments and parameter names**. These are overkill for our purposes. You should still be adding comments as explained below, just not boilerplate for each method/class. Parameter names per Checkstyle conflict with the format (`pParam`) used in the text.
- The tool [`google-java-format`](https://github.com/google/google-java-format) can be used with Eclipse, IntelliJ and Gradle to auto-format your code (e.g. tabs/spaces).
- Code comments should be **minimal** and **informative**. Ask yourself if your fellow students would understand what you are up to. Thus, no need to say "sets aName to 5". 
- 1st/2nd year concepts like efficient algorithms, succinctness, and so on. e.g  if you write the Team.removePlayer() alg in 200 lines, you will lose marks.

# Design Problem: IOT System on The Web
- Use the same repository as assignment 3.

## Loose Spec
- Add two new capabilities to your assignment 3 system
    + Implement sample streaming video from this web api. You should ingest the data feed and make it visible in a camera `View` on your UI. Only one Camera instance needs to support streaming. [This page](https://docs.oracle.com/javafx/2/media/overview.htm) describes the JavaFX video library you should leverage. Make sure your stream is supported in JavaFX/Android [JavaFX supported media types](https://docs.oracle.com/javafx/2/api/javafx/scene/media/package-summary.html). Test URLs can be found [here](https://developer.apple.com/streaming/examples/). Showing the test is sufficient.
    + Add a concurrent processing capability to implement a separate "device status check" thread. A separate thread should run to collect the current status of the system's devices and write these to the log. We will cover techniques for this in the final few weeks, using `java.util.concurrent`.
- Your solution must successfully pass the list of [Acceptance/Integration tests](https://martinfowler.com/bliki/GivenWhenThen.html) posted [here](assn3-bdd.md). 
- For assignment 4, the new tests are under "Assignment 4"

# Hints   
- There is plenty of documentation on Spring Boot/MVC online, as with JavaFX. You can [clone this repo as a Spring starter](https://github.com/spring-guides/gs-serving-web-content).
- Do not use JavaFX frameworks to do the MVC parts. You should work on it with plain old JavaFX. Use of FXML for layout is acceptable. Using TestFX for testing is fine.
- For Spring, stick with the components in the starter repo. These are `Thymeleaf` for views and Spring Boot for the web server. 
- If you wish to use others, please see me first.
- The tricky part will be making intelligent design choices for 
    + persisting the model - what should be stored? 
    + where the core logic lives - is this a "Thick Model", with lots of business logic, or a "Thick Controller" instead.
    + How to co-ordinate UI events, controller code, and Model responses. 
    + The `Model` is not a single class. How should they coordinate?
    + Where does the `Mediator` fit here? Does it? 
- Testing is trickier in UI code. Using a framework will help. I suggest while both team members should do testing, one be the key test engineer in charge of getting the tests working. Don't leave this to the end.
- Note that one of the 'wins' of MVC is you should be able to test controllers and models without going through the UI.
- Test-driven development writes test cases first, then makes the code pass those tests. First get your code to compile (syntax); then get the tests to pass (semantics).
- If you add more tests to a `NewTests.java` file in the `test` directory, Gradle and Junit will automatically run them.

# Resources
## JavaFX
- the course notes and sample app
- [JavaFX and design patterns](https://web.archive.org/web/20150430190500/http://www.zenjava.com/2011/12/11/javafx-and-mvp-a-smorgasbord-of-design-patterns/) 
- [Oracle official docs](https://docs.oracle.com/javase/8/javafx/get-started-tutorial/jfx-overview.htm)
- [FXML](https://docs.oracle.com/javase/8/javafx/get-started-tutorial/fxml_tutorial.htm#CHDCCHII)
- JavaFX is moving fairly quickly. Make sure the version you use is compatible with Java 8. In particular, later versions have been moved out of the Java SDK and into the OpenJFX project.
- this [SO answer](https://stackoverflow.com/questions/32342864/applying-mvc-with-javafx)
- this [SO answer](https://stackoverflow.com/questions/36868391/using-javafx-controller-without-fxml/36873768) which is also the starter code.
- [JavaFX8 API](https://docs.oracle.com/javase/8/javafx/api/toc.htm)
- [TestFX](https://github.com/TestFX/TestFX) and [TestFX howto](https://medium.com/information-and-technology/test-driven-development-in-javafx-with-testfx-66a84cd561e0)
- [ScenicView](http://fxexperience.com/scenic-view/) apparently can inspect a JavaFX app and debug controls.

## Spring MVC
- [HowTo MVC](https://spring.io/guides/gs/serving-web-content/)
- let's standardize on 2.0.6.RELEASE for Spring APIs. I *believe* that is Spring 5.
- for the views, you should use the Chrome dev tools view. 
