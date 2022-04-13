import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        String s = "Hello World! 3+3 = 6";
        Scanner sc = new Scanner(s);

        System.out.println(sc.hasNext());
    }
}
