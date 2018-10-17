import java.util.Scanner;

public class session23102018 {



    public static void main(String[] args)
    {

        boolean varFalse = false;
        boolean varTrue = true;

        //Pair 1---------------------------------------------

        if(varTrue == true)
        {
            System.out.println("Yes this code will run");
        }

        if(varFalse == true)
        {
            System.out.println("No this will never run");
        }

        //Pair 2---------------------------------------------

        if(varTrue)
        {
            System.out.println("YEP! This is the same as writing varT == true");
        }

        if(varFalse)
        {
            System.out.println("Nope! This is the same as writing varF == true");
        }

        //Pair 3---------------------------------------------

        if(varTrue == false)
        {
            System.out.println("No this will never run");
        }

        if(varFalse == false)
        {
            System.out.println("Yes this code will run");
        }

        //Pair 4---------------------------------------------

        if(varTrue != false)
        {
            System.out.println("Yes this code will run");
        }

        if(varFalse != false)
        {
            System.out.println("No this will never run");
        }

        //Pair 5---------------------------------------------

        if(3 < 5) //True
        {
            System.out.println("Yes this code will run");
        }

        if(3 > 5) //False
        {
            System.out.println("No this will never run");
        }

        //Pair 6---------------------------------------------

        int myNumber = 10;

        if(myNumber > 5) //True
        {
            System.out.println("Yes this code will run");
        }

        if(myNumber > 20) //False
        {
            System.out.println("No this will never run");
        }

        //Pair 6---------------------------------------------

        String userPassword = "mittensTheKittens";

        if(userPassword == "mittensTheKittens") //True
        {
            System.out.println("Yes this code will run");
        }

        if(userPassword == "superSecretPassword") //False
        {
            System.out.println("No this will never run");
        }

        //Pair 7---------------------------------------------

        int yearOfBirth = 1991;

        if(yearOfBirth > 1980 && yearOfBirth < 2000)
        {
            System.out.println("Yes this code will run");
        }

        if(yearOfBirth < 1980 && yearOfBirth < 1900 && yearOfBirth > 2020 && yearOfBirth < 1000)
        {
            System.out.println("No this will never run");
        }

        //Pair 8---------------------------------------------

        int userAge = 18;
        boolean userGivenPermission = true;

        if(userAge > 17 && userGivenPermission == true)
        {
            System.out.println("Yes this code will run");
        }

        if(userAge > 17 && userGivenPermission == false)
        {
            System.out.println("No this will never run");
        }

        //Pair 9---------------------------------------------

        int sales = 100;
        int costs = 20;

        if(sales - costs > 80)
        {
            System.out.println("Yay we made a GOOD profit");
        }
        else if((sales - costs) > 60)
        {
            System.out.println("Alright we made a OK profit");
        }
        else if((((((((sales - costs))))))) > 60)  //Brackets just to show you CAN if you want lol
        {
            System.out.println("Alright we made a OK profit");
        }

        //Pair 10--------------------------------------------

        String correctUserName = "Steve";
        String correctPassword = "abcde";

        //TODO PRETEND I USED A SCANNER TO GET THIS BELOW ...
        String userEnterName = "";
        String userEnterPassword = "";

        if(userEnterName == correctUserName && userEnterPassword == correctPassword)
        {
            System.out.println("SUCCESSFUL LOGIN!");
        }
        else {
            System.out.println("ACCESS DENIED!");
        }

        /**
         * Ok so with that infomation lets look back at while loops...
         */

        /*
            ___       _______ ___________          ______
            __ |     / /__  /____(_)__  /____      ___  / ____________________________
            __ | /| / /__  __ \_  /__  /_  _ \     __  /  _  __ \  __ \__  __ \_  ___/
            __ |/ |/ / _  / / /  / _  / /  __/     _  /___/ /_/ / /_/ /_  /_/ /(__  )
            ____/|__/  /_/ /_//_/  /_/  \___/      /_____/\____/\____/_  .___//____/
                                                                      /_/
        */

        //Task 1--------------------------------------------

        int i = 0;
        while (i < 5)
        {
            System.out.println(i);
            i++;
        }

        //Task 2--------------------------------------------

        int j = 0;
        while (j < 10)
        {
            System.out.println(j);
            j++;
        }

        //Task 3--------------------------------------------

        boolean mybool = true;
        while (mybool == true)    //can also write while(mybool)
        {
            System.out.println("Mybool is true so far!");
            mybool = false;
        }

        //Task 4--------------------------------------------
        Scanner sc = new Scanner(System.in);
        String name = "";

        while (!name.equals("ben"))
        {
            System.out.println("Name is not ben so its ok!");
            System.out.println("Please enter a name: ... ");
            name = sc.next();
        }
        System.out.println("EXITED WHILE LOOP! - Name Must be ben! OMG!");

    }

}
