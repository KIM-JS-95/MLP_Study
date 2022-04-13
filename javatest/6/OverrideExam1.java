class OverA {
    void show(String str) {
        System.out.println("상위클래스의 메소드 show(String str) 수행 " + str);
    }
    void show(){}
} 

class SubOverA extends OverA {
    @Override
    void show() { 
        System.out.println("하위클래스의 메소드 show() 수행"); 
    }

    void show(String str1, String str2) {
        System.out.println("상위클래스의 메소드 show(String str) 수행 " + str1 +","+ str2);
    }
} 
       
public class OverrideExam1 { 
    public static void main(String args[]) { 
        SubOverA over = new SubOverA();

        // 오버라이딩

        System.out.println("1. 슈퍼클래스 호출");
        over.show("IT KOREA");

        System.out.println("2. 오버로딩");
        over.show("IT KOREA", "IT USA");

        System.out.println("3. 오버라이딩");
        over.show(); 
    } 
} 