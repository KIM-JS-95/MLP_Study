interface StringConcat{
    void makeString(String s1, String s2);
}

class StringConcatImpl implements StringConcat{

    @Override
    public void makeString(String s1, String s2) {
        System.out.println( s1 + "," + s2 );
    }
}
public class TestStringConcet {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        StringConcat concat2 = (s, v)->System.out.println(s + "," + v );

        concat2.makeString(s1, s2);
    }
}
