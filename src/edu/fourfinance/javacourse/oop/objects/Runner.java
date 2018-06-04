package edu.fourfinance.javacourse.oop.objects;

public class Runner {

    private static void AnimalsTest() {

        Animal[] animals = new Animal[6];

        animals[0] = new Animal("dog");
        animals[1] = new Animal("cat");
        animals[2] = new Animal("cow");
        animals[3] = new Animal("pig");
        animals[4] = new Animal("sheep");
        animals[5] = new Animal("fish");

        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
        }

    }

    private static void PostalAddressTest() {
        PostalAddress address = new PostalAddress("Praha", "Zborovska", "1172/56", "14", "150 00");
        String ADDRESS_EU = address.asEuroStyle();
        String ADDRESS_UK = address.asUKStyle();
        String ADDRESS_RU = address.asRussianStyle();
        System.out.println("EU standard: " + ADDRESS_EU);
        System.out.println("UK standard: " + ADDRESS_UK);
        System.out.println("ГОСТ: " + ADDRESS_RU);
    }

    private static void DistanceTest() {
        Distance mmDistance = new Distance(100, "mm");
        Distance inDistance = new Distance(4, "in");

        double distance1 =  mmDistance.getInches();
        int distance2 =  mmDistance.getMillimeters();

        double distance3 = inDistance.getInches();
        int distance4 = inDistance.getMillimeters();

        System.out.println(distance1);
        System.out.println(distance2);

        System.out.println(distance3);
        System.out.println(distance4);

    }

    public static void main(String... arg) {

        AnimalsTest();
        PostalAddressTest();
        DistanceTest();

    }
}

