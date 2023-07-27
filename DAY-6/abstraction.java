public class abstraction {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.draw();
        shape s=new circle1();
        s.draw();
        shape c=new rectangle();
        c.draw();
        shape s2=new circle1();
        s2.draw();
    }
}
abstract class shape{
    abstract void draw();
}
class rectangle extends shape{
    void draw(){
        System.out.println("draw rextangle");
    }
}
class circle1 extends shape{
    void draw(){
        System.out.println("drawing circle");
    }
}
