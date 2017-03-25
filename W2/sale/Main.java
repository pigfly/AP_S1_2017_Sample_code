package au.com.microsoft.sale;

public class Main {

    public static void main(String[] args) {
        Sale s[] = new Sale[4];
        s[0] = new NegotiatedSale("34 Kew crt",340000,0.05);
        s[1] = new AuctionSale("5 Bet crt",560000, 565000, 0.10);
        s[2] = new AuctionSale("12 Ron dr",240000, 290000, 0.15);
        s[3] = new NegotiatedSale("2 John st",420000,0.03);

        for (Sale sale : s) {
            double charge = sale.computeCharge();
            System.out.format("The charge for %s is %.1f \n", sale.getClass(), charge);
        }
    }
}
