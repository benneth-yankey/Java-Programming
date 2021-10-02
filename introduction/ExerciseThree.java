import java.util.Random;

public class ExerciseThree {
    private static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        printGeneratedIntegersInWords(MAX_VALUE);
    }

    private static void printGeneratedIntegersInWords(int max) {
        for (int i = 0; i < MAX_VALUE; i++) {
            int num = new Random().nextInt(MAX_VALUE);
            String res = switch (num) {
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "zero";
            };
            System.out.printf("%d\t%s%n", num, res);
        }
    }
}
