package test;

public class ex3 {
    public static void main(String[] args) {

        char c = 'C';
        String str = "C";

//        switch(c){  //정수 계열만 가능
//            case 'A':  //65
//                System.out.println("입력된 코드는 A 입니다.");
//                break;
//            case 'B':  //66
//                System.out.println("입력된 코드는 B 입니다.");
//                break;
//            case 'C':
//                System.out.println("입력된 코드는 C 입니다.");
//                break;
//            case 'D':
//                System.out.println("입력된 코드는 D 입니다.");
//                break;
//            default:
//                System.out.println("코드는 A부터 D까지 입력해야 합니다.");
//                break;
//        }


        //TODO: if

        if(c == 65){
            System.out.println("입력된 코드는 A 입니다.");
        }else if(c==66){
            System.out.println("입력된 코드는 B 입니다.");
        }else if(c==67){
            System.out.println("입력된 코드는 C 입니다.");
        }else if(c==68){
            System.out.println("입력된 코드는 D 입니다.");
        }else{
            System.out.println("코드는 A부터 D까지 입력해야 합니다.");
        }

    }

}
