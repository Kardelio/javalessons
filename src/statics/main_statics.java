package statics;

public class main_statics {
    
    public static void main(String[] args)
    {
        System.out.println("--------- Statics lesson ---------");

        OtherClass.doSomethingStatic(200);
        int number = OtherClass.giveMeTheNumber50();

        OtherClass oc = new OtherClass();
        oc.doSomethingNotStatic();
        oc.doSomethingNotStatic();
        oc.giveMeTheNum20();

        OtherClass.playerScore += 1000;
        /**
         * Utility
         * ------
         *
         * TextAa.frequencyOfLetter('a',"sdfjbkdjsnf");
         *
         *
         *
         * TextAnalysi a = new Textasdas();
         * a.frwquasfasf
         *
         * TextAnalysis.java
         *
         * public static int frequencyOfLetter(char theLetter, String wordIn){
         *  kdfngsfdngoagoisdoigds
         *  reutnr 10;
         * }
         */




    }
}
