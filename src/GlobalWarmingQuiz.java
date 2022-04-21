import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {

        int Score = 0;
        int Ans;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Global Warming Quiz" +
                "\n -You have five questions to attempt" +
                "\n -To select answer enter option number");
        System.out.println();


        for (int counter = 1; counter <= 5; ++counter) {

            switch (counter) {
                case 1:
                    System.out.println("Which of this does not threaten the food security?" +
                            "\n1 Withering droughts" +
                            "\n2 Extreme heat" +
                            "\n3 Excess flood" +
                            "\n4 Food planting");

                    System.out.println();
                    System.out.print("Ans:");
                    Ans = input.nextInt();
                    System.out.println();

                    if (Ans == 4) {
                        ++Score;
                    }
                    break;

                case 2:
                    System.out.println("Which of this animal is extinct due to global warming?" +
                            "\n1 Elephant" +
                            "\n2 Cockroach" +
                            "\n3 Golden frog" +
                            "\n4 Snake");

                    System.out.println();
                    System.out.print("Ans:");
                    Ans = input.nextInt();
                    System.out.println();

                    if (Ans == 3) {
                        ++Score;
                    }
                    break;

                case 3:
                    System.out.println("It is estimated that climate change will drive ___ people into extreme poverty in the next decade?" +
                            "\n1 10 - 100 thousand" +
                            "\n2 32 - 132 million" +
                            "\n3 4 - 7 billion" +
                            "\n4 78 - 300 trillion");

                    System.out.println();
                    System.out.print("Ans:");
                    Ans = input.nextInt();
                    System.out.println();

                    if (Ans == 2) {
                        ++Score;
                    }
                    break;

                case 4:
                    System.out.println("The world is currently experiencing ___ degree centigrade of global warming  ?" +
                            "\n1 1.1" +
                            "\n2 4.7" +
                            "\n3 3.5" +
                            "\n4 9.2");

                    System.out.println();
                    System.out.print("Ans:");
                    Ans = input.nextInt();
                    System.out.println();

                    if (Ans == 1) {
                        ++Score;
                    }
                    break;

                default:
                    System.out.println("According to IPCC reports ___ people are living in countries highly vulnerable to climate change?" +
                            "\n1 2.2 million" +
                            "\n2 3.3 billion" +
                            "\n3 5.6 trillion" +
                            "\n4 8.1 zillion");

                    System.out.println();
                    System.out.print("Ans:");
                    Ans = input.nextInt();
                    System.out.println();
                    if (Ans == 2) {
                        ++Score;
                    }



            }
        }

        System.out.print("Your score:" +Score);
        System.out.println();

        if (Score == 5){
            System.out.println("Excellent!");
        }
        else if (Score == 4) {
            System.out.println("Very good");
        }
        else
            System.out.println("Time to brush up your knowledge on global warming"+
                    "\nvisit climate.nasa.gov4 to get started");
    }
}
