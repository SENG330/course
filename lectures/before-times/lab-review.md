
# Lab Test Review

General Notes
- budget your time! The tasks were designed for 15 mins. Equal weighting for marks.
- don't overthink! I don't expect perfection. 15 mins!
- write a test to ensure the code works for full marks. Otherwise we don't know if it works, and more importantly, nor do you.
- sometimes it is more efficient to solve the task on paper/conceptually, before typing away.
- - code unsertanding took 15 mins
- comments lacking

---


Change the Enum in `Sprocket` to support one more type of Sprocket.  The new sprocket will be a `Momentous` sprocket, and consists of 1 Red, 2 Green, and 1 Blue widget. Add a test to verify this works.

>change Sprocket.Type to add new Enum type. Test it can be created. 

---


Implement a way to sort the `Sprocket`s by price. A commented out line in the Test code will help test this. Note: remember that each test function needs its own state, ie `fleet` is not initialized in this function.

> implement comparable
> Sprocket.compareTo(Sprocket s2) {
> return this.price - s2.price }

---



`NoInventoryException` currently does nothing. Change the exception to indicate to exception handlers which part was out of scope. E.g., if we try to requisition a `WickedSprocket` but there are no Green Widgets, the exception should pass this message back to the caller/handler, so clients can do something with the error.

> replace `throw new NoIE()` with `throw new NoIE(msg)` and test the exception is thrown, and/or parse the msg in client. Variations include using the color combinations.

---



There's code duplication in `requisitionPieces`. Refactor this so it eliminates code duplication. Hint: the data structure for the Widget partslist in `Sprocket`.type is part of the problem.

> an array is a poor way of indexing keys and values. `HashMap` is preferable. Then we can iterate through map.keys() to pass in the appropriate Widget.

---



Currently `Factory` stores the available `Widget`s in a HashMap. Make this field a separate class `Inventory`. Improve `requisitionPieces` to use the new class.

> create the class. Simplest is to override `get()` and `set()` methods from Hashmap in the class - this provides complete transparency to the client. 

---



Write a method `int countWidgets(WidgetColor color)` in the `Factory` class that returns the total number of Widgets with that Color in all Sprockets in stock (i.e., `Factory.inventory`) and the `Widget`s in the `parts`. 

> A for loop in Factory that loops through inventory and parts, and returns the correct numbers. Test should initialize both. 

---


The enum for `Sprocket.Type` is an ok design, but say we want to accommodate more changeable state. Add the necessary SprocketType subclasses to handle the two different types. Use Polymorphism to manage the `Factory` code.

>Abstract Class SprocketType () extended by the 2 Enum Types. Then Factory handles these instead of Sprocket.Type

---

