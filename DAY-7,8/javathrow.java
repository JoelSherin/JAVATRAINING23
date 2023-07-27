public class javathrow {
    public static void validate(int age)
    {
        if(age<18)
        {
            //throw arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else{
            System.out.println("Person is eligible to vote");
        }
    }
    public static void main(String[] args) {
        try
        {
            validate(13);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
        System.out.println("rest of the code...");
    }
}