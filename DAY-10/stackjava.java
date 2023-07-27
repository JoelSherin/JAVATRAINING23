import java.util.*;
class stack{
    public static void main(String[] args) {

        System.out.println();

        Stack<String> s1=new Stack<String>();
        s1.push("Ayush");
        s1.push("Aqfg");
        s1.push("Mamba");
        s1.push("Vitra");
        s1.push("Lenny");

        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.search("Mamba"));

        System.out.println();

        Iterator<String> itr=s1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
    }
}