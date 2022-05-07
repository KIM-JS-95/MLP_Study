package test;

public class Test {
    public static void main(String args[]) {
        TestA a = new TestA(10);
        a.i = 200;
        a.go();
    }
}

class TestA {
    public int i = 100;

    public TestA(int i) {
        this.i = i;
    }

    public void go() {
        System.out.println("i = " + i);
    }
}