import java.util.Locale;
import java.util.Scanner;

public class Quiz {

    static int score;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        while (true) {
            System.out.println("Welcome to Quiz-game");
            System.out.println("What difficult quiz do you want to make? (Number)");
            System.out.println("1. Easy");
            System.out.println("2. Medium");
            System.out.println("3. Hard");
            System.out.println("0. Exit");
            int difficultyChoose = sc.nextInt();

            switch (difficultyChoose){
                case 1:
                    easyQuiz();
                    System.out.println("Congratulations have " + score + " points.");
                    break;
                case 2:
                    mediumQuiz();
                    System.out.println("Congratulations have " + score + " points.");
                    break;
                case 3:
                    hardQuiz();
                    System.out.println("Congratulations have " + score + " points.");
                    break;
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



    //region easyQuiz
    public static void easyQuiz(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String easyChoose;

        while (true) {
            System.out.println("Welcome to easy quiz-game");
            System.out.println("Please choose what kid of quiz do you want to do: (Type word)");
            System.out.println("1. Math \n2. History \n3. Programming");
            easyChoose = sc.nextLine();

            if (easyChoose.equals("Math") || easyChoose.equals("History") || easyChoose.equals("Programming")) {
                System.out.println();
                break;
            }else {
                System.out.println();
                System.out.println("Invalid Choose!!");
                System.out.println("Next time please choose correct!");
                System.out.println();
            }


        }
        //region easyMath
        if (easyChoose.equals("Math")){
            System.out.println("Question number 1.");
            System.out.println("What is 2 + 2?");
            while (true) {
                System.out.println("a) 5\nb) 3\nc) 4\nd) 6");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")){
                    if (easyChoose.equals("c")){
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("What is 2 to the power of 5?");
            while (true) {
                System.out.println("a) 32\nb) 256\nc) 16\nd) 128");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")){
                    if (easyChoose.equals("a")){
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("What is 2(a + b) + (a - b)^2?");
            while (true) {
                System.out.println("a) b\nb) 2 - 2b\nc) a - b\nd) 3a + b");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("d")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("What is 3 + (-2) + 6 - (-2)?");
            while (true) {
                System.out.println("a) -7\nb) 9\nc) 7\nd) -9");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("b")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("What is 8 * 6?");
            while (true) {
                System.out.println("a) 48\nb) 40\nc) 59\nd) 52");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("a")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
        //endregion

        //region easyHistory
        else if (easyChoose.equals("History")) {
            System.out.println("Question number 1.");
            System.out.println("Whats the date of 'Bitwa pod Grunwaldem'?");
            while (true) {
                System.out.println("a) 1939\nb) 1410\nc) 420\nd) 2115");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")){
                    if (easyChoose.equals("b")){
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("When start WW2 in Poland");
            while (true) {
                System.out.println("a) 1945 p.n.e\nb) 1939 p.n.e\nc) 1939\nd) 1945");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")){
                    if (easyChoose.equals("c")){
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("Who was the first king od Poland");
            while (true) {
                System.out.println("a) Mieszko I\nb) Kazimierz III Wielki\nc) Andrzej Duda\nd) Jadwiga Andegaweńska");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("a")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("How old is Planet Earth? ");
            while (true) {
                System.out.println("a) 7,3 mld\nb) 1,8 mld\nc) 3,4 mld\nd) 4,6 mld");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("d")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("What is name od Napoleon Bonaparte");
            while (true) {
                System.out.println("a) Bonaparte\nb) Napoleon\nc) Cristiano\nd) Leo");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("b")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
        //endregion

        //region easyProgramming
        else {
            System.out.println("Question number 1.");
            System.out.println("What variable can hold the smallest values?");
            while (true) {
                System.out.println("a) int\nb) varchar\nc) byte\nd) decimal");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")){
                    if (easyChoose.equals("c")){
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("Choose 2 OOP language");
            while (true) {
                System.out.println("a) Java and C#\nb) Python and HTML\nc) Basic and C++\nd) XML and CSS");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")){
                    if (easyChoose.equals("a")){
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("How many characters you can use with varchar?");
            while (true) {
                System.out.println("a) 1\nb) Infinity\nc) 128\nd) 255");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("d")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("What type of characters can you use in char");
            while (true) {
                System.out.println("a) Its not exist\nb) Numbers\nc) All but only one\nd) Like in string");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("c")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("What is the newest language made by Microsoft?");
            while (true) {
                System.out.println("a) C#\nb) Java\nc) Basic\nd) PHP");
                easyChoose = sc.nextLine();
                if (easyChoose.equals("a") || easyChoose.equals("b") || easyChoose.equals("c") || easyChoose.equals("d")) {
                    if (easyChoose.equals("a")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
        //endregion

    }
    //endregion

    //region midQuiz
    public static void mediumQuiz() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String mediumChoose;

        while (true) {
            System.out.println("Welcome to medium quiz-game");
            System.out.println("Please choose what kid of quiz do you want to do: (Type word)");
            System.out.println("1. Math \n2. History \n3. Programming");
            mediumChoose = sc.nextLine();

            if (mediumChoose.equals("Math") || mediumChoose.equals("History") || mediumChoose.equals("Programming")) {
                System.out.println();
                break;
            } else {
                System.out.println();
                System.out.println("Invalid Choose!!");
                System.out.println("Next time please choose correct!");
                System.out.println();
            }


        }
        //region midMath
        if (mediumChoose.equals("Math")) {
            System.out.println("Question number 1.");
            System.out.println("What is 3 * 4 * 2 * 4?");
            while (true) {
                System.out.println("a) 78\nb) 69\nc) 96\nd) 85");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("c")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("What is 2^3 + 4^2 + 20?");
            while (true) {
                System.out.println("a) 40\nb) 44\nc) 48\nd) 56");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("b")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("What is 2(5 + 1)^2 + (3 - 2)^2?");
            while (true) {
                System.out.println("a) 56\nb) 35\nc) 86\nd) 73");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("d")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("What is (3 + (-2) + 6 - (-2))^2?");
            while (true) {
                System.out.println("a) 81\nb) 79\nc) 80\nd) 82");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("a")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("What is 8 * 6 * 7 * 2 * 8?");
            while (true) {
                System.out.println("a) 4867\nb) 4003\nc) 5376\nd) 5221");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("c")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
        //endregion

        //region midHistory
        else if (mediumChoose.equals("History")) {
            System.out.println("Question number 1.");
            System.out.println("Who was Mieszko I's wife");
            while (true) {
                System.out.println("a) Jadwiga\nb) Dobrawa\nc) Anna\nd) Róża");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("b")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("When start WW1 in Poland");
            while (true) {
                System.out.println("a) 1945 p.n.e\nb) 1914\nc) 1939\nd) 1945");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("b")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("From whose hands did Bolesław the Brave receive the crown?");
            while (true) {
                System.out.println("a) Mieszko I\nb) Pope Jan XIX\nc) Otton II\nd) Bill Gates");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("c")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("When was the 1st partition of Poland?");
            while (true) {
                System.out.println("a) 1772\nb) 1775\nc) 1783\nd) 1770");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("a")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("What was the uprising in 1863?");
            while (true) {
                System.out.println("a) Grudniowe\nb) Wrześniowe\nc) Listopadowe\nd) Styczniowe");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("d")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
        //endregion

        //region midProgramming
        else {
            System.out.println("Question number 1.");
            System.out.println("What is a setter?");
            while (true) {
                System.out.println("a) You can set sth\nb) You can get sth\nc) Variable\nd) Car");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("a")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("Choose 3 OOP language");
            while (true) {
                System.out.println("a) Basic, XML and C++\nb) Python, CSS and HTML\nc) Java, C# and PHP\nd) XML, Java and CSS");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("c")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("How many characters you can use with int?");
            while (true) {
                System.out.println("a) 1\nb) Infinity\nc) 128\nd) 2^32");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("d")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("Where you can use mySQL");
            while (true) {
                System.out.println("a) In Java\nb) In database\nc) In the post\nd) To play for sth");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("b")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("What language was C# made from?");
            while (true) {
                System.out.println("a) C++\nb) Java\nc) Basic\nd) PHP");
                mediumChoose = sc.nextLine();
                if (mediumChoose.equals("a") || mediumChoose.equals("b") || mediumChoose.equals("c") || mediumChoose.equals("d")) {
                    if (mediumChoose.equals("a")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
    }
    //endregion

    //region hardQuiz
    public static void hardQuiz() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String hardChoose;

        while (true) {
            System.out.println("Welcome to medium quiz-game");
            System.out.println("Please choose what kid of quiz do you want to do: (Type word)");
            System.out.println("1. Math \n2. History \n3. Programming");
            hardChoose = sc.nextLine();

            if (hardChoose.equals("Math") || hardChoose.equals("History") || hardChoose.equals("Programming")) {
                System.out.println();
                break;
            } else {
                System.out.println();
                System.out.println("Invalid Choose!!");
                System.out.println("Next time please choose correct!");
                System.out.println();
            }


        }
        //region hardMath
        if (hardChoose.equals("Math")) {
            System.out.println("Question number 1.");
            System.out.println("What is 6^6 + 21?");
            while (true) {
                System.out.println("a) 783452\nb) 46677\nc) 35296\nd) 63485");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("b")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("What is (2^3 + 4^2 + 20)^2?");
            while (true) {
                System.out.println("a) 1940\nb) 1944\nc) 1948\nd) 1936");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("d")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("What is (2(5 + 1)^2)^2 * -2?");
            while (true) {
                System.out.println("a) -10368\nb) 10335\nc) -10386\nd) 100373");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("a")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("What is (3 + (-2) + 6 - (-2))^2 - 1?");
            while (true) {
                System.out.println("a) 82\nb) 79\nc) 80\nd) 81");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("a")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("What is (8 * 6 * 7 * 2 * 8)^1/2?");
            while (true) {
                System.out.println("a) 2867\nb) 2688\nc) 2376\nd) 3221");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("b")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
        //endregion

        //region hardHistory
        else if (hardChoose.equals("History")) {
            System.out.println("Question number 1.");
            System.out.println("When did the dodo become extinct?");
            while (true) {
                System.out.println("a) 1690\nb) 2002\nc) 1854\nd) 1794");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("a")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("When modern man was born");
            while (true) {
                System.out.println("a) About 44 thousand years ago\nb) About 40 thousand years ago\nc) About 41 thousand years ago\nd) About 39 thousand years ago");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("b")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("When was the first pyramid built?");
            while (true) {
                System.out.println("a) 568 B.C.\nb) 453 B.C.\nc) 630 B.C.\nd) 784 B.C.");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("c")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("When was the 2st partition of Poland?");
            while (true) {
                System.out.println("a) 1793\nb) 1775\nc) 1783\nd) 1770");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("a")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("Which made the dinosaurs extinct");
            while (true) {
                System.out.println("a) Tsunami\nb) Earthquake\nc) Humans\nd) Meteor");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("d")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
        //endregion

        //region hardProgramming
        else {
            System.out.println("Question number 1.");
            System.out.println("What is a getter?");
            while (true) {
                System.out.println("a) You can set sth\nb) You can get sth\nc) Variable\nd) Car");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("b")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 2. (2p.)");
            System.out.println("What is boolean");
            while (true) {
                System.out.println("a) Car brand\nb) Really fast processor\nc) Variable\nd) Name of computer brand");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("c")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 3. (3p.)");
            System.out.println("What kind of symbols you can use in float");
            while (true) {
                System.out.println("a) Alphabet\nb) Numbers\nc) Emotes\nd) None");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("b")) {
                        System.out.println("Correct!");
                        score += 3;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 4. (1p.)");
            System.out.println("Who create Python?");
            while (true) {
                System.out.println("a) Guido van Rossum\nb) Leonardo da Vinci\nc) Brat Pitt\nd) Jan Matejko");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("a")) {
                        System.out.println("Correct!");
                        ++score;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }


            System.out.println("\n\nQuestion number 5. (2p.)");
            System.out.println("What is the newest JDK version");
            while (true) {
                System.out.println("a) 20\nb) 21\nc) 17\nd) 19");
                hardChoose = sc.nextLine();
                if (hardChoose.equals("a") || hardChoose.equals("b") || hardChoose.equals("c") || hardChoose.equals("d")) {
                    if (hardChoose.equals("b")) {
                        System.out.println("Correct!");
                        score += 2;
                        System.out.println("U have now " + score + " points");
                    } else {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                System.out.println("\nWrong option please reselect:");
            }
        }
    }
    //endregion
}