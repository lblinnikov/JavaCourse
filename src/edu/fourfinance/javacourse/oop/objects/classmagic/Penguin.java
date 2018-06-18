package edu.fourfinance.javacourse.oop.objects.classmagic;

public class Penguin extends WaterBird {

    public Penguin(double walkSpeed, double swimSpeed) {
        super(Double.POSITIVE_INFINITY, walkSpeed, 0.0 , "fish", swimSpeed, 0.0);
    }

    public double getAverageSpeed(double distance){
        return walkSpeed;
    }
    
}


