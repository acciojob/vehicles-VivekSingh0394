package com.driver;
/*Car: extends Vehicle

        constructor: initialize the variables using parameters and set currentGear as 1.

        */
public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public int getWheels() {
        return wheels;
    }

    public String getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getSeats() {
        return seats;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }


    public void isManual(boolean manual) {
        isManual = manual;
    }

    public Car(String name,boolean isManual)
    {
        super(name);
        this.isManual=isManual;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        //Hint: Car extends Vehicle
       // Vehicle.name=name;
     //   this.name=name;
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.seats=seats;
        this.currentGear=1;


    }


    //changeGear(newGear): set the current gear to newGear parameter.

    public void changeGear(int newGear){
        this.currentGear=newGear;

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }
    //changeSpeed(newSpeed, newDirection): set the speed and direction using move().

    public void changeSpeed(int newSpeed, int newDirection){
     //    Vehicle.move(newSpeed,newDirection);
       move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
    /*public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentSpeed=speed;
        this.currentDirection=direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }*/
