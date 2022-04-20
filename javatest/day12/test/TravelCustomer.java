package test;

/**
 * 5. 스트림을 활용하여 여행객의 여행 비용 계산하기<p>
 * - 패키지 여행을 떠나는 고객들이 있다.<p>
 * - 여행비용 : 15세 이상 100만원, 그 미만은 50만원이다.<p>
 * - 고객 3명이 패키지 여행을 간다고 했을 때 비용 계산과 고객 명단 검색 등을 스트림을 활용하여 구현해 본다.<p>
 * - 고객 클래스를 정의하여 이름, 나이, 비용을 멤버변수로 가지며 getter를 제공한다.
 */
public class TravelCustomer {
 
    private String name;   //이름
    private int age;       //나이
    private int price;     //가격
    
    public TravelCustomer(String name, int age, int price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    public int getPrice() {
        return price;
    }
    
    public String toString() {
        return "name: " + name + "age: " + age + "price: " + price; 
    }
}