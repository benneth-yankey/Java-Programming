import java.util.Random;

class Ex_2 {
    private static final int MAX_RANGE = 100;
    public static void main(String[] args) {
        printEvenAndOdd(MAX_RANGE);
    }

    private static void printEvenAndOdd(int max) {
        for (int i = 0; i < max; i++) {
            // generate random integer with upper bound of MAX_RANGE
            int num = new Random().nextInt(max);
            if (isEven(num)) {
                System.out.printf("%d -> even%n", num);
            } else {
                System.out.printf("%d -> odd%n", num);
            }
        }
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    } 
}
