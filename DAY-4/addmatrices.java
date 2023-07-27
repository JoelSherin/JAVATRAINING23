import java.util.Scanner;
class addmatrices{
    public static void main(String[]args){
        int m,n,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number of rows of matrix");
        m=sc.nextInt();
        System.out.println("Input the number of columns of matrix");
        n=sc.nextInt();

        int array1[][]=new int[m][n];
        int array2[][]=new int[m][n];
        int sum[][]=new int[m][n];
        System.out.println("Enter for first array");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                array1[c][d]=sc.nextInt();
            }
        }
        System.out.println();
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.print(" "+array1[c][d]);
            }
        }
        System.out.println("Enter for second array");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                array2[c][d]=sc.nextInt();
            }
        }
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.print(" "+array2[c][d]);
            }
        }
        System.out.println("Summation array");
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                sum[c][d]=array1[c][d]+array2[c][d];
            }
        }
        for(c=0;c<m;c++){
            for(d=0;d<n;d++){
                System.out.print(" "+sum[c][d]);
            }
        }
    }
}