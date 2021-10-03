import java.util.Random;
import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        generate6RandomIntegersBetween1and49();

        System.out.println("=================");

        System.out.print("Enter an upper bound number to generate an integer between 1 and n: ");
        try (Scanner sc = new Scanner(System.in);) {
        generateRandomInteger1andGivenValue(sc.nextInt());
        } catch (Exception e) {
        throw new IllegalArgumentException("You didn't enter a valid number");
        }
    }

    private static void generate6RandomIntegersBetween1and49() {
        for (int i = 0; i < 6; i++) {
            System.out.println(new Random().nextInt(49) + 1);
        }
    }

    private static void generateRandomInteger1andGivenValue(int max) {
        System.out.println(new Random().nextInt(max + 1) + 1);
    }
}
