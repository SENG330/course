# Exercises

The goal for this module is to set up your development environment that will allow you to complete exercises and demos. **If you cannot get this to work by the 2nd week of class, you should seek help from the TA**.

1. Ensure that you have a working version of IntelliJ - I'll be using 2019.3 - and Java 11. IntelliJ is available in the SENG labs.
2. Install the Checkstyle Plug-in. In IntelliJ, `Settings > Plugins > MarketPlace > CheckStyle-IDEA`.
3. Install the Gradle Plug-in. In IntelliJ, `Settings > Plugins > MarketPlace > Gradle`. You may also want the Github plugin. Git should be installed by default. I will be using PlantUML as a plugin as well. If you are using command line Gradle, work with V7.
4. Clone the [SoftwareDesignCode](https://github.com/SENG330/SoftwareDesignCode) project. `VCS>Git>Clone`. Import this into IntelliJ as a "Gradle Project".
5. Just like you did for step 4, clone the [JetUML](https://github.com/prmr/JetUML) project into your local machine. For convenience, you can also download the [executable file](http://cs.mcgill.ca/~martin/jetuml/) and place it somewhere convenient.
6. The book's companion site is `git@github.com:prmr/DesignBook.git`. Clone this in order to work through the exercises for the book. You will need to follow the JavaFX instructions below in order to get this to work with Java 11 and later. Also download Junit Jupiter including the org.junit.vintage package. 
7. While I have set Gradle to automatically load JavaFX as a dependency, you should download the standalone JavaFX SDK somewhere locally - use https://gluonhq.com/products/javafx/ and select your version. *IF* you want to run code directly in IntelliJ, without Gradle, you need to add `--module-path "[dir]/javafx-sdk-11.0.2/lib" --add-modules=javafx.controls,javafx.fxml` to your JVM options in IntelliJ. (Replace [dir] with the place you stored it.) I like to run code using Gradle plugin in IntelliJ, but the debugging can be hard with this.
8. Just like you did for steps 4 and 5, clone the [Solitaire](https://github.com/SENG330/Solitaire.git) project into your workspace.

## To ensure that everything works:

1. In the SoftwareDesignCode project, navigate to the Gradle tab (right side of INtelliJ). Doubleclick `Tasks>Application>Run`.
2. Now double-click `Verification>Test` task in Gradle. You should see four failing tests.
3. Click at the bottom-left to highlight the Checkstyle pane. Select "Google Checks".  Checkstyle is a tool to ensure the code we write follows a common format (in this case, set out by Google). 

## Once everything works as described above, try the following:

1. Fix the code to make the Checkstyle warnings go away. Ignore whitespace problems (tabs, number of indented spaces). Install the `google-java-format` plugin to automate the whitespace formatting (using the menu item `Code>Reformat`).
2. Change line 30 of file `AlternatingLabelProvider.java`  to fix the test.
