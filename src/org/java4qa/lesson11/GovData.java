package org.java4qa.lesson11;

import java.util.Random;

public class GovData {

    public static String generatePersonalId(Person person) {

        String yy = Integer.toString(person.getYearOfBirth()).substring(2);

        String dd;
        if(person.getDayOfBirth() >= 10) dd = Integer.toString(person.getDayOfBirth());
        else dd = "0" + Integer.toString(person.getDayOfBirth());

        String mm;
        if(person.getMonthOfBirth() >= 10) mm = Integer.toString(person.getMonthOfBirth());
        else mm = "0" + Integer.toString(person.getMonthOfBirth());

        // random part of 5 digits in every Latvian personal id. e.g. 080892-23123
        // additionally, will start with 1 is female and with 2 if male
        Random rand = new Random();
        String personalIdSecondPart = Integer.toString(rand.nextInt(999) + 1000);
        if(person.isFemale()) personalIdSecondPart = "1" + personalIdSecondPart;
        else personalIdSecondPart = "2" + personalIdSecondPart;

        return dd + mm + yy + "-" + personalIdSecondPart;

    }

}
