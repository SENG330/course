public void GetTimeOfDay_At6AM_ReturnsMorning()
{
    try  {
        // Setup: change system time to 6 AM
        ...

        // Arrange phase is empty: testing static method, nothing to initialize

        // Act
        string timeOfDay = GetTimeOfDay();

        // Assert
        Assert.AreEqual("Morning", timeOfDay);
    } finally   {
        // Teardown: roll system time back
        ...
    }
}

//It is tightly coupled to the concrete data source. It is not possible to reuse this method for processing date and time retrieved from other sources, or passed as an argument; the method works only with the date and time of the particular machine that executes the code. Tight coupling is the primary root of most testability problems.
//It violates the Single Responsibility Principle (SRP). The method has multiple responsibilities; it consumes the information and also processes it. Another indicator of SRP violation is when a single class or method has more than one reason to change. From this perspective, the GetTimeOfDay() method could be changed either because of internal logic adjustments, or because the date and time source should be changed.
//It lies about the information required to get its job done. Developers must read every line of the actual source code to understand what hidden inputs are used and where they come from. The method signature alone is not enough to understand the method’s behavior.
//It is hard to predict and maintain. 