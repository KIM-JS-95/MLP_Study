package test;

class RectTest10 {
    int width;
    int height;

    public RectTest10(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(RectTest10 p) {
        if (width * height == p.width * p.height) // 사각형 면적 비교
            return true;
        else
            return false;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        RectTest10 a = new RectTest10(2, 3);
        RectTest10 b = new RectTest10(3, 2);
        RectTest10 c = new RectTest10(3, 4);
        if (a.equals(b)) System.out.println("a is equal to b");
        if (a.equals(c)) System.out.println("a is equal to c");
        if (b.equals(c)) System.out.println("b is equal to c");
    }
}