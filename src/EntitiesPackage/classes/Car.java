package EntitiesPackage.classes;

import  EntitiesPackage.abstractclasses.Machine;
import  EntitiesPackage.interfaces.Driveable;

public class Car extends Machine implements Driveable {
    private String color;
    private int seats;

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }

    @Override
    public void powerOn() {
        System.out.println("Car is starting...");
    }

    @Override
    public void powerOff() {
        System.out.println("Car is turning off...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    @Override
    public boolean hasFuel() {
        return true;
    }
}

