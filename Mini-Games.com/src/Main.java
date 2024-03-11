
import Games.BS.BattleShips;
import Games.GTN.GuessTheNumber;
import Games.HangMan.Hangman;
import Games.Quiz.Quiz;
import Games.RPS.RockPaperScissors;
import Games.TTT.Tic_Tac_Toe;

import java.util.Locale;
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
            System.out.println("1. Games.HangMan.Hangman.");
            System.out.println("2. Russian roulette.");
            System.out.println("3. Tic Tac Toe.");
            System.out.println("4. Games.Quiz.Quiz.");
            System.out.println("5. Rock, Paper, Scissors.");
            System.out.println("6. Seals (Ships)");
            System.out.println("0. Exit");

            int option = scanner.nextInt();

            switch (option)
            {
                case 1 :
                    // Gra w wisielca
                    Hangman.start();
                    break;
                case 2:
                    // Gra w zgadywanie numeru
                    GuessTheNumber.start();
                    break;
                case 3:
                    // Gra w Kółko i krzyżyk
                    Tic_Tac_Toe.start();
                    break;
                case 4:
                    // Games.Quiz.Quiz
                    Quiz.start();
                    break;
                case 5:
                    // Papier kamień i nożyce
                    RockPaperScissors.start();
                    break;
                case 6:
                    // Statki
                    BattleShips.start();
                    break;
                case 0:
                    // Wyjście
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