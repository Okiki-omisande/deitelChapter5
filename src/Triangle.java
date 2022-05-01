
public class Triangle {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; ++row) {
            for (int c =1; c <= row; ++c)
                System.out.print("*");
            System.out.println();
        }
    }
}
