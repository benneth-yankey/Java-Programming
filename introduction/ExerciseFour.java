import java.util.Random;

public class ExerciseFour {
    private static final int MAX_VALUE = 3;
    private static final int MIN_VALUE = -3;
    private static final String DASHES = "==============";

    public static void main(String[] args) {
        System.out.println(DASHES);
        System.out.println(" do/while loop");
        System.out.println(DASHES);

        generateIntegerUsingDoWhile();

        System.out.println(DASHES);
        System.out.println(" while loop");
        System.out.println(DASHES);

        generateIntegerUsingWhile();
    }

    private static void generateIntegerUsingDoWhile() {
        int num;
        do {
            num = new Random().nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
            System.out.println(num);
        } while (num != 0);
    }

    private static void generateIntegerUsingWhile() {
        int num = -1; 
        while(num != 0) {
            System.out.println(num);
            num = new Random().nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        }
    }
}
