public class trycatch {

    /**
     * CHECKED EXCEPTIONS ---
     * File reading
     * Json parsing
     * SQLExceptoon
     */


    public static void main(String[] args)
    {
        other();
    }

    public static void other(){

        try{
            // ... Some Code
            System.out.println("Here it goes");
            checkIsLessThan5(7);
            System.out.println("Still here!");
            System.out.println("Still here1!");
            System.out.println("Still here2!");
            System.out.println("Still here3!");
        } catch(Exception e){
            // ... If anything goes wrong
            System.out.println("OH No something went wrong!");
        } finally {
            // ... Always
            System.out.println("This always happens at the end!");
        }

        /*
        Here it goes
        OH No something went wrong!
        This always happens at the end!
         */
    }



    private static String checkIsLessThan5(int a) throws Exception{
        if(a > 5){
            throw new Exception("Its more than 5!");
        } else {
            return "All Good";
        }
    }

}
