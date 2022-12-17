package com.driver;
/*Vehicle: name, currentSpeed, currentDirection

        constructor: given the name of the vehicle, initialize speed and direction as 0.


        */
public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed=0;
        this.currentDirection=0;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = this.currentSpeed + currentSpeed;
    }

    //steer(direction): Add direction to the currentDirection
    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        this.currentDirection=this.currentDirection+direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }
    //move(speed, direction): set the current speed and direction

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentSpeed=speed;
        this.currentDirection=direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }
//stop(): Stop the car by setting current speed to 0
    public void stop(){
       this.currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
