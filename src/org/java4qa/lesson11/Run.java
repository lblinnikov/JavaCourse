package org.java4qa.lesson11;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Run {
    public static void main(String... arg) {

        Person me =
                new Person(null, "Levs", "Blinnikovs", 8, 8, 1992, false);

        Person underage =
                new Person(null, "John", "Smith", 15, 12, 2003, false);

        Person kid =
                new Person(null, "Small", "Toddler", 11, 8, 2016, false);

        Person she =
                new Person(null, "Anna", "Claire", 20, 5, 1989, true);

        Person dopplegangerOne =
                new Person(null, "Mike", "Pike", 29, 5, 1969, false);

        Person dopplegangerTwo =
                new Person(null, "Mike", "Pike", 29, 5, 1969, false);

        // tests

        assertTrue(me.isAlive(), "Levs is alive!");
        assertTrue(underage.isUnderAge(), "Underage person should be underage!");
        assertTrue(kid.isChild(), "Kid is a child!");
        assertTrue(she.isFemale(), "She is a female!");

        // personal id generator
        me.exposePersonalId();
        she.exposePersonalId();

        // name change test
        me.changeFirstName("Leo");
        System.out.println(me.firstName);

        // surname change test
        she.changeLastName("Smith");
        System.out.println(she.lastName);

        // equality test
        System.out.println(dopplegangerOne.firstName + dopplegangerTwo.lastName);
        dopplegangerOne.exposePersonalId();
        System.out.println(dopplegangerTwo.firstName + dopplegangerTwo.lastName);
        dopplegangerTwo.exposePersonalId();

        System.out.println(dopplegangerOne.compareTo(dopplegangerTwo));


    }
}
