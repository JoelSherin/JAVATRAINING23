import java.util.ArrayList;
import java.util.List;

public class listindex {
    public static void main(String[] args) {
        List<Integer> l2=new ArrayList();
        l2.add(7);
        l2.add(11);
        l2.add(13);
        l2.add(17);
        l2.add(21);
        l2.add(13);

        int index=l2.indexOf(13);
        System.out.println(index);

        int lastindex=l2.lastIndexOf(13);
        System.out.println(lastindex);
    }
}
