import java.util.Scanner;

public class SmallesT {
    public SmallesT() {
    }

    public static void main(String[] args) {
        int Counter = 0;
        int Smallest = 10000000;
        Scanner amount = new Scanner(System.in);
        System.out.print("Enter total number of input:");
        int Amount = amount.nextInt();
        System.out.println();

        while(Amount > 0 && Counter <= Amount) {
            ++Counter;
            System.out.print("Enter number:");
            int Number = amount.nextInt();
            if (Number < Smallest) {
                Smallest = Number;
            }
        }

        if (Amount != 0) {
            System.out.println("Smallest number = " + Smallest);
        } else {
            System.out.println("No input was recorded");
            System.out.print("Please try again!");
        }

    }
}

