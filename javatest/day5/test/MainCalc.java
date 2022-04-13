package test;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.input();

        System.out.println("==========================");
        System.out.println("결과는 다음과 같습니다.");
        System.out.println("--------------------------");
        calc.ccc();

    }
}
