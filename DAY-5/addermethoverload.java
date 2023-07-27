class adder{
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    static double sum(double a,double b,double c){
        return a+b+c;
    }
    static float sum(float a,float b){
        return a+b;
    }
}
public class addermethoverload {
    public static void main(String[]args){
        System.out.println(adder.sum(10,20));
        System.out.println(adder.sum(10,20,30));
        System.out.println(adder.sum(10,20,30,40));
        System.out.println(adder.sum(10.0,20.1,30.9));
        System.out.println(adder.sum(10.3484f,20.92345f));
    }
}
//add three more add functions (4 integres ,3 doubles,2 floats)
//base class college (base class has instance variable,also college name mentioned inside that declare and initiaize)
   //derived class student has (roll number and student name)
   //[main class]seperate single inheritance class (object of type student)(access college_name,rollno,studentname)