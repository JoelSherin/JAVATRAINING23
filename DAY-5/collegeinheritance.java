class student 
{
    int rollno=1;
    String name="ram";
    String collegename="Presi";
}
class collegeinheritance extends student
{
    public static void main(final String[] args)
    {
        collegeinheritance s1=new collegeinheritance();
        
        System.out.println(s1.rollno);

        System.out.println(s1.name);

        System.out.println(s1.collegename);
    }
}
