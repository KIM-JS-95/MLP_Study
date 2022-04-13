package test;

import java.text.DecimalFormat;

class Circle {
  private int r; // 원의 반지름

  public int getR() {
    return r;
  }

  public void setR(int r) {
    this.r = r;
  }

  // 원의 넓이
  public double Area() {
    return r * r * Math.PI;
  }

  // 원의 둘레
  public double Round() {
    return 2 * Math.PI * r;
  }

  // 원의 넓이와 둘레 출력
  public void print() {
    DecimalFormat df = new DecimalFormat("####.##");
    System.out.println("---원의 넓이와 둘레---");
    System.out.println("반지름: " + r);
    System.out.println("원의 넓이: " + df.format(Area()));
    System.out.println("원의 둘레: " + df.format(Round()) + "\n");
  }
}