package test;

public class Shape {

  public static void main(String[] args) {
    Circle c = new Circle();
    c.setR(10);

    c.print();

    Triangle t = new Triangle();
    t.setA(4);
    t.setB(5);
    t.setC(6);

    t.print();

    Rectangle r = new Rectangle();
    r.setA(5);
    r.setB(10);

    r.print();

  }

}
