

public class Ascend {

    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int a = (int) (Math.random() * ((lim + 1) - 0) + 0);
        int b = (int) (Math.random() * ((lim + 1) - 0) + 0);
        int c = (int) (Math.random() * ((lim + 1) - 0) + 0);
        int minFirst = Math.min(a, b);
        int minLast = Math.min(minFirst, c);
        int maxFirst = Math.max(a, b);
        int maxLast = Math.max(maxFirst, c);
        int middle = Math.min(Math.max(a, b), c);
        System.out.println(a + " " + b + " " + c);
        System.out.println(minLast + " " + middle + " " + maxLast);
    }
}
