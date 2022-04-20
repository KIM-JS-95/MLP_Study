import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector v = new Vector(); // 디폴트 용량 10의 벡터 생성
        v.add("Hello"); // String 객체 요소 삽입
        v.add(new Integer(4)); // Integer 객체 요소 삽입
        v.add(new Double(3.14));  // Double 객체 요소 삽입
        System.out.println("벡터내의 요소 객체 수 :" + v.size()); // 크기는 3
        System.out.println("벡터의 현재 용량 :" + v.capacity()); // 용량은 10

        for (int i = 0; i < v.size(); i++) {
            Object obj = v.get(i); // 해당 인덱스의 요소 얻어오기
            if (obj instanceof String) { // String 객체의 경우
                String str = (String) obj;
                System.out.println(str);
            } else if (obj instanceof Integer) { // Integer 객체의 경우
                Integer x = (Integer) obj;
                int n = x.intValue();
                System.out.println(n);
            } else if (obj instanceof Double) { // Double 객체의 경우
                Double y = (Double) obj;
                double d = y.doubleValue();
                System.out.println(d);
            }
        }
    }
}