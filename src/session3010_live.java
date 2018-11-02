import java.util.Scanner;

public class session3010_live {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers...");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("| number 1 |" + "| number 2 |" + "| add      |" + "| subtract |" + "| times    |" + "| divide   |");

        System.out.print(columnResize(number1 + ""));
        System.out.print(columnResize(number2 + ""));
        System.out.print(columnResize((number1 + number2) + ""));
        System.out.print(columnResize((number1 - number2) + ""));
        System.out.print(columnResize((number1 * number2) + ""));
        System.out.print(columnResize((number1 / number2) + ""));
    }



    public static String columnResize(String input)
    {
       String out = "| " + input;
        int amountToAdd = 8 - input.length();
        for (int i = 0; i < amountToAdd; i++) {
            out += " ";
        }
        out += " |";

        return out;
    }
}