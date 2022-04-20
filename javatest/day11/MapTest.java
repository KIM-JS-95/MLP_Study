import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args){
        HashMap list = new HashMap();

        list.put("0","lee");
        list.clear();//모두 제거
        list.put("1","cho");
        list.put("2","kim");
        list.put("3","chung");
        list.put("4","min");
        list.put("3","jung");

        //System.out.println(map.containsKey(1));

        print(list);//Set 만들기
    }

    // TODO: Map -> Set -> iterator -> key 값으로 출력
    public static void print(Map sets){
        Set set=sets.keySet(); // key값을 Set으로
        Iterator iter=set.iterator();
        while(iter.hasNext()){
            String key=(String)iter.next();
            System.out.println(key+"  "+sets.get(key));//value
        }
    }


}
