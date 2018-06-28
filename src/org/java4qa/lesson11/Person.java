package org.java4qa.lesson11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import static org.java4qa.lesson11.GovData.generatePersonalId;

public class Person implements
        Comparable<Person>, WithSex, NameHandler, LegalStatusAdvisor {

    public Date dateOfBirth;
    public Date dateOfDeath;

    public String firstName;
    public String lastName;

    public int dayOfBirth;
    public int monthOfBirth;
    public int yearOfBirth;

    public boolean isFemale;

    public String personalId;

    public Person(Date dateOfDeath, String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, boolean isFemale) {
        this.dateOfDeath = dateOfDeath;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.isFemale = isFemale;
        this.personalId = generatePersonalId(this);
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static int yearsSince(int day, int month, int year) {
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        Period diff = Period.between(dateOfBirth, LocalDate.now());
        return diff.getYears();
    }

    public void exposePersonalId() {
        System.out.println(personalId);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Person) return super.equals(other);
        else return false;
    }

    public int compareTo(Person other) {
        if (this.equals(other)) return 0; // or better this == other ?? In sense of equals method I override in Person class, better to have .equals?
        else return 1;
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
