package org.java4qa.lesson11;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person implements
        Comparable, WithSex, NameHandler, LegalStatusAdvisor {

    public String firstName;
    public String lastName;
    public Date dateOfBirth;
    public BigInteger personalId;

//    public Gender gender;

    public static int yearsSince(int day, int month, int year) {
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        Period diff = Period.between(dateOfBirth, LocalDate.now());
        return diff.getYears();
    }


    public int compareTo(Object o) {
        return 0;
    }

    public boolean isChild() {
        return false;
    }

    public boolean isUnderAge() {
        return false;
    }

    public boolean isAlive() {
        return false;
    }

    public void changeFirstName(String name) {
        this.firstName = name;
    }

    public void changeLastName(String name) {
        this.lastName = name;
    }

    public boolean isFemale() {
        return false;
    }
}
