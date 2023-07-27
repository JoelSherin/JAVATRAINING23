import java.util.Scanner;
import java.io.File;
public class deletefolder {
    public static void main(String[] args) {
        String path;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter directory for deleting");
        path=sc.nextLine();
        sc.close();
        File file=new File(path);
        try{
            deletedirectory(file);
            file.delete();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void deletedirectory(File file)
    {
        for(File subFile:file.listFiles()){
            if(subFile.isDirectory()){
                deletedirectory(subFile);
            }
            subFile.delete();
        }
    }
}
