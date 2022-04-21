public class FacebookUserBase {
    public static void main(String[] args) {
        double a;
        double gr = 1 + 0.04;
        int p = 1000000000;


        for (int month = 1; month > 0; ++month) {
            a = p * Math.pow(gr, month);

            if (a >= 1500000000) {
                System.out.printf("it will take %d months for facebook to have %f users%n", month, a);
            }
            if (a >= 2000000000) {
                System.out.printf("it will take %d months for facebook to have %f users%n", month, a);
            break;
            }



        }
    }
}
