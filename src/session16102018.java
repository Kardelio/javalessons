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
    }


}
