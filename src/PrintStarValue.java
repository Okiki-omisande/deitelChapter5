import  java.util.Scanner;
public class PrintStarValue {
    public void printBarChart(int one, int two, int three, int four, int five) {
        int counter = 1;
        int number;
        while (counter <= 5) {

            if (counter == 1)
                number = one;
            else if (counter == 2)
                number = two;
            else if (counter == 3)
                number = three;
            else if (counter == 4)
                number = four;
            else
                number = five;


            for (int i = 1; i <= number; ++i) {
                System.out.print("* ");
            }
            System.out.println();
            ++counter;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintStarValue barChart = new PrintStarValue();

        System.out.print("Enter a number between 1 - 30: ");
        int first = input.nextInt();

        System.out.print("Enter a number between 1 - 30: ");
        int second = input.nextInt();

        System.out.print("Enter a number between 1 - 30: ");
        int third = input.nextInt();

        System.out.print("Enter a number between 1 - 30: ");
        int fourth = input.nextInt();

        System.out.print("Enter a number between 1 - 30: ");
        int fifth = input.nextInt();

        System.out.println();
        barChart.printBarChart(first,second,third, fourth, fifth);
    }
}
