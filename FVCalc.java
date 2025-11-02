
public class FVCalc {

    public static void main(String[] args) {
        // Replace this comment with your code
        double currentValue = Double.parseDouble(args[0]); //sum that's invested
        double rate = Double.parseDouble(args[1]); // precent
        int years = Integer.parseInt(args[2]); // how long will the invesment be
        rate = rate / 100;
        double futureValue = currentValue * (Math.pow((1 + rate), 2));
        System.out.println("After " + years + " years, $" + (int)currentValue + " saved at "
                + rate * 100 + "% will yield $" + (int) (futureValue));
    }
}
