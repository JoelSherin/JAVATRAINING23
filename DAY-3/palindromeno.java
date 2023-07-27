public class palindromeno {
    public static void main(String[]args){
        int num=101;
        int orginal=num; 
        int reversednum=0;
        int remainder=0;
        while(num!=0){
            remainder=num%10;
            reversednum=reversednum*10+remainder;
            num=num/10;
        }
        if(orginal==reversednum){
            System.out.println("the number is a palindrome:");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}
