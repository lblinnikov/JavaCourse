package random.mytraining;

public class Run {
    public static void main(String... arg) {

        PassengerCar myNewCar = new PassengerCar(
                "LB1992",
                "2018-05-05",
                "VOLVO",
                "XC90",
                "LEO35978456XDQ45987JR",
                "Levs Blinnikovs",
                "Levs Blinnikovs",
                "SUV",
                "11A",
                "456Z",
                2580,
                2500,
                "",
                2,
                2399,
                200,
                "Diesel",
                "",
                "",
                ""
                );

        System.out.println(myNewCar.getLicencePlate());

    }
}
