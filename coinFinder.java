public class coinFinder {
    public static void find (int n) {
        // input a number of cents (int n) and get the coin makeup of the value printed.
        if (n<=0) {
            System.out.println("Values below 0 cannot be made up in coins.");
            return;
        }
        int quarter, penny, nickel, dime, quart, pen, nick, dimecount;
        quarter = 25; penny = 1; nickel = 5; dime = 10;
        quart = 0; pen = 0; nick = 0; dimecount = 0;
        while (quarter <= n){
            n = n-quarter;
            quart++;
        }
        while (dime <= n) {
            n = n-dime;
            dimecount++;
        }
        while (nickel <= n) {
            n = n-nickel;
            nick++;
        }
        while (penny <= n) {
            n = n-penny;
            pen++;
        }
        System.out.println("Answer: " + quart + " quarters, " + dimecount + " dimes, " + nick + " nickels, and " + pen + " pennys.");
    }

    public static void main(String[] args) {
        find(157);

    }
}
