public class student{
    String stuname;
    int rollno;
    student(String stuname1,int rollno1 ){
        stuname=stuname1;
        rollno=rollno1;
    }
}
class student1 {
    public static void main (String[] args){
        student s1= new student("Rohan",1);
        System.out.println(s1.stuname+" "+s1.rollno);
        student s2= new student("heltin",2);
        System.out.println(s2.stuname+" "+s2.rollno);
    }
}

