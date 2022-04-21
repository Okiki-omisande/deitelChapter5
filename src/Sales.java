import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
  int Dstv = 1; int Gotv= 2; int Mitv = 3; int Hitv = 4; int Rstv = 5;
  int Counter=0;
  double Product=0;
  double Total = 0;

       Scanner input =new Scanner(System.in);
        System.out.print("Welcome Dish franchise ltd " +
                "\n -to Order Dstv enter 1" + "\n -to order Gotv enter 2" + "\n -to order Mitv enter 3" + "\n -to order Hitv enter 4" +
                "\n -to order Rstv enter 5");

        System.out.println();
        System.out.println();
        System.out.print("Enter your order or (-1 to Quit): ");
        int order = input.nextInt();

        while (order != -1){
            System.out.print("Enter the quantity:");
            int Quantity = input.nextInt();
            System.out.println();
            ++Counter;

            switch (order){
                case 1:
                    Product = 2.98 * Quantity;
                    break;

                case 2:
                    Product =4.50 * Quantity;
                    break;

                case 3:
                    Product = 9.98 * Quantity;
                    break;

                case 4:
                    Product = 4.49 * Quantity;
                    break;

                case 5:
                    Product = 6.87 * Quantity;
                    break;

                default:
                    System.out.println("Enter a valid input");
                    System.out.println();
                    break;

            }

            Total+=Product;
            System.out.print("Enter your order or (-1 to Quit): ");
            order = input.nextInt();
        }

        if (Counter != 0)
            System.out.printf("Please pay $%.2f%n", Total);
        else
            System.out.println("No input was recorded");
    }
}
