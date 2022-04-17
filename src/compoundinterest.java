
public class compoundinterest {
    public compoundinterest() {
    }

    public static void main(String[] args) {
        double p = 1000.0D;
        System.out.printf("%s  %26s%n", "Year", "deposit amount at year end");

        for(double r = 0.05D; r <= 0.1D; r += 0.01D) {
            for(int y = 1; y <= 10; ++y) {
                double a = p * Math.pow(1.0D + r,y);
                if (y == 1) {
                    System.out.printf("when r is %.2f", r);
                    System.out.println();
                }

                System.out.printf("%4d%,28.2f%n", y, a);
                System.out.println();
            }
        }

    }
}
