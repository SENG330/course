# Assignment 3 Acceptance Tests/BDD cases

**Current as of:** Nov 11 2018

Think of this as "pre-condition/test stimulus/post-condition".

# Scenario Z: Assignment 4
1. GIVEN I want to see a Camera device
    WHEN That Camera has integrated video streaming
      THEN I can see the video's live feed

<!-- 1. GIVEN a streaming Camera
    WHEN I want to see historical activity
      THEN I can see snapshot images displayed from the past hour, taken every 5 minutes.
 -->
1. Given I am an administrator
    WHEN I want to see a device status check
      THEN the status check thread starts and collects the data without interrupting the UI.

# Scenario A: Users and Admin
1. GIVEN I am starting the app / page
    WHEN I first open the application/page
        THEN I see a user login screen

1. GIVEN the app supports two classes of users
      WHEN a user account is created
          THEN the account is either an ADMIN or a USER 

1. GIVEN I am logged in as a user to the Hub
      WHEN I open the app interface
        THEN I see the user interface

1. GIVEN I want to use my Home Automation System as an admin
      WHEN I open the app interface
        THEN I see the user interface and an admin interface

1. GIVEN I want to use my Home Automation System as an admin
      WHEN I open the admin interface
        THEN I can manage devices and users

1. GIVEN I want to use my Home Automation System as an admin
      WHEN I open the admin interface 
        THEN I can assign device notifications to users (ALL, NONE, some selection)

1. GIVEN I want to boot my Home Automation System
      WHEN I log in as an admin AND I open the app's admin interface 
        THEN I need to see a blank screen
        OR the list of Devices found in my home

# Scenario: Booting Home Automation System (Hub)
1. GIVEN the Home Automation System is functional
      WHEN I open the app admin interface
        THEN I should see the log of the previous activities

2. GIVEN the Home Automation System is functional
      WHEN I add a new device to my system on the Client control
        THEN the Hub should register this new device to the system.

3. GIVEN the Home Automation System is functional
      WHEN I remove a device from my system on the Client Control
        THEN the Hub should deregister this new device from the system.

4. GIVEN the Home Automation System is functional
      WHEN I want to administer my devices
        THEN the Hub should show the device config screen

5. GIVEN the Home Automation System is functional
      WHEN the devices of the system are functional
        THEN the Hub should log all the activities of the devices and store them.

5. GIVEN the Home Automation System is functional
      WHEN the devices of the system are functional
        THEN the Hub should display device status visually: functioning, offline, error

5. GIVEN the Home Automation System is functional
      WHEN I click shutdown from the Client Control
        THEN the Hub should turn off all the devices 
        AND should safely shutdown the system
        AND notify about the activity on the Client.

# Scenario C: User wants to access camera

1. GIVEN a camera
      WHEN I click "Start" on the Client camera control
        THEN the camera turns on and I see the data from the Camera

2. GIVEN a functioning camera 
    And I am able to see the data from the Camera
      WHEN I click on record on the Client Camera control
        THEN my Camera starts recording

3. GIVEN a functioning Camera is recording
      WHEN I click on stop recording on the Client Camera control
        THEN my Camera stops recording

4. GIVEN a functioning camera and the capacity of recording is full
      WHEN I click on record on the Client camera control
        THEN my camera doesn't start recording and returns a alert message "Camera is Full" on the Client Camera control

5. GIVEN a functioning camera
      WHEN I click "Turn Off" on the Client camera control
        THEN the camera shuts down and I do not see the data from the Camera

6. GIVEN the Camera is functional
      WHEN the camera detects an object in front of it
        THEN my camera notifies Hub about the activity.


# Scenario D: User wants to access thermostat

1. GIVEN a thermostat
      WHEN I click "Start" on the Client control
        THEN the Thermostat becomes functional 
        And I can see the data of current temperature and temperature metrics (Celsius / Fahrenheit)

2. GIVEN a functional thermostat with metric set to Farenheit
      WHEN I set the temperature metric to Celsius on the Client control
        THEN I should see the thermostat data changing to its equivalent "Celsius"

3. GIVEN a functional thermostat with metric set to Celcius
      WHEN I set the temperature metric to Fahrenheit on the Client control
        THEN I should see the thermostat data changing to its equivalent "Fahrenheit"

4. GIVEN a functional thermostat
      WHEN I set the temperature to a particular value on the Client control
        THEN I should see the thermostat temperature value is set to the GIVEN value

5. GIVEN a functional thermostat
      WHEN I click "Turn Off" on the client control
        THEN I should see that the thermostat is turned off.


6. GIVEN a functional thermostat
      WHEN it automatically changes the temperature based on the climate outside
        THEN it should notify hub about this event.


# Scenario E: User wants to access lightbulb
1. GIVEN a  light bulb that is off
      WHEN I click "Toggle" on the client control
        THEN I should see the data that the Light Bulb is turned "On".

2. GIVEN a  light bulb that is On
      WHEN I click "Toggle" on the client control
        THEN I should see that the light bulb is turned "Off".

3. GIVEN a functional light bulb
      WHEN there is no one in the room (Camera notifies hub)
        THEN it should turn off and should notify Hub about the activity.

4. GIVEN a non-functional light bulb
      WHEN someone enters the room (Camera notifies hub)
        THEN it should turn on and should notify Hub about the activity.

# Scenario F: User wants to access smartplug
1. GIVEN a non-functional smartplug
      WHEN I click "Toggle" on the client control
        THEN I should see that the smartplug is "Turned On"

2. GIVEN a functional smartplug
      WHEN I click "Toggle" on the client control
        THEN I should see that the smartplug is "Turned Off"

3. GIVEN a functional smartplug
      WHEN I look at the client control
        THEN I should see the plug's current status (On/Off) of the smartplug


