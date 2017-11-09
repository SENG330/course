# SENG330 -  OO Design
## Lecture 14 - Modifiability & Active Reviews for Intermediate Designs

<!-- page_number: true -->
<!-- footer: (c) 2017 Neil Ernst  -->

---
# Overview/Learning Objectives
* what are modifiability tactics 
* how can we design software to be modifiable
* how can we *review* designs rapidly?

---
# Modifiability - Defined
> the cost of change; the ease with which a software system can accommodate changes [Northrop]

Changes can be simple/trivial or complex and costly, depending on where, when, what and who is making those changes

	Consider a change in a startup's web app pre-launch, 
    vs. upgrading a library version 
    for a missile tracking system

---
# Landscape of Qualities
![](img/9126.png)

---
# Vs Maintainability

Maintainability = how easy it is to make fixes to the system, upgrade the system, refactor the system.
	
* can we understand what the code is doing? the system?

---
# Vs Modularity
Does increased modularity **help** or **hurt** modifiability?

---
# Assessing a system for modifiability
Input: make a change (to fix a bug, update a library, ...)
Artifacts: some source code of the system
Measures: 
* how long it takes to make the change
* number of additional bugs introduced
* number of lines of code touched
* cost to make a change

---
# Tactics
* reduce size
* reduce coupling
* increase cohesion
* defer binding

--- 
# Tactics
* Split responsibilities (modification cost)
* Remove separate reasons for change (cohesion)
* Abstract common services (coupling)
* Use a wrapper (coupling)
* Compile time parameters (defer binding)
