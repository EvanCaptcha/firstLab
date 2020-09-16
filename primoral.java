public class primoral {
    public static int Primoral(int n) {
        if (n<=1){
            return -1;
        }
        if (n>11) {
            return -1;
        }
        int array[] = new int [10];
        int base = 1;
        int x = 1;
        while (x <= n) {
            if (labone.isPrime(x)){
                x++;
                if (x == 7) {
                    System.out.print(x + " = ");

                }
                else {
                    System.out.print(x + " * ");

                }
                base = base * x;
            }

        }
        System.out.println();
        return base;

    }

    public static void main(String[] args) {
        System.out.println(Primoral(4));
    }
}
