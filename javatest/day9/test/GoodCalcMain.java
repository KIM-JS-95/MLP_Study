package test;


abstract class Calculator {
    public abstract int add(int a, int b);

    public abstract int subtract(int a, int b);

    public abstract double average(int[] a);
}


class GoodCalc extends Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return Math.abs(a - b);
    }

    @Override
    public double average(int[] a) {
        double sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum / (double) a.length;
    }
}

public class GoodCalcMain {
    public static void main(String[] args) {
        GoodCalc c1 = new GoodCalc();

        System.out.println("add: "+c1.add(10, 20));
        System.out.println("subtract: "+c1.subtract(10, 20));
        int[] a = {10, 20, 30, 43, 50};
        System.out.println("average: "+c1.average(a));
    }
}
