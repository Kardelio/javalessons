public class codingPuzzleStand {

    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args)
    {
        String chunk = "desuco";

        String answer = "";
        answer += solvePart1(chunk);
        answer = solvePart2() + " " + answer;

        System.out.println(answer);
    }

    static String solvePart1(String str){
        String out = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            out = out + str.charAt(i);
        }
        return "f"+out;
    }

    static String solvePart2(){
        String out = "";
        out += alphabet[2];
        out += alphabet[20];
        out += alphabet[18];
        out += alphabet[19];
        out += alphabet[14];
        out += alphabet[12];
        out += alphabet[4];
        out += alphabet[17];
        return out;
    }
}
