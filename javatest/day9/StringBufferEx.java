public class StringBufferEx {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("this");
        System.out.println(sb.hashCode());

        sb.append(" is pencil");
        System.out.println(sb);
        System.out.println(sb.hashCode());

        sb.insert(7, " my");
        System.out.println(sb);
        System.out.println(sb.hashCode());

        sb.replace(8,9,"your");
    }
}
