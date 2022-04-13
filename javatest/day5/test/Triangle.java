package test;

import java.text.DecimalFormat;

class Triangle {
  // 삼각형 세변의 길이
  private int a;
  private int b;
  private int c;

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

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }

  // 삼각형의 넓이
  public double Area() {
    double s = (double) (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  // 삼각형의 둘레
  public double Round() {
    return a + b + c;
  }

  // 삼각형의 넓이와 둘레 출력
  public void print() {
    DecimalFormat df = new DecimalFormat("####.##");
    System.out.println("---삼각형의 넓이와 둘레---");
    System.out.println("세 변의 길이: " + a + ", " + b + ", " + c);
    System.out.println("삼각형의 넓이: " + df.format(Area()));
    System.out.println("삼각형의 둘레: " + df.format(Round()) + "\n");
  }

}