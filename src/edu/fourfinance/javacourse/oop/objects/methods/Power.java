package edu.fourfinance.javacourse.oop.objects.methods;

class Power {

    static int intPower(int x, int y){
        if(y == 0 && x == 0) return -1; //undefined
        if(x == 0) return 0;
        if(y == 0) return 1;
        int result = 1;
        for (int i = 1; i <= y; i++) result = result * x;
        return result;
    }

    static int intPowerRecursive(int x, int y){
        if(y == 0 && x == 0) return -1; //undefined
        if(x == 0) return 0;
        if(y == 0) return 1;
        return x * intPowerRecursive(x,y-1);
    }

}
