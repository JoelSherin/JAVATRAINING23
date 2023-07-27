import java.util.HashMap;
import java.util.Map;

public class mapgenerics {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap()>();
        map.put(1,"vijay");
        map.put(4,"umesh");
        map.put(2,"ankit");

        Set<Map.Entry<Integer,String>>itr=set.iterator();
        while(itr.hasNext());
        Map.Entry e=itr.next();
        System.out.println(e.getKey()+" "+e.getValue());
    }
}
