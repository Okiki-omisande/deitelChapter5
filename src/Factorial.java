 public class Factorial {
        public static void main(String[] args) {
            long f = 1;
            for (int counter = 1; counter <= 20; ++counter) {
                f *= counter;

                System.out.printf("the factorial of %d is = %d%n",counter , f);
            }
        }
    }

