import java.util.Scanner;
import java.io.File;

public class FilesLabsNew {
    
    public static void main(String[] args)
    {
        System.out.println("Files New!");
        /**
         * Lab : read in the file add all the numbers together divide by how many
         * numbers are there... Average
         */
        int amountOfNumbers = 0;
        double sumOfTheNumbers = 0;
        try{
            Scanner reader = new Scanner(new File("simpleFile.txt"));
            while (reader.hasNext()){
                double number = reader.nextDouble();
                System.out.println(number); // 3.3.
                amountOfNumbers++;
                sumOfTheNumbers+=number;
            }
        }catch (Exception e){

        }
        System.out.println("Average: " + (sumOfTheNumbers/amountOfNumbers));


    }
}
