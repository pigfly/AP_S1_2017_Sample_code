import java.util.Scanner;
public class test {
    public static void main(String[] args) {

        int counter = 1;
        int number;
        int largest = 0; // Integer.MIN_VALUE;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        while(counter < 4)
        {
            System.out.println("Enter the number: ");
            number = input.nextInt();

            if(largest < number) {
                largest = number;
            }

            counter++;

        }

        System.out.println("the largest number is " + largest);
    }
}
