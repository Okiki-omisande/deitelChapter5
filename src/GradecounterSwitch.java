import java.util.Scanner;

public class GradecounterSwitch {
    public GradecounterSwitch() {
    }

    public static void main(String[] args) {
        int Total = 0;
        int Counter = 0;
        int Agrade = 0;
        int Bgrade = 0;
        int Cgrade = 0;
        int Dgrade = 0;
        int Fgrade = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n", "Enter the integer grades in the range 0-100 or -1 to quit:");

        for(int Grade = input.nextInt(); Grade != -1; Grade = input.nextInt()) {
            ++Counter;
            Total += Grade;
            switch(Grade / 10) {
                case 6:
                    ++Dgrade;
                    break;
                case 7:
                    ++Cgrade;
                    break;
                case 8:
                    ++Bgrade;
                    break;
                case 9:
                case 10:
                    ++Agrade;
                    break;
                default:
                    ++Fgrade;
            }

            System.out.printf("%s%n", "Enter the integer grades in the range 0-100 or -1 to quit:");
        }

        System.out.println("Grade report:");
        if (Counter != 0) {
            double Average = (double)Total / (double)Counter;
            System.out.printf("of the %d grades entered the total is %d%n", Counter, Total);
            System.out.printf("the average is %.2f%n", Average);
            System.out.println();
            System.out.printf("%d student(s) scored A%n", Agrade);
            System.out.printf("%d student(s) scored B%n", Bgrade);
            System.out.printf("%d student(s) scored C%n", Cgrade);
            System.out.printf("%d student(s) scored D%n", Dgrade);
            System.out.printf("%d student(s) scored F", Fgrade);
        } else {
            System.out.println("No grade was entered");
        }

    }
}

