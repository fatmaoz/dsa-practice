package how_many_flips;

public class HowManyFlips {

    public static void main(String[] args) {

        System.out.println(minFlips("01011"));

    }


    public static int minFlips(String target) {
        int flips = 0;
        char currentState = '0';

        for (int i = 0; i < target.length(); i++) {
            char targetDigit = target.charAt(i);


            if (targetDigit != currentState) {
                flips++;
                currentState = targetDigit;
            }
        }

        return flips;
    }
}
