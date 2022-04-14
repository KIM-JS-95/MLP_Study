public class WrapperClassEX {
    public static void main(String[] args) {
        Integer i= new Integer(10);

        char c = '4';

        Double d = new Double(3.1234566);

        System.out.println(Character.toLowerCase('A'));

        if(Character.isDigit(c)){
            System.out.println(Character.getNumericValue(c));
        }

        System.out.println(Integer.parseInt("-123")); // 문자열 “-123”을 정수로 변환하여 출력
        System.out.println(Integer.parseInt("10", 16)); // 16진수로 표현된 문자열 “10”을 정수로 변환하여 출력
        System.out.println(Integer.toBinaryString(28)); // 28의 2진수 표현을 나타내는 문자열 출력
        System.out.println(Integer.bitCount(28)); // 28의 2진수에서 1의 개수출력
        System.out.println(Integer.toHexString(28)); // 28의 16진수 표현을 나타내는 문자열 출력
        System.out.println(i.doubleValue()); // i값(=10)을 double로 변환하여 출력
        System.out.println(d.toString()); // d값(=3.1234566)을 문자열로 변환하여 출력
        System.out.println(Double.parseDouble("44.13e-6")); // 문자열 “44.13e-16"을 double로 변환하여 출력


    }
}
