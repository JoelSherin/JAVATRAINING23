class rbibank{
    int getrateofinterest(){
        return 6;
    }
}
class SBI extends rbibank{
    int getrateofinterest(){
        return 8;
    }
}
class ICICI extends rbibank{
    int getrateofinterest(){
        return 9;
    }
}
class AXIS extends rbibank{
    int getrateofinterest(){
        return 10;
    }
}
public class test {
    public static void main(String[]args){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI rate of Interest:"+s.getrateofinterest());
        System.out.println("ICICI rate of Interest:"+i.getrateofinterest());
        System.out.println("AXIS rate of Interest:"+a.getrateofinterest());
    }
}
