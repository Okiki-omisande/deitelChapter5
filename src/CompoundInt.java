public class CompoundInt {
    public static void main(String[] args) {
        int p = 1000 * 100;
        double r = 0.05;
        double q = 1 + r;
        System.out.printf("%4s   %26s%n", "Year", "Deposit amount at year end");

        for (int y = 1; y <=10; ++y){
            double a = p * Math.pow(q,y);

            int dollar = (int) a / 100;
            int cent = (int) a % 100;

            System.out.printf("%4d %25d.%d%n",y,dollar,cent);
        }
    }
}
