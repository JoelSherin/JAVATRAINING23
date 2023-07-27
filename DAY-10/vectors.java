import java.util.Vector;
public class vectors {
    public static void main(String[] args) {
        Vector<String> l1=new Vector<String>();
        l1.add("Ravi");
        l1.add("Vijay");
        l1.add("Vijay");
        l1.add("Ajay");
        l1.addElement("Ranjith");
        System.out.println(l1.capacity());
        String s1=l1.firstElement();
        System.out.println(s1);
        System.out.println(l1);
    }
}
