package org.example;

public class Calc {
    public int sum(int a, int b) {
        int result;
        result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равна: " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result2;
        result2 = a - b;
        System.out.println("Разница " + a + " и " + b + " равна: " + result2);
        return result2;
    }
}