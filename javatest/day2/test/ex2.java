package test;

public class ex2 {
    public static void main(String[] args) {
        int k = 1;

//        switch (k) {
//            case 1:
//                System.out.println("1 입니다.");
//                break;
//            case 2:
//                System.out.println("2 입니다.");
//                break;
//            case 3:
//                System.out.println("3 입니다.");
//                break;
//            case 4:
//                System.out.println("4 입니다.");
//                break;
//            default:
//                System.out.println("1부터 4까지 입력해야 합니다.");
//                break;
//        }

        //TODO : if문으로 변경

        if (k==1){
            System.out.println("1 입니다.");
        }else if(k==2){
            System.out.println("2 입니다.");
        }else if(k==3){
            System.out.println("3 입니다.");
        }else if(k==4){
            System.out.println("4 입니다.");
        }else{
            System.out.println("1부터 4까지 입력해야 합니다.");
        }

    }
}
