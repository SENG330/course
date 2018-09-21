package ca.uvic.seng330.m2;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args)
    {
        ArrayList<Car> fleet = new ArrayList<Car>();
        Car c = new Car(200,50);
        fleet.add(c);
        Car c2 = new Car(250,25);
        fleet.add(c2);
        //compare strategies
        fleet.sort(new ByAccelComparator());
        System.out.println(fleet);
        fleet.sort((car1, car2) -> car1.getBrakingDistance() - car2.getBrakingDistance());
        System.out.println(fleet);

    }
}