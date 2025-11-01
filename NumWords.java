
public class NumWords {

    public static void main(String args[]) {
        int sum = Integer.parseInt(args[0]);
        int all = sum;
        int ones = all % 10;
        all = all / 10;
        int tens = all % 10;
        all = all / 10;
        int hundred = all;
        System.out.println(hundred + " hundreds, " + tens + " tens, "
                + ones + " ones.");

    }
}
