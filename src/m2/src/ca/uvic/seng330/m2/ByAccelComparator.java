package ca.uvic.seng330.m2;

import java.util.Comparator;

public class ByAccelComparator implements Comparator<Car>
{
    @Override
    public int compare(Car o1, Car o2)
    {
        return o1.getTopSpeed()- o2.getTopSpeed();
    }

}