
public class Bill3 {

    public static void main(String[] args) {
        // To get you started, here is the first line in the program:
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int value = Integer.parseInt(args[3]);
        double divide = ((double) value) / 3;
        divide = Math.ceil(divide);
        System.out.println("Dear " + name3 + "," + name2
                + ", and " + name1 + ": pay " + divide + " in shekels each.");
    }
}
