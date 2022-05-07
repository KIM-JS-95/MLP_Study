package test;

class OverA {
    void show(String str) {
        System.out.println("상위클래스의 메소드 show(String str) 수행 " + str);
    }
}

class SubOverA extends OverA {
    void show() {
        System.out.println("하위클래스의 메소드 show() 수행");
    }
}