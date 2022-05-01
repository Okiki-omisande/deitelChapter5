public class Pythagoras {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double Hypo;
        double Side;

        System.out.printf("%5s  %5s  %10s%n", "side1", "side2",   "hypotenuse");

        for(a =1; a <=500; ++a){

            for (b=a; b<=500; ++b){

                for (c = 1; c<=500;++c){

                     Hypo = (int) Math.pow(c,2);
                     Side = (int) (Math.pow(a,2) + Math.pow(b,2));

                    if (Hypo == Side){
                        System.out.printf("%,5d  %,5d  %,10d%n", a, b, c);
                }
            }
        }

        }
    }
}
