import java.util.Locale;
import java.util.Scanner;

class Hangman {

    // Zbiór haseł do gry w hangman'a
    private static final String[] words = {"kanye", "banana", "computer", "cow", "rain", "water", "west" };

    // Wybiera losowe słowo z words i zapisuje ją do zmiennej word
    private static final String word = words[(int) (Math.random() * words.length)];

    // Zamienia wybrane słowo na "*" (identyczna ilość "*" ile jest liter)
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");

    //Ta linia kodu deklaruje zmienną o nazwie count i inicjalizuje ją do 0. Zmienna count
    // będzie używana do śledzenia liczby błędnych odpowiedzi użytkownika.
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Wpisujemy literki jakie chcemy sprawdzić czy znajdują się w tym słowie. dopóki zmienna count jest mniejsza niż 7 i ciąg asterisk nadal zawiera gwiazdki.
        // Na koniec odczytuje od użytkownika odgadnięcie i wywołuje metodę "hang()" do przetworzenia odgadnięcia.
        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = scanner.next();
            hang(guess);
        }
    }

    // Jeżeli odgadliśmy literke to program zamienia ją z "*" na literkę która jest poprawna
    public static void hang(String guess) {
        StringBuilder newasterisk = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk.append(guess.charAt(0));
            } else if (asterisk.charAt(i) != '*') {
                newasterisk.append(word.charAt(i));
            } else {
                newasterisk.append("*");
            }
        }

        // Ta część kodu sprawdza, czy ciągi asterisk i newasterisk są równe. Jeśli są równe, to odgadnięcie było nieprawidłowe i zmienna count jest inkrementowana.
        // Wywoływana jest metoda hangmanImage() do wyświetlenia obrazu wisielca. W przeciwnym razie ciąg asterisk jest aktualizowany, aby odzwierciedlić poprawne odgadnięcie.
        if (asterisk.contentEquals(newasterisk)) {
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk.toString();
        }
        // Sprawdza czy wygraliśmy. Jeżeli odgadliśmy cały wyraz to wygraliśmy gre i możemy zagrac jeszcze raz
        if (asterisk.equals(word)) {
            System.out.println("Correct! You win! The word was " + word);
        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("___|___");
            System.out.println();
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   | ");
            System.out.println("___|___");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("GAME OVER! The word was " + word);
        }
    }
}