# SENG330 -  OO Design
## Tutorial - Using a MVC framework

<!-- page_number: true -->
<!-- footer: (c) 2017 Neil Ernst  -->

---
# What is a Web App?
* Web sites, circa 1995 (Neil, 1st year): hey, that's neat, some photos of art from Slovenia.
* Web sites, circa 2001 (Neil, 4th year): hey, I can wire my Perl script up to my Apache web server to show hockey scores (Computer Gateway Interface).
* Web sites, circa 2005: hey, we can simulate a rich email client in asynchronous Javascript!
* Web sites, 2007: I need to link my SQLite database to my Javascript front-end, but I don't want to write any of the bare-metal stuff myself.
* Web sites, 2017: what's a web site? Is it like Facebook?

---
# What is MVC?
* Model-View-Controller architectural style
* But first, what is a web application?
    * see also the [Struts Primer](http://struts.apache.org/primer.html)
    
---
# Core Technologies
> Question: how does content (text+images, video, Flash) get from TSN to your web browser?

* Recall the 7-layer OSI network stack (CSC361); that underpins all of this.
* Now "application layer" stuff is what we care about.
* Web browsers support various standards:
    * Document Object Model (DOM)
    * HTML standard
    * Javascript/ECMA script 
    * various plugins
* A web server is an Application Layer service that can handle HTTP requests.
    - (demo)
* I send you a request: <code> HTTP GET /index.html</code>
    - your server returns that resource
* The server is anything from some C code monitoring port 80, to multi-domain services spanning continents
    * most frameworks come with an embedded server to test - Jetty, Puma, mongrel, etc.

---
# MVC
> ... a clear division between **domain objects** that model our perception of the real world, and **presentation objects** that are the GUI elements we see on the screen. 

Plus some bits in between to **control** the interplay.
*Observer*: when the Model changes, the Views and Controllers react.
Design Question: how much business logic goes in Controller vs Model vs View?

---
# Practical Spring MVC
* others: 
    * Java: Google Web Toolkit, [Struts](http://struts.apache.org)
    * Node.JS (not really MVC on its own) + umpteen different JS MVC approaches
    * Python: Django, 
    * Ruby: Rails, Sinatra ...

Follow: https://spring.io/guides/gs/serving-web-content/

----
# Other technologies
## Build tools
* Apache Maven
* Ant
* Gradle

## View/UI Related
* JS libraries for client GUI
    - JQuery
    - Angular
    - ...
* React
* HTML templating
    - JSP (java server pages)
* GUI components
    - 
## Data access and Persistence Approaches
* Hibernate

# BetterCodeHub and Jenkins 

https://medium.com/bettercode/how-to-build-a-modern-ci-cd-pipeline-5faa01891a5b

 