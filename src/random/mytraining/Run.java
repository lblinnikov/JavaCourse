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
                "B",
                2,
                2399,
                200,
                "Diesel",
                "",
                "",
                ""
                );

        TruckCar myTruckCar = new TruckCar(
                "BL2991",
                "1992-03-02",
                "MERCEDES BENZ",
                "408D",
                "EEO38G788T69DT359F7J8",
                "Levs Blinnikovs",
                "Levs Blinnikovs",
                "Truck",
                "",
                "",
                7680,
                4600,
                "C",
                1,
                3999,
                243,
                "Diesel",
                "",
                "2",
                "0"
        );

        System.out.println(
                myNewCar.getLicencePlate()
        );

        System.out.println(
                myTruckCar.getMaxPower()
        );

    }
}
