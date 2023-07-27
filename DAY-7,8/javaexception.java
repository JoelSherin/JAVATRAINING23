public class javaexception {
    public static void main(String[] args) {
        try
        {
        int data=100/0;
            System.out.println(data);
            // String s = null;
            // System.out.println(s.length());
            // String a = "abc";
            // int i = Integer.parseInt(a);
            // System.out.println(i);
            int a[] = new int[5];
            a[6] = 1000;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println(e);
        // }
        // catch(NumberFormatException e)
        // {
        //     System.out.println(e);
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e);
        // }
        // catch(NullPointerException e)
        // {
        //     System.out.println(e);
        // }
        
        //     System.out.println("rest of the code...");
        
    }
}