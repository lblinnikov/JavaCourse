package edu.fourfinance.javacourse.oop.objects.classmagic;

public class WaterBird extends Bird {
        private double swimSpeed;
        private double takeOffLength;

    public WaterBird(double walkDistance, double walkSpeed, double flightSpeed,
                     String foodType, double swimSpeed, double takeOffLength) {
        super(walkDistance, walkSpeed, flightSpeed, foodType);
        this.swimSpeed = swimSpeed;
        this.takeOffLength = takeOffLength;
    }

    public double getWaterSpeed(double distace){
        return swimSpeed;
    }

    public double getAverageSpeed(double distance){
        if (distance <= walkDistance)
            return walkSpeed;
        else if (distance <= takeOffLength)
            return walkSpeed;
        else
            return distance / ( takeOffLength / walkSpeed + (distance - takeOffLength) /flightSpeed );
    }
    
}


