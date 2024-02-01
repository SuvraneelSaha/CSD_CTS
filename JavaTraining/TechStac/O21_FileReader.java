import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileDemo
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("log.txt");
        
        Scanner inFile = new Scanner(fr);
        
        while(inFile.hasNext())
        {
            String line = inFile.nextLine();
            
            System.out.println(line);
            
        }
        
        inFile.close();
    }
}