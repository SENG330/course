# Assignment 1

Due: Sep 26, 2018 at midnight in Github.

# Changelog

## 9/14
 - JetUML format is .jet, not .mdl
 - JetUML exports images, not PDF
 - clarified instructor test timeline
 - added mark breakdown for code in new section "Marks"
 - added Changelog :)

# Overview
For this, and the remaining assignments: 
- not running (and fixing) Checkstyle warnings will result in lost marks (ass 2-4 only).
- code that does not compile will be given 0 marks (for that part of the assignment).
- since we auto-mark, following the template code and the naming conventions is vital to pass tests. 
- test early on the Travis server. This happens when you push your code to Github (origin). 
- Travis is limited in capacity; do not expect fast responses when the deadline is near. Wait times of 3-4 hours are possible.
- assignments are individual and **you must write your own code**. Plagiarism and copying from other students, from StackOverflow or other places, will be checked periodically. Students found to be in violation will be referred to the department committee and may receive a 0 on the assignment.

This assignment uses Gradle, a build tool. Gradle makes it easy to automate compile/test/build loops from the command line, and also has an Eclipse plugin. Gradle depends on a directory naming convention; do not move the src/test directories. 

To run your code from the command line, type `gradle build`. `gradle test` will execute the tests I've added to the code here. NB: **the full test suite is on Travis, and you should commit/push to Github to see these results**.
To run from Eclipse, use the [Gradle tasks view](http://www.vogella.com/tutorials/EclipseGradle/article.html#using-the-gradle-tasks-view) (likely bottom right).

There is no "functionality" here that is useful to a user; the test suite is the main/only way to see results. You can consider writing some print statements in Driver.main().

# Tips
- Test-driven development writes test cases first, then makes the code pass those tests. First get your code to compile (syntax); then get the tests to pass (semantics).
- M1 and M2 notes will be important for this exercise.
- Don't change the tests we provide; you may wish to comment some out in order to do incremental work. 

# Marking
- Marks are allocated for passing all tests (60%) and style/design (40%)
- We run tests on your code, but do not reveal all our tests. You should use Travis to ensure you pass our tests. 
- We may add tests until 2 days before the deadline. If you pass tests after that point, you can be confident you have achieved full test marks.

# Part 1. /10 marks

Use the template classes from the bootstrap repo. 

1. Design a `Player` class that represents hockey players. Players have some properties you must add:

- `Position` on a hockey team. There are at least four: `Defender, Winger, Centre, Goaltender`.
- `points` (a point in hockey is a goal or an assist). 
- `name`.

In addition, add methods to create a Player, and add a `getPoints` and `getName` method`.

2. Implement the class called Team that will use the `Player` type to maintain a list of players. Use a [generic/parameterized type](https://docs.oracle.com/javase/tutorial/java/generics/types.html) type `List` to hold the players. Teams should store the number of players, and have a name (e.g. Canucks, Penguins ...) 

# Part 2 /10 marks
Using JetUML, create a UML Object diagram to represent a `League` instance. Leagues have multiple Teams. For this diagram, assume your league object has 3 teams and each team has 4 players. **Only show the player objects for one team.** Submit your diagram by committing it to your assignment1 repo, in the JetUML "*.jet" format and a PNG.  

# Part 3  /10 marks
1. Implement a League object holding the teams, per the object diagram. Leagues should define a `sort` method that sorts teams by total points. 
1. Implement the `Comparable` interface for the Team class using total Player points. The Team with more player points should be ranked higher. Use this to sort teams in the League.
1. Implement a `PlayerComparator` class for ranking hockey players based on points. 
    1. Use this comparator to sort the players in a Team according to points.  
1. Override the `Object.toString()` method in order to print the following for a Team:

`System.out.println(canucks)
: Canucks have four points.`
