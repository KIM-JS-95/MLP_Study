package test;

interface IShapeCircle {
    //TODO: 원 / 사각 넓이
    double area();

    //TODO: 원 / 사각 길이(둘레)
    double areaLen();

    void print();
}

interface IShapeTriangle {

    //TODO: 원 / 삼각 넓이
    double Triarea();

    //TODO: 원 / 삼각 길이(둘레)
    double Trilen();

    void print();
}

class Cir implements IShapeCircle {
    final int PI = (int) 3.14;
    private double w;
    private double h;

    public Cir(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public Cir() {
    }


    public double area() {
        if (w == h) {
            return Math.pow(w, 2) * PI;
        }
        return w * h;
    }

    public double areaLen() {
        if (w == h) {
            return w * 2 * PI;
        }
        return (w + h) * 2;
    }

    @Override
    public void print() {
        System.out.println("도형의 길이 입력 (생성자 방식)");
        if(w==h){
            System.out.println("원의 반지름은?: " + w);
        }else{
            System.out.println("사각형의 길이는?: " + w + "" + h);
        }

        System.out.println("넓이는?: " + area());
        System.out.println("둘레는?: " + areaLen());
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}

class Triangle2 implements IShapeTriangle {
    private double a;
    private double b;
    private double c;
    private double r;

    public Triangle2(double a, double b, double c, double r) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.r = r;
    }

    public Triangle2() {
    }


    @Override
    public double Triarea() {
        return a + b + c;
    }

    @Override
    public double Trilen() {
        return 0.5 * r * (Triarea());
    }

    @Override
    public void print() {
        System.out.println("도형의 길이 입력 (생성자 방식)");
        System.out.println("삼각형의 반지름은?: " + r);
        System.out.println("삼각형의 넓이는?: " + Triarea());
        System.out.println("삼각형의 둘레는?: " + Trilen());
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

}

public class CalcShape {
    public static void main(String[] args) {

        Cir cir1 = new Cir(20, 30);
        cir1.print();

        Triangle2 t = new Triangle2(10, 20, 30, 5);
        t.print();
    }
}
