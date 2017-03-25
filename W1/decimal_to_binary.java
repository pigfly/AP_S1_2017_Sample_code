import java.util.Scanner;

public class ConvertDecimal {

    public void convert(int decimal , int base)
    {
        int result = 0;
        int multiplier = 1;

          while(decimal > 0)
            {
              int residue = decimal % base;
              decimal     = decimal / base;
              result      = result + residue * multiplier;
              multiplier  = multiplier * 10;
            }

            System.out.println ("binary....." + result);
    }

    public static void main(String args[])
    {
        // Scanner in = new Scanner(System.in);
        //
        // System.out.println("Enter a positive integer");
        // number = in.nextInt();
        ConvertDecimal conv = new ConvertDecimal();
        conv.convert(128, 2);
    }

}
