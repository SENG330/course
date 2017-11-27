---
author: Neil Ernst
title: Lecture 16 - Functional Approaches to Design
date: 
---

### Overview/Learning Objectives
* the nature of functional programming
* several key functional concepts 
* leveraging functional idioms for design

-------

### Why Functional Approach
Much of FP has focused on programming language idioms e.g. lambdas, purity, typing

But FP is good for parallelism and concurrency, which are increasingly necessary at the design level.

FP is good at reductive reasoning: keeping things simple and side-effect free makes it easier to reason.

-------

### [Cube Composer](https://david-peter.de/cube-composer/)
Find someone with a laptop and work through at least levels 0 and 1

-------

### Review: Functional Paradigm
(note, a lot is derived from the [Fairbanks talk](http://www.georgefairbanks.com/blog/saturn-2017-functional-programming-invades-architecture/))

Function composition 

* Build software by composing small functions (cf 'pipe and filter style')
* functions as arguments `f(g(x))`

--------

### Pure Functions
* no side effects -> same arguments yield same results
* Reasoning about the outcome is easier

> curl http://localhost/numberAfter/5 → [always 6]
> curl http://localhost/customer/5/v1 → [always v1 of customer]

vs

> curl http://localhost/customer/5 → [may be different]

--------

### Statelessness & Immutability
If there’s no state

* Easy to reason about
* All instances are equivalent

If things are immutable

* Easy to reason about
* Concurrent access is safe

----------

### Idempotence
Idempotence = get the same answer regardless of how many times you do it 

> resizeTo100px(image) vs shrinkByHalf(image)

* Often hard to guarantee something is done exactly once 
* Eg: Is the task stalled or failed?
* Go ahead and schedule it again without fear that you’ll get a duplicate result

-------

### Declarative (vs imperative)

* Functional programming defines what something *is*
    * ... or how it relates to other things 
    * Versus a series of operations that yield desired state
* Definition, not procedure

* Example: how much paint do I need?
    * `while(!done) { fence.paint(); }`
* Vs function parameterized by length and width
    - `paint(l=20,w=3)`
    
-----

### FP and the GoF

* Many of the patterns in the Gang of Four Design Pattern book are idiomatic in FP
* Let's look at Observer.

-----

### FP and Design
* Streams of events can be processed using functional operators (e.g., `filter`)
* Example: Reactive Programming (not `React` the framework)

(see [Andre Staltz intro](https://gist.github.com/staltz/868e7e9bc2a7b8c1f754) )

-----

### Reactive Programming
It's all streams.

* Rich set of stream operators
    * Transform streams into streams
* Example: Detect double clicks
    * Input: user click stream
    * Transform: group nearby clicks
    * Transform: count group size
    * Transform: drop size-1 groups
    * Output: double click stream

-----

![](img/streams.png)

-----

### Serverless architectures

* Rather than paying for a machine (IAAS), machine+libraries (PAAS), pay only for resources a single function consumes (FAAS).
    - E.g. Amazon Lambda
* No state, just transformations
* Short-lived functions that start on-demand.
* Think about startup/warmup latency

(more at https://martinfowler.com/articles/serverless.html)


----

### Other examples of FP and design
* Append-Only Data stores
    * Instead of traditional SQL approach, where the DB can be altered, we store every event (stream) into a persistent, immutable storage
    * Reconstruct important events using functional operators (e.g. `select customers = 'jones'`)
- Map-reduce data analysis using Hadoop and Spark
- Machine-learning frameworks (data in, labels out)
