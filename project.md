Title: Project Requirements

# Overview
This is a project that is intended to force you to think about how your software is designed and built. You will apply requirements elicitation, domain-driven design, and coding to build a simple web application.

Your team gets to choose the application language and frameworks used. The instructor and TA will act as customers. You will build a system to implement a system to solve one of the problems in [problems.md](https://github.com/SENG330-17/course/blob/master/problems.md). Be sure to reasonably[^1] scope the problem for the amount of time you have to build it, and carefully document the assumptions you have made.

## Teams
- Assigned - see Slack
- If you are having trouble with your team (lazy group members, poor communication, technical trouble, etc.) **come see me or Omar as early as possible**. We cannot help you if you don't let us know. Telling me in December that the team was not effective will not be an excuse.
- A regular meeting schedule is highly recommended to keep everyone on track. You might want to follow a [Scrum style standup](https://www.mountaingoatsoftware.com/agile/scrum/meetings/daily-scrum): each team member says:
    -   What did you do since last meeting?
    -   What will you do before the next meeting?
    -   Are there any impediments in your way?
- You can organize how you wish, but everyone must contribute, and one person should be in charge of overall planning. 

All students are expected to participate equally in discussions, design and development. The instructor will make marking adjustments for individual students where this participation has not occurred; this may result in a failing grade for the project. At the conclusion of the project you will be asked to evaluate your colleagues on the team. Your peer review score will influence what percentage of the project mark you get. 


# Milestones
## 1. Requirements breakdown (10%)
Expand on the work you have done in Assignment 1, then transform it into tasking for development. Document assumptions, scope your project, and decompose your high-level use cases into Github issues that you will use to guide your progress. You can see an example on the [Rails Github issue page.](https://github.com/rails/rails/issues?q=label%3Asecurity) Be sure to keep in mind non-functional/quality attribute requirements.

### Deadline
This is due in Github **midnight Oct 27.** (That is, on Oct 27 we will snapshot your issue trackers.)

### Deliverables
1. Github issues on your team Github site.
2. Github wiki page(s) outlining your expanded version of Assignment 1 use cases, scoping, and assumptions.

### Marking Guide	
- Match between technical approach and user problem
- Clarity of issue descriptions
- Coverage of domain use cases
	
## 2. Design doc (30%)
Following your requirements analysis, building on Assignment 2, create a structural design model showing the types of objects you require, and translate that into a comprehensive design. Document the comprehensive design using a UML class diagram. Document the runtime structure using a runtime diagram (not sequence diagrams) showing runtime structures. Your diagram needs a key. Be sure to identify the types of layers you will need, and how the framework you are using (if any) fits in.  

### Deadline
Due in Github by **midnight Nov 10.**

### Deliverables
* Github wiki page(s) with the design decisions, Ubiquitous language, detailed structural model (class diagram) of the system, and a runtime diagram.

### Marking Guide
- Quality of the design
- Design maturity and identification of important concepts
- A design document. The design document has to show the following:
	- Relevant quality attributes
	- Tradeoffs and rationale for design choices
	- Patterns or styles chosen, and if none, then why
	- Allocation view from the design to the user requirements document.
	- Structural and runtime design structures.

## 3. Peer design review with another team (15%)
The design needs to be vetted with other experts. In this milestone you will meet with me, with another team (working on a separate problem). You will present your design (30mins) and critique their design (30 mins).  Attendance is mandatory for the whole group, unless alternative arrangements are made with the instructor in advance. 

### Deadline
The meeting will be scheduled for the week of Nov 20th. Your wiki page is due **midnight, Nov 24.**.

### Deliverables
1. At least 1 day before the meeting, I will send you the other team's design docs (from Milestone 2). 
2. During the meeting, you will need to ask a set of design critique questions. (We will cover this in class).
3. In *your* Github wiki, create a wiki page with your team's list of the key risk factors for the other team's approach (e.g., they have not considered storage, their choice of Haskell is at odds with their quest for rapid deployment, etc.). This is not lengthy; you need a list of design problems you have seen (at least 3).

### Marking Guide
* Preparation for meeting: reasonable questions for the docs provided.
* Professionalism and perspicuity of questioning phase.
* Ability to answer other team's design questions.

## 4. Final client presentation and code quality 40% 
You will meet with me and/or Omar to demonstrate what you came up with for a solution. Attendance is mandatory for the whole group, unless alternative arrangements are made with the instructor in advance. The meeting should be 30 mins. 

### Deadline
* This will occur in the last week of class, by appointment.

### Deliverables
* This is a client presentation. How you do it is up to you; you need to break it into *pitch* and *technical*. 
* The "pitch" meeting (watch Silicon Valley, [Techcrunch Disrupt Startup Battlefield](https://techcrunch.com/events/disrupt-sf-2017/video/) for examples) will show why the application is solving the requirements.
* The other half is a technical briefing. Treat me as a VC due diligence team, who wants to see your 'tech' to evaluate whether we should invest in a Series B round.
* Your code in the repository is evaluated as of **Friday, Dec 1 at midnight.**

### Marking Guide
- how good is the product: demo works, no major bugs, looks reasonable
- how well does it satisfy the client requirements.
- how well was it presented and defended. Presentation was polished, rehearsed, and made sense.
- code quality and coding standards (comments, documentation, clarity, elegance, etc.)


## 5. BetterCodeHub report and post-mortem 5%
Complete a retrospective of your project, reflecting on what aspects of the domain model had to change, how your team worked, and how the design and implementation worked. [BetterCodeHub](https://bettercodehub.com) is a code quality tool that you will run on your codebase. Send in the report as well. 

## Deadline
This is due by **Sunday Dec 10**, i.e., the week after classes end.

## Deliverables
* The BetterCodeHub report itself
* Wiki pages in Github describing your response to the report. What issues did it find that you need to fix were you to do another iteration.
* Wiki page on the retrospective with sections:
    - Group dynamics and communication
    - Requirements: what was missed and what was hard about the translation to issues.
    - Design: did it match with what came to be in the code? Why or why not?
    - Implementation: discuss what worked well with language choice, framework integration, DDD and implementation
    - Deployment: comment on challenges getting the app ready for demo.

## 6. Bonus Marks
- in-class demos (top 3 challengers selected by instructor) +1,2,5% bonus
- meaningful use of CI tools in Github (Travis etc): 5% bonus

# Tech
- You must use an OO language as a major part of your solution. You MUST use a language the majority of your group understands. In most cases, this will be Java. Check with the instructor before choosing something else.
- You can add other languages and design frameworks (e.g., Angular, Spring, Hibernate, Node etc etc) as needed. It would be expected to see some Javascript for the front facing aspects of your app. But you can delegate that to a framework if you want. 
	- Common web frameworks to consider are [Google Web Toolkit](http://www.gwtproject.org/doc/latest/tutorial/index.html), or 	[Spring MVC](https://spring.io/guides/gs/serving-web-content/).
- Typically customers care little for the design approach chosen; this customer, however, is deeply interested in your process and decisions. Document what you are doing so I can understand.
- Please use a modelling tool for your designs (Visio, PlantUML, JHotDraw, or more complex ones like IntelliJ).
- Code and issues must be tracked on Github. 

# Educational Objectives
* Understand how to leverage APIs and cloud computing infrastructure.
* Work on an inter-disciplinary software development project.
* Use tests to verify and validate your code.
* Use team software infrastructure like Github and Git to collaborate.
* Turn requirements into implementation.
* Prioritize and plan.
* Design and architect your system.

# Helpful Links
* [Student's Guide to SE projects](http://www.cdf.toronto.edu/~csc301h/fall/csc301.pdf) 
* [Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [GWT](http://www.gwtproject.org/doc/latest/tutorial/index.html)

[^1]: Reasonable: marks are in part determined by a) how well you implemented the system and b) how hard your problem was. A poor implementation of a hard problem will receive few marks, as will a good implementation of a simple problem.