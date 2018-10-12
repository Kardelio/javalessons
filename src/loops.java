public class loops {

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
         * LOOPS
         *
         * For
         * While
         */


        startOfSection(1);
        /**
         * Section 1 ......................
         */

        /**
         *    int i = 0;    - Before the looping
         *    i < 10;       - Check after every loop
         *    i++           - thing to do after every loop
         *
         *    int i = 0;    - Gives us a counter that starts at 0 called i
         *    i < 10;       - Checks if i is still less than 10 every loop, if it is then it does then next bit....
         *                      OTHERWISE it ends the loop
         *    i++           - this simply means increase i by 1 (so i = i + 1)
         */

        System.out.println("Before Loop");
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);
        }
        System.out.println("After Loop");


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

        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
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

        for (int i = 0; i < 20; i+=2)
        {
            System.out.println(i);
        }

        /**
         * END Section 3 ......................
         */
        endOfSection();

    }

}
