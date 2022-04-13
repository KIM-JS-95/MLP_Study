package test;

import java.util.Scanner;

public class Calc {
    private int a;
    private int b;
    private String oper;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 a와 b를 입력하세요");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("원하는 연산을 입력하새요. : 술연산(+, -, *, /, %)");
        oper= sc.next();
    }

    public void ccc() {

        if(oper.equals("+")){
            System.out.println("더한값은 다음과 같습니다.: "+ (a + b));
        }else if(oper.equals("-")){
            System.out.println("뺀값은 다음과 같습니다.: "+ (a - b));
        }else if(oper.equals("/")){
            System.out.println("나눈값은 다음과 같습니다.: "+(a / b));
        }else if(oper.equals("*")){
            System.out.println("곱한값은 다음과 같습니다.: "+(a * b));
        }else if(oper.equals("%")) {
            System.out.println("나머지값은 다음과 같습니다.: "+(a % b));
        }else{
            System.out.println("해당 연산자를 찾을 수 없습니다.");
        }

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

    public void setOper(String oper) {
        this.oper = oper;
    }

    public String getOper() {
        return oper;
    }
}
