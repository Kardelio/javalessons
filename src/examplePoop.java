import week11.StringArrayUtils;

public class examplePoop {


    public static void main(String[] args)
    {

        String [] input = {"abc"};
        int expectedOutput = 3;
        int actualOutput = StringArrayUtils.getTotalLength(input); boolean testSuccess = actualOutput               == expectedOutput; if(testSuccess)
        {
            System.out.println("Test 1 Success");
        }
        else {
            System.out.println("Test 1 Failed"); System.out.println("Expected output was: "
                    + expectedOutput); System.out.println("Actual output was: " + actualOutput);
        }


        String [] input2 = {"helloworld"};
        int expectedOutput2 = 10;
        int actualOutput2 = StringArrayUtils.getTotalLength(input); boolean testSuccess2 = actualOutput               == expectedOutput; if(testSuccess)
    {
        System.out.println("Test 1 Success");
    }
    else {
        System.out.println("Test 1 Failed"); System.out.println("Expected output was: "
                + expectedOutput); System.out.println("Actual output was: " + actualOutput);
    }

        String [] input3 = {"kjf","afssabfiasfn"};
        int expectedOutput3 = 0;
        int actualOutput3 = StringArrayUtils.getTotalLength(input);
        boolean testSuccess3 = actualOutput               == expectedOutput; if(testSuccess)
    {
        System.out.println("Test 1 Success");
    }
    else {
        System.out.println("Test 1 Failed"); System.out.println("Expected output was: "
                + expectedOutput); System.out.println("Actual output was: " + actualOutput);
    }



        String [] inputgetmax1 = {"kajsfnakjf","afssabfiasfn"};
        int expectedOutput3 = 20;
        int actualOutput3 = StringArrayUtils.getMaxLength(input);
        boolean testSuccess3 = actualOutput               == expectedOutput; if(testSuccess)
    {
        System.out.println("Test 1 Success");
    }
    else {
        System.out.println("Test 1 Failed"); System.out.println("Expected output was: "
                + expectedOutput); System.out.println("Actual output was: " + actualOutput);
    }


        /**
         *     col1      col2     col3
         */



//        testTotalLength(new String[]{"abc"},3);
//        testTotalLength(new String[]{"helloworld"},10);
//        testTotalLength(new String[]{"onse","two"},7);
//        testTotalLength(new String[]{"a","b","c"},3);
//        testTotalLength(new String[]{},0);
        //TODO
    }

    public static void testTotalLength(String[] input, int expectedOutput){
        int actualOutput = StringArrayUtils.getTotalLength(input);
        boolean testSuccess = actualOutput == expectedOutput; if(testSuccess)
        {
            System.out.println("Test total Length Success");
        }
        else {
            System.out.println("Test total Length Failed"); System.out.println("Expected output was: "
                    + expectedOutput); System.out.println("Actual output was: " + actualOutput);
        }
    }

    public static void testMaxLength(String[] input, int expectedOutput){
        int actualOutput = StringArrayUtils.getMaxLength(input);
        boolean testSuccess = actualOutput == expectedOutput; if(testSuccess)
        {
            System.out.println("Test Success");
        }
        else {
            System.out.println("Test Failed"); System.out.println("Expected output was: "
                    + expectedOutput); System.out.println("Actual output was: " + actualOutput);
        }
    }

    public static void testMinLenght(String[] input, int expectedOutput){
        int actualOutput = StringArrayUtils.getMinLength(input);
        boolean testSuccess = actualOutput == expectedOutput; if(testSuccess)
        {
            System.out.println("Test 1 Success");
        }
        else {
            System.out.println("Test 1 Failed"); System.out.println("Expected output was: "
                    + expectedOutput); System.out.println("Actual output was: " + actualOutput);
        }
    }


}
