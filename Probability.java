public class Probability {
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }
    public static int combinations(int n, int r)
    {
        int formula1 = factorial(n) / (factorial(r) * factorial(n-r));
        int forumla2 = factorial(n) / formula1;
        return forumla2;
    }
    public static void main(String[] args) {
        System.out.println(combinations(7, 4));

    }


}
