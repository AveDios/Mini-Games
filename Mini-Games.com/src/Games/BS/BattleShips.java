package Games.BS;

import java.util.*;

public class BattleShips {
    public static int nRows = 10;
    public static int nCols = 10;
    public static int pShips;
    public static int cShips;
    public static String[][] grid = new String[nRows][nCols];
    public static int[][] missedGuess = new int[nRows][nCols];


    public static void start() {
        System.out.println("**** Welcome to Seals (Ships) game ****");
        System.out.println("Right now, sea is empty\n");

        // Stworzenie mapy
        createMap();

        // Ustawienie statków gracza
        deployPlayerShips();

        // Ustawienie statków komputera
        deployComputerShips();

        // Walka
        do {
            Battle();
        } while (BattleShips.pShips != 0 && BattleShips.cShips != 0);

        // Koniec gry
        gameOver();
    }

    public static void createMap(){
        //First section of Ocean Map
        System.out.print("  ");
        for(int i = 0; i < nCols; i++)
            System.out.print(i);
        System.out.println();

        //Middle section of Ocean Map
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " ";
                if (j == 0)
                    System.out.print(i + "|" + grid[i][j]);
                else if (j == grid[i].length - 1)
                    System.out.print(grid[i][j] + "|" + i);
                else
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        //Last section of Ocean Map
        System.out.print("  ");
        for(int i = 0; i < nCols; i++)
            System.out.print(i);
        System.out.println();
    }

    public static void deployPlayerShips() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Deploy your ships: ");
        // Stawianie 5 statków dla gracza
        BattleShips.pShips = 5;
        for (int i = 0; i <= BattleShips.pShips; ) {
            System.out.println("Enter Y coord for your " + i + " ship: ");
            int x = sc.nextInt();
            System.out.println("Enter X coord for your " + i + " ship: ");
            int y = sc.nextInt();

            if((x >= 0 && x < nRows) && (y >= 0 && y < nCols) && (grid[x][y] == " ")) {
                grid[x][y] =   "@";
                i++;
            }else if((x >= 0 && x < nRows) && (y >= 0 && y < nCols) && grid[x][y] == "@") {
                System.out.println("You can't place two or more ships on the same location");
            }else if((x < 0 || x >= nRows) || (y < 0 || y >= nCols)) {
                System.out.println("You can't place ships outside the " + nRows + " by " + nCols + " grid");
            }
        }
        printOceanMap();
    }

    public static void deployComputerShips() {
        System.out.println("\nComputer is deploying ships: ");
        // Stawianie 5 statków
        BattleShips.cShips = 5;

        for (int i = 0; i <= BattleShips.cShips; ) {
            int x = (int)(Math.random() * 10);
            int y = (int)(Math.random() * 10);

            if ((x >= 0 && x < nRows) && (y >= 0 && y < nCols) && (grid[x][y] == " ")){
                grid[x][y] = "x";
                System.out.println(i + ".ship deployed");
                i++;
            }
        }
        printOceanMap();
    }

    public static void Battle() {
        pTurn();
        cTurn();

        printOceanMap();

        System.out.println();
        System.out.println("Your ships: " + BattleShips.pShips);
        System.out.println();
    }

    public static void  pTurn() {
        System.out.println("\n Your Turn");
        int x = -1, y = -1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Y coord: ");
            x = sc.nextInt();
            System.out.println("Enter X coord: ");
            y = sc.nextInt();

            if ((x >= 0 && x < nRows) && (y >= 0 && y < nCols)) {
                if (grid[x][y] == "x") {
                    System.out.println("Boom! You sunk the ship!");
                    grid[x][y] = "!";
                    --BattleShips.cShips;
                } else if (grid[x][y] == "@") {
                    System.out.println("Oh no, you sunk your own ship :(");
                    grid[x][y] = "x";
                    --BattleShips.pShips;
                    ++BattleShips.cShips;
                } else if (grid[x][y] == " ") {
                    System.out.println("HAHAHAHH you are soo bad, you missed");
                    grid[x][y] = "-";
                }
            }
            else if ((x < 0 || x >= nRows) || (y < 0 || y >= nCols)) {
                System.out.println("You can't place ships outside the " + nRows + " by " + nCols + " grid");
            }
        } while ((x < 0 || x >= nRows) || (y < 0 || y >= nCols));
    }

    public static void cTurn() {
        System.out.println("\n Your opponent turn (Computer LOSER)");
        int x = -1, y = -1;
        do {
            x = (int)(Math.random() * 10);
            y = (int)(Math.random() * 10);

            if ((x >= 0 && x < nRows) && (y >= 0 && y < nCols)) {
                if (grid[x][y] == "@"){
                    System.out.println("The Computer sunk one of your ships! HAHAHAHAHA");
                    grid[x][y] = "x";
                    --BattleShips.pShips;
                    ++BattleShips.cShips;
                } else if (grid[x][y] == "x") {
                    System.out.println("The Computer sunk one of its own ships. SIGMA");
                    grid[x][y] = "!";
                } else if (grid[x][y] == " ") {
                    System.out.println("Computer missed");
                    //Saving missed guesses for computer
                    if(missedGuess[x][y] != 1) {
                        missedGuess[x][y] = 1;
                    }
                }
            }
        } while ((x < 0 || x >= nRows) || (y < 0 || y >= nCols));
    }

    public static void gameOver() {
        System.out.println("Your ships: " + BattleShips.pShips + " | Computer ships: " + BattleShips.cShips);
        if(BattleShips.pShips > 0 && BattleShips.cShips <= 0) {
            System.out.println("Hooray! You won the battle :)");
        } else {
            System.out.println("Sorry, you lost the battle");
        } System.out.println();
    }

    public static void printOceanMap() {
        System.out.println();
        //First section of Ocean Map
        System.out.print("  ");
        for (int i = 0; i < nCols; i++) {
            System.out.print(i);
        }
        System.out.println();

        //Middle section of Ocean Map
        for (int x = 0; x < grid.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < grid[x].length; y++) {
                System.out.print(grid[x][y]);
            }

            System.out.println("|" + x);
        }

        System.out.print("  ");
        for (int i = 0; i < nCols; i++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
