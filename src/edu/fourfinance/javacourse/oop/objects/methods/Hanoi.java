package edu.fourfinance.javacourse.oop.objects.methods;

class Hanoi {
    static void hanoiTower(int n, char from_pin, char to_pin, char buff_pin)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from pin " +  from_pin + " to pin " + to_pin);
            return;
        }
        hanoiTower(n-1, from_pin, buff_pin, to_pin);
        System.out.println("Move disk " + n + " from pin " +  from_pin + " to pin " + to_pin);
        hanoiTower(n-1, buff_pin, to_pin, from_pin);
    }
}
