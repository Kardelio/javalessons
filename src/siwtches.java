public class siwtches {

    public static void main(String[] args)
    {
        /**
         * What the heck is point of switch? - like an if but for set ranges/options etc...
         * When to use it? - When your option is in a set range... ish
         * Why to use it? - Performance benefits
         */

        int myNum = 3;

        switch (myNum){
            case 1: {
                System.out.println("Number is 1");
                break;
            }
            case 2: {
                System.out.println("Number is 2");
                break;
            }
            case 3: {
                System.out.println("Number is 3");
                break;
            }
            case 4: {
                System.out.println("Number is 4");
                break;
            }
            default: {
                System.out.println("Number is none of those!!");
                 break;
            }
        }


    }

}
