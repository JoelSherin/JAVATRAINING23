public class fibonacci {
    public static void main(String[]args){
        int number=10;
        int n1=0,n2=1;
        int counter=0;
        while(counter<number){
            System.out.println(n1);
            int n3=n2+n1;
            n1=n2;
            n2=n3;
            counter=counter+1;
        }
    }
}
