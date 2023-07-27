import java.util.Scanner;

class fiveposnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            if (a[i] > 0) {
                System.out.println("Valid number");
                sum += a[i];
            }
        }
        
        System.out.println("Sum of positive numbers: " + sum);
    }
}