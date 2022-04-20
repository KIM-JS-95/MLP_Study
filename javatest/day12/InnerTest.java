class OutClass {

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    // 내부 클래스 생성
    public OutClass() {
        inClass = new InClass();
    }

    // end 내부 인스턴스 클래스
    class InClass {

        int inNum = 100;
        //static int sInNum = 200;  //에러 남

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
        }
    }

    // end 내부 정적 클래스
    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println("InstanceClass  in Num = " + inNum + "(내부 클래스의 인스턴스 사용)");
            System.out.println("InstanceClass  in Num = " + sInNum + "(내부 클래스의 정적 인스턴스 사용)");
            System.out.println("OutClass sNum = " + sNum+ "(외부 클래스의 정적 인스턴스 사용)");
        }
    }

    public void usingClass() {
        inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
    }

}


public class InnerTest {

    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();    // 내부 클래스 기능 호출
        System.out.println();

    }
}
