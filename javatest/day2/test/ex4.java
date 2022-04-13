package test;

public class ex4 {

    public static void main(String[] args) {

    int grade = 50;

    if(90<=grade){
        System.out.println("등급은 A입니다.");
    }else if(80<=grade && grade<90){
        System.out.println("등급은 B입니다.");
    }else if(70<=grade && grade<80){
        System.out.println("등급은 C입니다.");
    }else if(60<=grade && grade<70){
        System.out.println("등급은 D입니다.");
    }else{
        System.out.println("노력하세요.");
    }

    // TODO: if 문으로 작성하기
/*점수              출력 내용
================================
100
99~90           등급은 A입니다.
89~80                  B
79~70                  C
69~60                  D
59 이하         노력하세요.
*/
    }
}
