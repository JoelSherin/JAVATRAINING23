import java.util.Scanner;
public class testarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<=4;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<=4;i++){
            System.out.print(a[i]+"");
        }
        System.out.println();
        for(int i:a){
            System.out.print(i+" ");
        }

    }
}
