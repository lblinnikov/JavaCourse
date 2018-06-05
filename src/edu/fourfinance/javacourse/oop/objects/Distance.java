package edu.fourfinance.javacourse.oop.objects;

/*

Design a class Distance that should keep some size and that should support millimeters and inches as length units. // DONE
Equip the class with constructors to enter a size in both possible units.// DONE
(Hint: use int for millimeters and double for inches.)
Then create two getters to obtain a kept size in particular units.

 */

class Distance {

    private int millimeters;
    private double inches;

    // 1 in = 25.4 mm

    Distance(int millimeters) {
        this.millimeters = millimeters;
        this.inches = millimeters/25.4;
    }

    Distance(double inches) {
        this.inches = inches;
        this.millimeters = (int)(25.4*inches);
    }

    int getMillimeters() {
        return millimeters;
    }

    double getInches() {
        return inches;
    }
}
