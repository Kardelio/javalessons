import java.util.Scanner;

public class lottery {

    public static void main(String[] args)
    {
        int correctA = 12, correctB = 13, correctC = 14, correctD = 15;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 4; i++)
        {
            int lotteryNumber = 0;
            while(lotteryNumber > 99 || lotteryNumber < 1){
                System.out.println("Please enter number betwen 1 and 99!");
                lotteryNumber = sc.nextInt();
            }

            if(lotteryNumber == correctA || lotteryNumber == correctB || lotteryNumber == correctC || lotteryNumber == correctD){
                System.out.println("Yep! That one is a match!");
                counter++;
            } else {
                System.out.println("No match for that number :(");
            }
        }
        System.out.println("You got "+counter+" correct!");
    }
}

/**
 * Talk about Github ...
 */
