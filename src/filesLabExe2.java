import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class filesLabExe2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the file you wish to read?");
        String fileToRead = sc.next(); //linesOfText.txt
        System.out.println("Please enter the file you wish to write to?");
        String fileToWriteTo = sc.next();

        try{
            Scanner scanner = new Scanner(new FileInputStream(fileToRead));
            PrintWriter writer = new PrintWriter(fileToWriteTo);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                writer.println(line.toUpperCase());
            }
            writer.close();
        } catch (Exception e){
            System.out.println("PROBLEM THE FILE READER HAS A PROBLEM: " + e.getMessage());
        }
    }
}
