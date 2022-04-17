public class SumofEven {
    public SumofEven() {
    }

    public static void main(String[] args) {
        int Total = 0;

        for(int X = 2; X <= 20; X += 2) {
            Total += X;
        }

        System.out.printf("%d%n", Total);
    }
}

