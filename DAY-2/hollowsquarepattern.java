public class hollowsquarepattern 
{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i==1)||(i==5)||(j==1)||(j==5)){
                System.out.print("*");}
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//when i=1  j will trace from 1 to 5
/*  i 1 2 3 4 5 
   j * * * * *
   1 *       *
   2 *       *
   3 *       *
   4 *       *
   5 * * * * *  */
