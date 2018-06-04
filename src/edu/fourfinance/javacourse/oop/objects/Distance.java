package edu.fourfinance.javacourse.oop.objects;

/*

Design a class Distance that should keep some size and that should support millimeters and inches as length units. // DONE
Equip the class with constructors to enter a size in both possible units.// DONE
(Hint: use int for millimeters and double for inches.)
Then create two getters to obtain a kept size in particular units.

 */

public class Distance {
    private int value;
    private String units;

    private int millimeters;
    private double inches;

    // 1 in = 25.4 mm

    Distance(int value, String units) {
        this.value = value;
        this.units = units;
    }

    public void setMillimeters(int millimeters) {
        if (units.equals("mm")) {
            this.millimeters = value;
        }
        else if (units.equals("in")) {
            this.millimeters = (int)(value*25.4);
        }
    }

    public void setInches(double inches) {
        if (units.equals("in")){
            this.inches = value;
        }
        else if (units.equals("mm")){
            this.inches = value/25.4;
        }
    }

    int getMillimeters() {
        return millimeters;
    }

    double getInches() {
        return inches;
    }
}
