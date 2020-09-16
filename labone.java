public class labone {
    public static boolean isPrime(int n) {
        //a method to check to see if a number is prime or not.
        if (n<=1) {
            return false;
        }
        for (int i =2; i<n; i++){
            if (n%i==0) {
                return false;
            }

        }
        return true;
    }
}


