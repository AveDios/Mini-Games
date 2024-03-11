package Games.Quiz;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Quiz {
    static int score;
    public static void start() {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.println("\n ************************************** \n");
            System.out.println("Welcome to Games.Quiz.Quiz-game");
            System.out.println("What difficult quiz do you want to make? (Number)");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");
            System.out.println("0. Exit");
            int difficultyChoose = sc.nextInt();

            switch (difficultyChoose){
                case 1:
                    easyQuiz();
                    continue;
                case 2:
                    mediumQuiz();
                    continue;
                case 3:
                    hardQuiz();
                    continue;
                case 0:
                    System.out.println("Goodbye.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choose.");
                    break;
            }
            break;
        }
    }

    public static void easyQuiz(){
        System.out.println("Please choose what kid of quiz do you want to do:");
        System.out.println("1. Math \n2. History \n3. Programming");
        Scanner choose = new Scanner(System.in);
        int easyChoose =choose.nextInt();
        if (easyChoose == 1){
            String[][] easyQuizMath = {
                    {"What is 2 + 2? \na) 5\nb) 3\nc) 4\nd) 6", "c"},
                    {"What is 2 to the power of 5? \na) 32\nb) 256\nc) 16\nd) 128", "a"},
                    {"What is 2(a + b) + (a - b)^2? \na) b\nb) 2 - 2b\nc) a - b\nd) 3a + b", "d"},
                    {"What is 3 + (-2) + 6 - (-2)? \na) -7\nb) 9\nc) 7\nd) -9", "b"},
                    {"What is 8 * 6? \na) 48\nb) 40\nc) 59\nd) 52", "a"}
            };

            for (String[] strings : easyQuizMath) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /easyQuizMath.length;

            System.out.println("Your finally score is " + score + " out of " + easyQuizMath.length + "." + "\nAnd it is: " + prcScore * 100 + "%");

        } else if (easyChoose == 2){
            String[][] easyQuizHistory = {
                    {"Whats the date of 'Bitwa pod Grunwaldem'? \na) 1939\nb) 1410\nc) 420\nd) 2115", "b"},
                    {"When start WW2 in Poland? \na) 1945 p.n.e\nb) 1939 p.n.e\nc) 1939\nd) 1945", "c"},
                    {"Who was the first king od Poland? \na) Mieszko I\nb) Kazimierz III Wielki\nc) Andrzej Duda\nd) Jadwiga Andegaweńska", "a"},
                    {"How old is Planet Earth? \na) 7,3 mld\nb) 1,8 mld\nc) 3,4 mld\nd) 4,6 mld", "d"},
                    {"What is name od Napoleon Bonaparte? \na) Bonaparte\nb) Napoleon\nc) Cristiano\nd) Leo", "b"}
            };

            for (String[] strings : easyQuizHistory) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /easyQuizHistory.length;

            System.out.println("Your finally score is " + score + " out of " + easyQuizHistory.length + "." + "\nAnd it is: " + prcScore * 100 + "%");

        } else if (easyChoose == 3){
            String[][] easyQuizProgramming = {
                    {"What variable can hold the smallest values? \na) int\nb) varchar\nc) byte\nd) decimal", "c"},
                    {"Choose 2 OOP language. \na) Java and C#\nb) Python and HTML\nc) Basic and C++\nd) XML and CSS", "a"},
                    {"How many characters you can use with varchar? \na) 1\nb) Infinity\nc) 128\nd) 255", "d"},
                    {"What type of characters can you use in char? \na) Its not exist\nb) Numbers\nc) All but only one\nd) Like in string", "c"},
                    {"What is the newest language made by Microsoft? \na) C#\nb) Java\nc) Basic\nd) PHP", "a"}
            };

            for (String[] strings : easyQuizProgramming) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /easyQuizProgramming.length;

            System.out.println("Your finally score is " + score + " out of " + easyQuizProgramming.length + "." + "\nAnd it is: " + prcScore * 100 + "%");
        }
    }

    public static void mediumQuiz(){
        System.out.println("Please choose what kid of quiz do you want to do:");
        System.out.println("1. Math \n2. History \n3. Programming");
        Scanner choose = new Scanner(System.in);
        int midChoose =choose.nextInt();
        if (midChoose == 1){
            String[][] midQuizMath = {
                    {"What is 3 * 4 * 2 * 4? \na) 78\nb) 69\nc) 96\nd) 85", "c"},
                    {"What is 2^3 + 4^2 + 20? \na) 40\nb) 44\nc) 48\nd) 56", "b"},
                    {"What is 2(5 + 1)^2 + (3 - 2)^2? \na) 56\nb) 35\nc) 86\nd) 73", "d"},
                    {"What is (3 + (-2) + 6 - (-2))^2? \na) 81\nb) 79\nc) 80\nd) 82", "a"},
                    {"What is 8 * 6 * 7 * 2 * 8? \na) 4867\nb) 4003\nc) 5376\nd) 5221", "c"}
            };

            for (String[] strings : midQuizMath) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /midQuizMath.length;

            System.out.println("Your finally score is " + score + " out of " + midQuizMath.length + "." + "\nAnd it is: " + prcScore * 100 + "%");

        } else if (midChoose == 2){
            String[][] midQuizHistory = {
                    {"Who was Mieszko I's wife \na) Jadwiga\nb) Dobrawa\nc) Anna\nd) Róża", "b"},
                    {"When start WW1 in Poland \na) 1945 p.n.e\nb) 1914\nc) 1939\nd) 1945", "b"},
                    {"From whose hands did Bolesław the Brave receive the crown? \na) Mieszko I\nb) Pope Jan XIX\nc) Otton II\nd) Bill Gates", "c"},
                    {"When was the 1st partition of Poland? \na) 1772\nb) 1775\nc) 1783\nd) 1770", "a"},
                    {"What was the uprising in 1863? \na) Grudniowe\nb) Wrześniowe\nc) Listopadowe\nd) Styczniowe", "d"}
            };

            for (String[] strings : midQuizHistory) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /midQuizHistory.length;

            System.out.println("Your finally score is " + score + " out of " + midQuizHistory.length + "." + "\nAnd it is: " + prcScore * 100 + "%");

        } else if (midChoose == 3){
            String[][] midQuizProgramming = {
                    {"What is a setter? \na) You can set sth\nb) You can get sth\nc) Variable\nd) Car", "a"},
                    {"Choose 3 OOP language. \na) Basic, XML and C++\nb) Python, CSS and HTML\nc) Java, C# and PHP\nd) XML, Java and CSS", "c"},
                    {"How many characters you can use with int? \na) 1\nb) Infinity\nc) 128\nd) 2^32", "d"},
                    {"Where you can use mySQL? \na) In Java\nb) In databases\nc) In the post\nd) To play for sth", "b"},
                    {"What language was C# made from? \na) C++\nb) Java\nc) Basic\nd) PHP", "a"}
            };

            for (String[] strings : midQuizProgramming) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /midQuizProgramming.length;

            System.out.println("Your finally score is " + score + " out of " + midQuizProgramming.length + "." + "\nAnd it is: " + prcScore * 100 + "%");
        }
    }

    public static void hardQuiz(){
        System.out.println("Please choose what kid of quiz do you want to do:");
        System.out.println("1. Math \n2. History \n3. Programming");
        Scanner choose = new Scanner(System.in);
        int hardChoose =choose.nextInt();
        if (hardChoose == 1){
            String[][] hardQuizMath = {
                    {"What is 6^6 + 21? \na) 783452\nb) 46677\nc) 35296\nd) 63485", "b"},
                    {"What is (2^3 + 4^2 + 20)^2? \na) 1940\nb) 1944\nc) 1948\nd) 1936", "d"},
                    {"What is (2(5 + 1)^2)^2 * -2? \na) -10368\nb) 10335\nc) -10386\nd) 100373", "a"},
                    {"What is (3 + (-2) + 6 - (-2))^2 - 1? \na) 82\nb) 79\nc) 80\nd) 81", "a"},
                    {"What is (8 * 6 * 7 * 2 * 8)^1/2? \na) 2867\nb) 2688\nc) 2376\nd) 3221", "b"}
            };

            for (String[] strings : hardQuizMath) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /hardQuizMath.length;

            System.out.println("Your finally score is " + score + " out of " + hardQuizMath.length + "." + "\nAnd it is: " + prcScore * 100 + "%");

        } else if (hardChoose == 2){
            String[][] hardQuizHistory = {
                    {"When did the dodo become extinct? \na) 1690\nb) 2002\nc) 1854\nd) 1794", "a"},
                    {"When modern man was born \na) About 44 thousand years ago\nb) About 40 thousand years ago\nc) About 41 thousand years ago\nd) About 39 thousand years ago", "b"},
                    {"When was the first pyramid built? \na) 568 B.C.\nb) 453 B.C.\nc) 630 B.C.\nd) 784 B.C.", "c"},
                    {"When was the 2st partition of Poland? \na) 1793\nb) 1775\nc) 1783\nd) 1770", "a"},
                    {"Which made the dinosaurs extinct? \na) Tsunami\nb) Earthquake\nc) Humans\nd) Meteor", "d"}
            };

            for (String[] strings : hardQuizHistory) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /hardQuizHistory.length;

            System.out.println("Your finally score is " + score + " out of " + hardQuizHistory.length + "." + "\nAnd it is: " + prcScore * 100 + "%");

        } else if (hardChoose == 3){
            String[][] hardQuizProgramming = {
                    {"What is a getter? \na) You can set sth\nb) You can get sth\nc) Variable\nd) Car", "b"},
                    {"What is boolean? \na) Car brand\nb) Really fast processor\nc) Variable\nd) Name of computer brand", "c"},
                    {"What kind of symbols you can use in float? \na) Alphabet\nb) Numbers\nc) Emotes\nd) None", "b"},
                    {"Who create Python? \na) Guido van Rossum\nb) Leonardo da Vinci\nc) Brat Pitt\nd) Jan Matejko", "a"},
                    {"What is the newest JDK version? \na) 20\nb) 21\nc) 17\nd) 19", "b"}
            };

            for (String[] strings : hardQuizProgramming) {
                String question = strings[0];
                String answer = strings[1];

                System.out.println(question);
                Scanner sc = new Scanner(System.in);
                String userAnswer = sc.nextLine();

                if (userAnswer.equalsIgnoreCase(answer)) {
                    System.out.println("Correct!");
                    ++score;
                } else {
                    System.out.println("Incorrect. The answer is " + answer + ".");
                }
            }
            float prcScore = (float) score /hardQuizProgramming.length;

            System.out.println("Your finally score is " + score + " out of " + hardQuizProgramming.length + "." + "\nAnd it is: " + prcScore * 100 + "%");
        }
    }
}