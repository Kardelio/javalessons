import java.util.Scanner;

public class scannerExample {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        System.out.println("A: " + a);

        Scanner r = new Scanner(System.in);
        String b = r.nextLine();

        System.out.println("B: " + b);
    }

    /*
    Try with "Hello World" :

        Hello World
        A: Hello
        Hello World
        B: Hello World
     */

}
