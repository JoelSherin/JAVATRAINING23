import java.util.LinkedList;
import java.util.Iterator;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("Ravi");
        l1.add("Vijay");
        l1.add("Vijay");
        l1.add("Ajay");

        Iterator <String> itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}

//Linked list
//implements collection interface
//it uses a doubly linked list internallly to store the elements
//it can store the duplicate elements
//it mainintains the insertion order and is not synchronized
//in linked list,the manupulator is fast because no shifting is required
