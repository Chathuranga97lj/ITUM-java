package com.itum;

public class Bank {
    float getRate(){
        return 0.0f;
    }
}

class NTB extends Bank{
    float getRate() {
        return 0.8f;
    }
}

class HNB extends Bank{
    float getRate() {
        return 1.8f;
    }
}

class ICICBank extends Bank{
    float getRate() {
        return 2.3f;
    }
}

class TestPolymorprism{
    public static void main(String[] args) {
        Bank b;
        b = new NTB();
        System.out.println("NTB Rate: " + b.getRate());

        b = new HNB();
        System.out.println("HNB Rate: " + b.getRate());
    }
}

// 2 types of pholymorpism
// 1. compile time,  2. runtime
