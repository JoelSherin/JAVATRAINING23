import java.util.*;

public class integertestgenerics {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        list.add(10);
        list.add(8);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(10);

        int s=list.get(12);
        System.out.println("element is:"+s);

        list.ensureCapacity(10);

        for(int ele :list){
            System.out.println(ele);
        }

        System.out.println("size is"+list.size());
    }
}
