package org.java4qa.lesson11;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Random;

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

    public String personalId;

    public Person(Date dateOfDeath, String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, boolean isFemale) {
        this.dateOfDeath = dateOfDeath;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.isFemale = isFemale;
        this.personalId = generatePersonalId();
    }

    //    public Gender gender;

    public static int yearsSince(int day, int month, int year) {
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        Period diff = Period.between(dateOfBirth, LocalDate.now());
        return diff.getYears();
    }

    public String generatePersonalId() {

        String yy = Integer.toString(yearOfBirth).substring(2);

        String dd;
        if(dayOfBirth >= 10) dd = Integer.toString(dayOfBirth);
        else dd = "0" + Integer.toString(dayOfBirth);

        String mm;
        if(monthOfBirth >= 10) mm = Integer.toString(monthOfBirth);
        else mm = "0" + Integer.toString(monthOfBirth);

        // random part of 5 digits in every Latvian personal id. e.g. 080892-23123
        Random rand = new Random();
        String personalIdSecondPart = Integer.toString(rand.nextInt(9999) + 10000);

        return dd + mm + yy + "-" + personalIdSecondPart;
    }

    public void exposePersonalId() {
        System.out.println(personalId);
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
