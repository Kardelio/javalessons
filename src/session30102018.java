public class session30102018 {

    /**
     * Explaining Methods/functions/procedures....
     *
     * A chunk of code that can be reused as many times as necessary. That usually does one key thing...
     * E.g. Adding 10 onto a number and printing the new number...
     * E.g. Removing all the vowels from a String and returning it...
     * E.g. Looping through a list of people and finding the one with the correct ID and returning it...
     *
     * Methods have a signature they follow a certain pattern!
     *
     * ACCESS_MOD_AND_STATICS   RETURN_TYPE   NAME   (ARGUEMENTS - 0 or more...)
     *
     * e.g. public static void simple()
     * OR
     * e.g. private int getNumber()
     * OR
     * e.g. public String getFirstName(String fullname)
     *
     * All are signatures, all define Methods and functions that the program can call upon to do some action
     *
     */

    public static void main(String[] args)
    {
        // ----------------------------------------
        // OBJECTIVE: TO PRINT HELLO WORLD 5 TIMES!
        // ----------------------------------------


        //SOLUTION 1 ------------------------------

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        //SOLUTION 2 ------------------------------

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Hello World");
        }

        //SOLUTION 3 ------------------------------

        for (int i = 0; i < 5 ; i++) {
            printHelloWorld();
        }

        //SOLUTION 4 ------------------------------

        printHelloWorldNTimes(5);

        //SOLUTION 5 ------------------------------

        printStringNTimes(5,"Hello World");


        // ----------------------------------------
        // WHICH IS BEST???
        // ----------------------------------------

        // ----------------------------------------
        // NOW - What if I said print Goodbye
        // 5 times?????
        // ----------------------------------------

        // ----------------------------------------
        // NOW - What if I said print Goodbye
        // 50 times?????
        // ----------------------------------------
    }

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

    public static void printHelloWorldNTimes(int number){
        for (int i = 0; i < number ; i++) {
            System.out.println("Hello World");
        }
    }

    public static void printStringNTimes(int number, String str){
        for (int i = 0; i < number ; i++) {
            System.out.println(str);
        }
    }


}
