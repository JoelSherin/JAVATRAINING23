import java.io.File;
import java.util.Scanner;
public class createfolder {
    public static void main(String[] args) {
        System.out.println("Enter the path where you want to create the folder");
        Scanner sc=new Scanner(System.in);
        String path=sc.next();//next is fine because default is string in java no need to mention datatype
        System.out.println("Enter the name of the desired Diretory");
        path=path+sc.next();
        File f1=new File(path);
        boolean bool=f1.mkdir();
        if(bool)
        {
            System.out.println("Folder is created Successfully");
        }
        else
        {
            System.out.println("Error Found!");
        }
    }
}
