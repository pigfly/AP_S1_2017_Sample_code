import java.util.Scanner;

public class TempConverter {
    private static float f = 0, c = 0;
    private static final Scanner scan = new Scanner (System.in);
    private static int converChoice = 1;

    public static void main(String [] args) {
        System.out.println("Press 1 for C->F or 2 for F->C");
        converChoice = scan.nextInt();

        if (converChoice == 1)
            convertCtoFAndPrint();
        else
            convertFtoCAndPrint();
    }

    public static void convertFtoCAndPrint() {
        System.out.println("Please enter degrees F");
        f = scan.nextFloat();

        c = (5* (f - 32)) / 9f;

        System.out.println(f + " degrees F is " + c + " degrees C.");
    }

    public static void convertCtoFAndPrint() {
        System.out.println("Please enter degrees C");
        c = scan.nextFloat();

        f = (9 * c + 160) / 5f;

        System.out.println(c + " degrees C is " + f + " degrees F.");
    }
}
