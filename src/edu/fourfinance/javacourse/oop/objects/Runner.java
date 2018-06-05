package edu.fourfinance.javacourse.oop.objects;

public class Runner {

    private static void AnimalsTest() {

        Animal[] animals = new Animal[6];

        animals[0] = new Animal("dog", "Woof");
        animals[1] = new Animal("cat","Meow");
        animals[2] = new Animal("cow","Moo");
        animals[3] = new Animal("pig","Oink");
        animals[4] = new Animal("sheep","Baa");
        animals[5] = new Animal("fish","*silence*");

        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
        }

    }

    private static void PostalAddressTest() {
        System.out.println("---------------------------------------");

        PostalAddress address = new PostalAddress("Praha", "Zborovska", "1172/56");
        String addressEu = address.asEuroStyle();
        String addressUk = address.asUKStyle();
        String addressRu = address.asRussianStyle();

        System.out.println("EU standard: " + addressEu);
        System.out.println("UK standard: " + addressUk);
        System.out.println("ГОСТ: " + addressRu);
    }

    private static void DistanceTest() {
        System.out.println("---------------------------------------");

        Distance mmDist = new Distance(254);
        Distance inDist = new Distance(10.0);

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

