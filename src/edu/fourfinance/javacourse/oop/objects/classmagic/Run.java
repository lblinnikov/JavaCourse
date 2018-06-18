package edu.fourfinance.javacourse.oop.objects.classmagic;

public class Run {
    public static void main(String... arg) {

        Bird pigeon = new Bird(0.1, 0.1,0.1);
        Bird sparrow = new Bird(0.2,0.2,0.2);
        Bird tit = new Bird(0.1, 0.1, 0.5, "insects");

        Bird chicken = new RunningBird(4.0, "everything");
        Bird ostrich = new RunningBird(10.0, "meat");

        Bird penguin = new Penguin(0.2, 0.3);

    }
}
