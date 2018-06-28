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
        Random rand = new Random();
        String personalIdSecondPart = Integer.toString(rand.nextInt(9999) + 10000);

        return dd + mm + yy + "-" + personalIdSecondPart;

    }

}
