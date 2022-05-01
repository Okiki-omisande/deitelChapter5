public class PieValue {
    public static void main(String[] args) {
        double pi = 0.0;
        double currentpi;
        double odd = 1;

        System.out.printf("%7s  %5s", "Counter", "Value");
        for (int i = 1; i <= 200000; ++i){

            if (i % 2 == 0){
                currentpi = -4/odd;
            }
            else
                currentpi = 4/odd;

            odd +=2;
            pi += currentpi;


            System.out.printf("%7d  %5.5f%n",i,pi);

        }
    }
}
