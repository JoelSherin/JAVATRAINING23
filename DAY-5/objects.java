import java.util.Scanner;
class objects{
        double marks1,marks2,marks3,marks4;
        int rollno;
        String stu_name;
    public static void main(String[]args){
        objects s1=new objects();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks1 for student1");
        s1.marks1=sc.nextDouble();

        System.out.println("Enter marks2 for student1");
        s1.marks2=sc.nextDouble();

        System.out.println("Enter marks3 for student1");
        s1.marks3=sc.nextDouble();

        System.out.println("Enter marks4 for student1");
        s1.marks4=sc.nextDouble();
        System.out.println("The average marks for student1 is:"+s1.average());
    }
    Double average(){
        double avg=(marks1+marks2+marks3+marks4)/4;
        return (avg);
    }
}