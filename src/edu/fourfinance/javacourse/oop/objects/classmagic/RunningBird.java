package edu.fourfinance.javacourse.oop.objects.classmagic;

public class RunningBird extends Bird {

    public RunningBird(double walkSpeed, String foodType) {
        super(Double.POSITIVE_INFINITY, walkSpeed, 0.0, foodType);
    }

    public double getAverageSpeed(double distance) {
        return walkSpeed;
    }

}

