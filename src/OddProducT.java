public class OddProducT {
    public OddProducT() {
    }

    public static void main(String[] args) {
        int odd = 1;

        for(int counter = 1; counter <= 15; ++counter) {
            if (counter % 2 != 0) {
                odd *= counter;
                System.out.println(odd);
            }
        }

    }
}

