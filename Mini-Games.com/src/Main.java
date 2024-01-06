import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        while (true)
        {
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println();
            System.out.println("Wellcome in Mini-Games.com");
            System.out.println("\n Choose the what you want to play:.");
            System.out.println("1. Hangman.");
            System.out.println("2. Russian roulette.");
            System.out.println("3. Tic Tac Toe.");
            System.out.println("4. Quiz.");
            System.out.println("5. Rock, Paper, Scissors.");
            System.out.println("6. Seals (Ships)");
            System.out.println("0. Exit");

            int option = scanner.nextInt();

            switch (option)
            {
                case 1 :
                    // Gra w wisielca
                    Hangman.main(args);
                    break;
                case 2:
                    GuessTheNumber.main(args);
                    break;
                case 3:
                    // Gra w Kółko i krzyżyk
                    Tic_Tac_Toe.main(args);
                    break;
                case 4:
                    Quiz.main(args);
                    break;
                case 5:
                    RockPaperScissors.main(args);
                    break;
                case 6:
                    BattleShips.main(args);
                    break;
                case 0:
                    System.out.println("Goodbye :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, please choose another time correct. ( 1 - 6 )");
                    break;
            }
        }
    }
}