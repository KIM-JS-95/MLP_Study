package test;

import java.util.Iterator;
import java.util.Vector;

public class Test1 {

    public static void main(String[] args) {
        Vector<Character> v = new Vector<Character>();

        char[] arr = {'오','늘','은', '4','월', '2','0','일','입','니','다','.'};

        for(char val : arr){
            v.add(val);
        }

        print(v);
    }

    private static void print(Vector<Character> v) {
        Iterator<Character> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
