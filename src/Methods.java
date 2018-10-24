public class Methods {

    //TODO Scope, Return Types and Arguements

    public static void main(String[] args)
    {
        getName();
        addFtoWord("ocused");
        divideBy100(30);
        add10ToNumber(10);
        add2NumbersTogether(10,3);
        printStringNTimes(10,"Print me 10 times");
    }

    public static String getName(){
        return "Ben";
    }

    public static String addFtoWord(String word){
        return "F" + word;
    }

    public static double divideBy100(int number){
        return number / 100;
    }

    public static int add10ToNumber(int number){
        int answer = number + 10;
        return answer;
    }

    public static void add2NumbersTogether(int numberA, int numberB){
        int answer = numberA + numberB;
    }

    public static void printStringNTimes(int number, String str){
        for (int i = 0; i < number ; i++) {
            System.out.println(str);
        }
    }

    /**
     * Imagine an accounting application that constantly deducts VAT and other bits
     * always does this
     * number - 17.5
     *
     * What happens if VAT changes?
     */
}
