package test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class pro1 {
    public static void main(String[] args) {

        // TODO: 1. 배열의 저장된 5개의 점수를 생성해서 반복문으로 배열 일관처리로
        //   총점을 구한후 평균을 구해서 출력하세요.

        //solution1();


        // TODO: 2. 배열의 저장된 5개의 실수를 생성후 최대값과 최소값을 구한후
        //   출력하세요.
        //solution2();

        //TODO: 3. 배열에 저장된 5개의 음수, 양수를 절대값을 구해서
        //   출력하세요

        //solution3();

        //TODO:4. 프로그램 실행시 main 인자값으로 본인이 정보(이름, 전화번호, 주소,주민번호)를 입력받아
        //  이름, 전화번호, 주소, 나이를 출력하세요.

        // solution4();

        //TODO: 프로그램 실행시 main 인자값으로  숫자 2개를 입력받아서 최대값과 최소값을 구해서 
        //   출력하세요. 

        //solution5();


        //TODO: 6. 프로그램 실행시 main 인자값으로 정수를 입력받아서 양수인지, 음수인지, 0인지를
        //   판단후 출력하세요.

        //solution6();

        //TODO: 7.  다음의 코드조각들을 바르게 조합하여 아래 결과값이
        //    출력되도록 만들어 보세요

        solution7();

        // TODO: 8. 자바의 기본형타입(8가지)과 크기를 byte단위로 명시하세요

        /*
         * 정수형 타입 : byte(1byte), short(2byte), int(4byte), long(8byte)
         * 실수형 타입 : float(4byte), double(8byte)
         * 문자형 타입 : char(2byte)
         * 논리 타입: boolean(1byte)
         */

        //TODO: 9. 문장내에서 continue 문을 쓸수 없는 문장은?
        //  답: switch문


        //TODO: 10. 실행되는 순서를 작성하세요
        //  답:  [1] -> [2] -> [4] -> [3] -> [2] -> [4] -> [3] ...
        /*
         for(int i=0;i<100;i++){
          [1]    [2]    [3]

        [4] -실행내용
        }
    */

        //TODO: 11. Scanner객체를 이용하여 나의정보(이름, 주소, 생일)를
        //    입력받아서 정보(이름,주소,나이)를 출력하는 class를 작성하세요

        //solution11();
    }

    private static void solution11() {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


    }

    private static void solution7() {
            for(int x=0; x<4; x++) {
                for(int y=4; y>2; y--) {
                    System.out.println(x + "  " + y);
                }
                if (x==1) {
                    x++;
                }
            }
        }


    private static void solution6() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            System.out.println("0 입니다.");
        } else if (i > 0) {
            System.out.println("양수 입니다.");
        } else {
            System.out.println("음수 입니다.");
        }
    }

    private static void solution5() {
        Scanner sc = new Scanner(System.in);
        int[] args = new int[2];
        for (int i = 0; i < args.length; i++) {
            args[i] = sc.nextInt();
        }
        // TODO: arg를 입력 받음을 가정

        Arrays.sort(args);
        int max = args[0];
        int min = args[0];

        System.out.printf("max = %d \n min = %d", max, min);
    }

    private static void solution4() {
        Scanner sc = new Scanner(System.in);
        //주민번호에서 나의 태어난 연도 뽑기
        String[] args = new String[4];
        for (int i = 0; i < 4; i++) {
            args[i] = sc.next();
        }

        // TODO: arg를 입력 받음을 가정

        String jumin = args[3]; //921008-2078815
        int iage = Integer.parseInt(jumin.substring(0, 2));
        iage += 1900; //1992

        //현재년도 알아내기
        Calendar calendar = Calendar.getInstance();
        int currYear = calendar.get(Calendar.YEAR);

        System.out.println(currYear - iage + 1);
    }

    private static void solution3() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int val : arr) {
            System.out.println(Math.abs(val));
        }

    }

    private static void solution2() {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        double max = arr[0];
        double min = arr[arr.length - 1];

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }

    private static void solution1() {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        for (double val : arr) {
            sum += val;
        }

        double result = sum / arr.length;

        System.out.println(result);

    }
}
