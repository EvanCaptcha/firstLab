public class fractions {
    public static void findClosest (double num1, double num2){
        // input a fraction (numerator = num1, denominator = num2) and the closest fractions (with denominators from 1-100) will be found.
        double closestBottom = 0;
        double closestTop = 1;
        double startFrac = num1/num2;
        String lowest = "";
        String highest = "";
        for (double x = 1; x<100; x++){
            for (double y = 1;  y/x  <= closestTop; y++) {
                double frac = y/x;
                if (frac < startFrac) {
                    if (frac>closestBottom){
                        closestBottom = frac;
                        highest = y + "/" + x;
                    }
                }
                if (frac > startFrac) {
                    if (frac<closestTop) {
                        closestTop = frac;
                        lowest = y + "/" + x;
                    }
                }
            }

        }
        System.out.println("Smallest frac = " + highest + " and biggest frac = " + lowest );
        System.out.println(startFrac);
    }

    public static void main(String[] args) {
        findClosest(17, 76);

    }
}
