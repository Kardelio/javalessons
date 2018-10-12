import java.util.Scanner;

public class lab5bPart2{

    public static void main(String[] args)
    {
        boolean divisible = false;

        System.out.println("Please enter the first number");
        Scanner s = new Scanner(System.in);
        float firstNum = s.nextFloat();

        System.out.println("Please enter the second number");
        float secondNum = s.nextFloat();

        System.out.println("You entered "+firstNum+ " and "+secondNum);
        System.out.println("So "+firstNum+"/"+secondNum+" = ");

        float answer = firstNum / secondNum;
        System.out.println("--- "+answer);

        System.out.println("It has the remainer of: ");
        float remainer = firstNum % secondNum;
        System.out.println("--- "+remainer);

        if(remainer == 0){
            divisible = true;
        }
        System.out.println("DIVISIBLE: ===> "+divisible);
    }
}
