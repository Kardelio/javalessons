public class arrays {

    public static void main(String[] args)
    {
        System.out.println("Here is some Array stuff!");

        /**
         * Number 1
         */

        int[] arrayOfNumbers = new int[3];

        arrayOfNumbers[0] = 23;
        arrayOfNumbers[1] = 445;
        arrayOfNumbers[2] = -235;

        System.out.println(arrayOfNumbers[2]);
        System.out.println(arrayOfNumbers[1]);

        /**
         * Number 2
         */

        int[] otherArrayOfNumbers = {4,665,34567,-23,25};

        System.out.println(otherArrayOfNumbers[0]);
        System.out.println(otherArrayOfNumbers[2]);
        System.out.println(otherArrayOfNumbers[4]);

        /**
         * Number 3
         */
        
        String[] arrayOfStrings = {"yes","no","maybe"};

        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i]);
        }

        /**
         * Number 4
         */
        
        int[] brandNewArrayOfChars = new int[5];
        
        brandNewArrayOfChars[2] = 300;

        for (int i = 0; i < brandNewArrayOfChars.length; i++) {
            System.out.println(brandNewArrayOfChars[i]);
        }
        //Default value is 0
    }

}
