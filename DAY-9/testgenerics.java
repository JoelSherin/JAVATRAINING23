import java.util.*;
class testgenerics
{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
        list.add("ramu");

        String s=list.get(1);
        System.out.println("element is:"+s);

        for(String ele: list){
            System.out.println(ele);
        }
        }
        }
