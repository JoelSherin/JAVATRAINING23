public class constructor {
        double marks1,marks2,marks3,marks4;
        int rollno;
        String stu_name;

        constructor(){
            marks1=44.9;
            marks2=60.8;
            marks3=70.0;
            marks4=80.0;
            rollno=1001;
            stu_name="rohit";
        }
}
class main{
    public static void main(String[]args){
        constructor s1=new constructor();
        System.out.println(s1.rollno+" "+s1.stu_name+" "+s1.marks1);
        System.out.println(s1.marks2+" "+s1.marks2+" "+s1.marks4);
        constructor s2=new constructor();
        System.out.println(s2.rollno+" "+s2.stu_name+" "+s2.marks1);
        System.out.println(s2.marks2+" "+s2.marks2+" "+s2.marks4);
    }
}



