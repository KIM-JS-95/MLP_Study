public class GuguDan {

    public static void main(String[] args) {

        for(int i=9; i>0; i-=3){
            System.out.println("   " + i + "단\t\t\t   " + (i-1) + "단\t\t\t   " + (i-2) + "단");
            for(int j=9; j>0; j--){

                System.out.printf("%2d * %2d = %2d\t",i ,j, i * j);
                System.out.printf("%2d * %2d = %2d\t",i-1, j, (i-1) * (j));
                System.out.printf("%2d * %2d = %2d\t",i-2 ,j , (i-2) * (j));
                System.out.println();
            }
        }
    }
}
