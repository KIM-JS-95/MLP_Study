package test;

import java.text.DecimalFormat;

public class Rectangle {
  // 사각형 가로, 세로의 길이
  private int a;
  private int b;

  public Rectangle(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public Rectangle() {
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  // 사각형의 넓이
  public double Area() {
    return a * b;
  }

  // 사각형의 둘레
  public double Round() {
    return (a + b) * 2;
  }

  // 사각형의 넓이와 둘레 출력
  public void print() {
    DecimalFormat df = new DecimalFormat("####.##");
    System.out.println("---사각형의 넓이와 둘레---");
    System.out.println("가로, 세로의 길이: " + a + ", " + b);
    System.out.println("사각형의 넓이: " + df.format(Area()));
    System.out.println("사각형의 둘레: " + df.format(Round()) + "\n");
  }

}