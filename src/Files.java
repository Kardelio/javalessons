import java.io.*;

public class Files {


    public static void main(String[] args)
    {
        System.out.println("The file program...");
        System.out.println("");
        String fileContents = readFileToStringArray("simpleFile.txt");
        System.out.println(fileContents);
    }


    private static String readFileToStringArray(String file){
        String fileOutput = "";

        try {
            FileInputStream fin = new FileInputStream(______);
            InputStreamReader isr = new InputStreamReader(fin);
            BufferedReader bf = new BufferedReader(isr);
            String line = "";
            while ((line = bf.readLine()) != null) {
                fileOutput += line;
                fileOutput += "\n";
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }




        try {

        } catch(Exception e){
//            out = new StringBuilder("ERROR"+e.getMessage());
        }

        return fileOutput;
    }

}
