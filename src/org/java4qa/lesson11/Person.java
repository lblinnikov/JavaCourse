package org.java4qa.lesson11;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person implements
        Comparable<Person>, WithSex, NameHandler, LegalStatusAdvisor {

    public Date dateOfBirth; // how to use it in yearsSince function?
    // Isn't it better to pass Date instead of triplet of day, month, year?
    public Date dateOfDeath;

    public String firstName;
    public String lastName;

    public int dayOfBirth;
    public int monthOfBirth;
    public int yearOfBirth;

    public boolean isFemale;

    public BigInteger personalId;

//    public Gender gender;

    public static int yearsSince(int day, int month, int year) {
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        Period diff = Period.between(dateOfBirth, LocalDate.now());
        return diff.getYears();
    }


    public int compareTo(Person person) {
        // TODO implement comparer
        return 0;
    }

    public boolean isChild() {
        return yearsSince(dayOfBirth, monthOfBirth, yearOfBirth) < 12;
    }

    public boolean isUnderAge() {
        return yearsSince(dayOfBirth, monthOfBirth, yearOfBirth) < 18;
    }

    public boolean isAlive() {
        return dateOfDeath == null;
    }

    public void changeFirstName(String name) {
        this.firstName = name;
    }

    public void changeLastName(String name) {
        this.lastName = name;
    }

    public boolean isFemale() {
        return isFemale;
    }
}
