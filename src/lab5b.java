import java.util.Scanner;

public class lab5b {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Baby Boomer?");
        System.out.println("Please enter your year of birth...");
        int yearOfBirth = s.nextInt();
        System.out.println("You said you were born in: "+yearOfBirth);

        //Between these years... 1945 & 1964
        if(yearOfBirth < 1964 && yearOfBirth > 1945)
        {
            System.out.println(ANSI_RED + "Oh No... You are a Baby Boomer... Dang" + ANSI_RESET);
        } else {
            System.out.println("You are not a Baby Boomer... Yay!");
        }
    }
}
