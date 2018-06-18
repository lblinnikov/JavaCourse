package edu.fourfinance.javacourse.oop.objects.classmagic;

public class Bird {
    protected double walkDistance;
    protected double walkSpeed;
    protected double flightSpeed;
    protected String foodType;

    public Bird(double walkDistance, double walkSpeed, double flightSpeed, String foodType) {
        this.walkDistance = walkDistance;
        this.walkSpeed = walkSpeed;
        this.flightSpeed = flightSpeed;
        this.foodType = foodType;
    }

    public Bird(double walkDistance, double walkSpeed, double flightSpeed) {
        this(walkDistance, walkSpeed,flightSpeed, "herbs");
    }


    public double getAverageSpeed(double distance){
        if (distance <= walkDistance)
            return walkSpeed;
        else return flightSpeed;
    }

}


