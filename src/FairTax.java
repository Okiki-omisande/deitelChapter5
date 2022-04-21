import java.util.Scanner;

public class FairTax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double housing;
        double food;
        double clothing;
        double transportation;
        double education;
        double healthcare;
        double vacation;
        double Expenses = 0;
        int Totalexpenses= 0;


        System.out.println("Enter category or -1 to quit" + "\n1 -housing " + "\n2 -food" + "\n3 -clothing" +
                           "\n4 -transportation" + "\n5 -education" + "\n6 -healthcare" + "\n7 -vacation\n");

        System.out.print("Category:");
        int Category = input.nextInt();

        while (Category != -1)
        {

            switch (Category){
                case 1:
                    System.out.print("Enter housing expenses or 0 to quit:");
                    housing = input.nextDouble();

                    if (housing != 0){
                        Expenses += housing;
                    }
                    break;

                case 2:
                    System.out.print("Enter food expenses or 0 to quit:");
                    food = input.nextDouble();

                    if (food != 0){
                        Expenses += food;
                    }
                    break;

                case 3:
                    System.out.print("Enter clothing expenses or 0 to quit:");
                    clothing = input.nextDouble();

                    if (clothing != 0){
                        Expenses += clothing;
                    }
                    break;

                case 4:
                    System.out.print("Enter transportation expenses or 0 to quit:");
                    transportation = input.nextDouble();

                    if (transportation!= 0){
                        Expenses += transportation;
                    }
                    break;

                case 5:
                    System.out.print("Enter education expenses or 0 to quit:");
                    education = input.nextDouble();

                    if (education != 0){
                        Expenses += education;
                    }
                    break;

                case 6:
                    System.out.print("Enter health care expenses or 0 to quit:");
                    healthcare = input.nextDouble();

                    if (healthcare != 0){
                        Expenses += healthcare;
                    }
                    break;

                case 7:
                    System.out.print("Enter vacation expenses or 0 to quit:");
                    vacation = input.nextDouble();

                    if (vacation != 0){
                        Expenses += vacation;
                    }
                    break;
            }

            Totalexpenses += Expenses;

            System.out.println();
            System.out.print("Enter category or -1 to quit:");
            Category = input.nextInt();
        }

        System.out.println();
        double FairTax = (Totalexpenses * 0.23);
        System.out.printf("Totalexpenses:%d%n", Totalexpenses);
        System.out.printf("Please pay $%.2f as FairTax on your total expenditure " +
                "%nFairTax = 23 percent of expenditure", FairTax);
        System.out.println();
    }
}

