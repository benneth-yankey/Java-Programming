import java.util.Scanner;

public class ExerciseFive {
    private static final int MAX_VALUE = 12;

    public static void main(String[] args) {
        System.out.print("Enter a number to get its multiplication table: ");
        try (Scanner sc = new Scanner(System.in);) {
            generateMultiplicationTable(sc.nextInt());
        } catch (Exception e) {
            throw new IllegalArgumentException("You didn't enter a valid integer");
        }
    }

    private static void generateMultiplicationTable(int num) {
        for (int i = 1; i < (MAX_VALUE + 1); i++) {
            System.out.printf("%d * %d = %d%n", num, i, (num * i));
        }
    }
}
