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
        StringBuilder out = new StringBuilder();

        try {
            FileInputStream fin =  new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fin);
            BufferedReader bf = new BufferedReader(isr);
            String line = "";
            while ((line = bf.readLine()) != null) {
                out.append(line);
                out.append("\n");
            }
        } catch(Exception e){
            out = new StringBuilder("ERROR"+e.getMessage());
        }

        return out.toString();
    }

}
