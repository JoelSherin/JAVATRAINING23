import java.util.ArrayList;
import java.util.List;

public class Stringlist {
    public static void main(String[] args) {
        List<String> l2=new ArrayList<String>();
        l2.add("Geek");
        l2.add("Gek");
        l2.add("Gk");
        l2.add("henek");
        l2.add("Grgk");
        l2.add("zegfd");
        boolean isPresent=l2.contains("Geek");
        System.out.println(isPresent);

        for(int i=0;i<l2.size();i++){
            System.out.println(l2.get(i)+" ");
        }

        System.out.println();

        for(String str:l2){
            System.out.println(str+" ");
        }
    }
}
