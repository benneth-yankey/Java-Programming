import java.util.Random;

class ExerciseTwo {
    private static final int MAX_RANGE = 100;

    public static void main(String[] args) {
        printEvenAnddOddForRandomInt(MAX_RANGE);
    }

    private static void printEvenAnddOddForRandomInt(int max) {
        for (int i = 0; i < max; i++) {
            int val = new Random().nextInt(max);
            System.out.println("===================");
            if (isEven(val)) {
                System.out.printf("%d\teven%n", val);
            } else {
                System.out.printf("%d\todd%n", val);
            }
            printCategorizedNamesForRandomInt(val);
        }
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static void printCategorizedNamesForRandomInt(int num) {
        if (isBetween1and14(num)) {
            System.out.println("1-14\tcold");
        } else if (isBetween15and24(num)) {
            System.out.println("15-24\tcool");
        } else if (isBetween25and40(num)) {
            System.out.println("25-40\twarm");
        } else if (isBetween41and60(num)) {
            System.out.println("41-60\thot");
        } else if (isBetween61and80(num)) {
            System.out.println("61-80\tvery hot");
        } else if (isBetween81and90(num)) {
            System.out.println("81-90\textremely hot");
        } else if (isEqualTo100(num)) {
            System.out.println("100\tboiling");
        } else {
            System.out.println("0\tfrozen");
        }
    }

    private static boolean isBetween1and14(int num) {
        return num >= 1 && num <= 15;
    }

    private static boolean isBetween15and24(int num) {
        return num >= 15 && num <= 24;
    }

    private static boolean isBetween25and40(int num) {
        return num >= 25 && num <= 40;
    }

    private static boolean isBetween41and60(int num) {
        return num >= 41 && num <= 60;

    }

    private static boolean isBetween61and80(int num) {
        return num >= 61 && num <= 80;

    }

    private static boolean isBetween81and90(int num) {
        return num >= 81 && num <= 90;
    }

    private static boolean isEqualTo100(int num) {
        return num == 100;
    }
}
