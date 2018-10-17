public class session16102018 {

    //region helpers
    private static void prnt(String str){
        System.out.println(str);
    }

    private static void startOfSection(int num){
        prnt("");
        prnt("=================== Section "+num+" ==================");
        prnt("");
    }

    private static void endOfSection(){
        prnt("");
        prnt("================================================");
        prnt("");
    }
    //endregion

    public static void main(String[] args)
    {
        /**
         * If Then Else session
         */

        // =================================
        // =================================
        // =================================

        startOfSection(0);
        /**
         * Section 0 ......................
         */

        int myNum = 1;

        if(myNum == 1)
        {
            prnt("Yes it does equal 1");
        }

        /**
         * END Section 0 ......................
         */
        endOfSection();

        startOfSection(1);
        /**
         * Section 1 ......................
         */

            int myOtherNum = 0;

            if(myOtherNum == 1)
            {
                prnt("Yes it does equal 1");
            }
            else
            {
                prnt("No it does not equal 1!");
            }

        /**
         * END Section 1 ......................
         */
        endOfSection();

        // =================================
        // =================================
        // =================================

        startOfSection(2);
        /**
         * Section 2 ......................
         */

        String name = "Ben";

        if(name == "Bob")
        {
            prnt("The name mathes Bob");
        }
        else if(name == "Steve")
        {
            prnt("The name mathes Steve");
        }
        else
        {
            prnt("The name doesnt match anything!");
        }

        /**
         * END Section 2 ......................
         */
        endOfSection();

        // =================================
        // =================================
        // =================================

        startOfSection(3);
        /**
         * Section 3 ......................
         */

        boolean myVar = true;

        if(myVar)
        {
            System.out.println("This will always happen!");
        }

        myVar = false;

        if(myVar)
        {
            System.out.println("This will NEVER happen!");
        }

        if(myVar == false)   //Can also be written as !myVar
        {
            System.out.println("BUT THIS ONE will always happen aswell!");
        }

        //inside the if brackets there is a statement, if that statement is true
        //then the thing happens
        //if it is not then it does not

        /**
         * SHOW INFINATE LOOP EXAMPLE
         */

        /**
         * Difference between = and ==
         */

        /**
         * END Section 3 ......................
         */
        endOfSection();

        // =================================
        // =================================
        // =================================

        startOfSection(4);
        /**
         * Section 4 ......................
         */

        if(1 > 0 && 2 < 3)
        {
            System.out.println("1 > 0 && 2 < 3   this is true");
        }

        int sillyInt = 14;

        if(false && sillyInt / 2 == 27)
        {
            System.out.println("The number is probably 54?!");
        }
        else if(true)
        {
            System.out.println("Looks like 16 to me");
        }
        else
        {
            System.out.println("No idea whats going on!");
        }

        String label = "Ben";

        if(label == "Steve" || label == "Ben")
        {

        }




        /**
         * END Section 4 ......................
         */
        endOfSection();

    }


}
