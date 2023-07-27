import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_file {
    public static void main(String[] args) {
        try
        {
            File myObj = new File("/Users/joelsherin/Desktop/filename.rtd");
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine())   //moving cursor to the next line
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
