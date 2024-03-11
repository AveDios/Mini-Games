package Games.TTT;

import java.util.*;

public class Tic_Tac_Toe {

    static String[] board;
    static String turn;


    // metoda CheckWinner będzie sprawdzała możliwe kombinacje do zwyciężenia
    static String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = switch (a) {
                case 0 -> board[0] + board[1] + board[2];
                case 1 -> board[3] + board[4] + board[5];
                case 2 -> board[6] + board[7] + board[8];
                case 3 -> board[0] + board[3] + board[6];
                case 4 -> board[1] + board[4] + board[7];
                case 5 -> board[2] + board[5] + board[8];
                case 6 -> board[0] + board[4] + board[8];
                case 7 -> board[2] + board[4] + board[6];
                default -> null;
            };

            // Skrócona forma switch

//            switch (a) {
//                case 0:
//                    line = board[0] + board[1] + board[2];
//                    break;
//                case 1:
//                    line = board[3] + board[4] + board[5];
//                    break;
//                case 2:
//                    line = board[6] + board[7] + board[8];
//                    break;
//                case 3:
//                    line = board[0] + board[3] + board[6];
//                    break;
//                case 4:
//                    line = board[1] + board[4] + board[7];
//                    break;
//                case 5:
//                    line = board[2] + board[5] + board[8];
//                    break;
//                case 6:
//                    line = board[0] + board[4] + board[8];
//                    break;
//                case 7:
//                    line = board[2] + board[4] + board[6];
//                    break;
//            }

            // X jako zwycięsca
            if (line.equals("XXX")) {
                return "X";
            }

            // O jako zwycięsca
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }

        // Kogo jest teraz tura.
        System.out.println(
                turn + "'s turn; enter a slot number to place "
                        + turn + " in:");
        return null;
    }

    // Tak ma wypisać plansze do gry w Tic Tac Toe.
    /* |---|---|---|
       | 1 | 2 | 3 |
       |-----------|
       | 4 | 5 | 6 |
       |-----------|
       | 7 | 8 | 9 |
       |---|---|---|*/

    static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " |");
        System.out.println("|---|---|---|");
    }

    public static void start()
    {
        Scanner scanner = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();

        System.out.println(
                "X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

            // Wyjątki.
            // numInput będzie brał liczbe wpisaną przez usera od 1 do 9.
            // Jeżeli liczba będzie za mała bądź za duza lub już była wpisywana program będzie kazał wpisać liczbę ponownie
            try {
                numInput = scanner.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input; re-enter slot number:");
                continue;
            }

            // Ta gra ma dwóch graczy x oraz o.
            // Oto jak będzie decydowało kogo runda.
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }

                printBoard();
                winner = checkWinner();
            }
            else {
                System.out.println(
                        "Slot already taken; re-enter slot number:");
            }
        }

        // Jeżeli nikt nie wygra to pokaże że gracze zremisowali
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        }

        // Jeżeli wygra to pokaże kto wygrał
        else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }
    }
}