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
        Distance mmDist = new Distance(25, "mm");
        Distance inDist = new Distance(1, "in");

        int dist1 = mmDist.getMillimeters();
        double dist2 = mmDist.getInches();

        int dist3 = inDist.getMillimeters();
        double dist4 = inDist.getInches();

        System.out.println(dist1);
        System.out.println(dist2);
        System.out.println(dist3);
        System.out.println(dist4);


    }

    public static void main(String... arg) {

        //AnimalsTest();
        //PostalAddressTest();
        DistanceTest();

    }
}

