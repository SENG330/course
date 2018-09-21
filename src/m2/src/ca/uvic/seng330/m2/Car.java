package ca.uvic.seng330.m2;

final class Car implements Comparable<Car>{
    private final int topSpeed;
    private final int brakingDistance;

    public Car(Car c) {
        topSpeed = c.topSpeed;
        brakingDistance = c.brakingDistance;
    }

    public Car(int topSpeed, int brakingDistance) {
        this.topSpeed = topSpeed;
        this.brakingDistance = brakingDistance;
    }

    public int getBrakingDistance() {
        return brakingDistance;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    //we don't have an Enum to use for comparison
    public int compareTo(Car o) {
        return topSpeed - o.topSpeed;
    }
}
