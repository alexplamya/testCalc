package org.example;

public class Calc {
    public int sum(int a, int b){
    int result;
    result = a+b;
        System.out.println("Сумма "+ a + " и " +b + " равна: "+result);
      //  System.out.printf("Сумма %d и %d равна: %d", a, b, result);
        return result;
    }
}
