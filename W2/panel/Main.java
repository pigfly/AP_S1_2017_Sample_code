package au.com.microsoft.panel;

import java.util.Scanner;

/**
 * Created by alexj on 9/3/17.
 */
public class Main {
    public static void main(String args[]) {
        Panel p[] = new Panel[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of panel (RP/TP) in line 1 and parameters in line 2");
        System.out.println("Enter empty string to terminate");

        while (true) {
            String className = sc.nextLine();

            if (className.compareTo("RP") == 0) {
                System.out.println("Enter width");
                double width = sc.nextDouble();
                System.out.println("Enter height");
                double height = sc.nextDouble();
                p[count] = new RectanglePanel(width, height);
                count++;
            } else if (className.compareTo("TP") == 0) {
                double s1 = sc.nextDouble();
                double s2 = sc.nextDouble();
                double s3 = sc.nextDouble();
                p[count] = new TrianglePanel(s1, s2, s3);
                count++;
            } else {
                break;
            }
            sc.nextLine();
        }

        double totoalCost = 0.0;

        for (int i = 0; i < count; i++) {
            totoalCost += p[i].getCost();
        }

        System.out.println("Total cost for " + count + " valid panels is " + totoalCost);
    }
}
