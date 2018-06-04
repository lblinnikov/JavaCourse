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
        System.out.println("---------------------------------------");

        PostalAddress address = new PostalAddress("Praha", "Zborovska", "1172/56", "14", "150 00");
        String ADDRESS_EU = address.asEuroStyle();
        String ADDRESS_UK = address.asUKStyle();
        String ADDRESS_RU = address.asRussianStyle();


        System.out.println("EU standard: " + ADDRESS_EU);
        System.out.println("UK standard: " + ADDRESS_UK);
        System.out.println("ГОСТ: " + ADDRESS_RU);
    }

    private static void DistanceTest() {
        System.out.println("---------------------------------------");

        Distance mmDist = new Distance(254, "mm");
        Distance inDist = new Distance(10, "in");

        //Distance kmDist = new Distance(100, "km"); // covered

        int dist1 = mmDist.getMillimeters();
        double dist2 = mmDist.getInches();

        int dist3 = inDist.getMillimeters();
        double dist4 = inDist.getInches();



        System.out.println(dist1+ " mm");
        System.out.println(dist2+ " in");
        System.out.println(dist3+ " mm");
        System.out.println(dist4+ " in");


    }

    public static void main(String... arg) {

        System.out.println("-----------------BEGIN-----------------");

        AnimalsTest();

        PostalAddressTest();

        DistanceTest();

        System.out.println("-----------------END-------------------");

    }
}

