public class lab8 {

    public static String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};

    public static void main(String[] args)
    {
        System.out.println("Here we go!");


        /**
         * Task 1:
         */

        for (int i = 0; i < planets.length; i++) {
            System.out.println("Hello " + planets[i]);
        }

        /**
         * Task 2:
         */


        System.out.println(timesCharOccurs("Hello",'e'));
        System.out.println(timesCharOccurs("I Love Programming",'e'));
        System.out.println(timesCharOccurs("I Love Programming",'o'));
        System.out.println(timesCharOccurs("I Love Programming",'m'));

        /**
         * Task 3:
         */

        int[] letterCount = letterFrequencies("programming");
        for (int i = 0; i < letterCount.length; i++) {
            System.out.println(((char)(i + 97)) +":"+letterCount[i]);
        }


    }



    private static int timesCharOccurs(String inStr, char cha){
        int count = 0;
        char[] car = inStr.toCharArray();
        for (int i = 0; i < car.length; i++) {
            if(car[i] == cha){
                count++;
            }
        }

        return count;
    }

    private static int[] letterFrequencies(String str){
        int[] letters = new int[26];
        char[] charArray = str.toLowerCase().toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
            int code = (int) charArray[i];
            int arrayIter = code - 97;
            letters[arrayIter]++;
        }

        return letters;
    }
    
}
