
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class app {
//    private Board board;
//    private UserX userX;
//    private UserO userO;
    private Runner runner;


    public static void main(String[] args) {
        app app = new app(new Runner());
        app.run();
    }



    public app(Runner runner) {
//        this.userO = userO;
//        this.userX = userX;
//        this.board = board;
        this.runner = runner;
    }

    public void run() {
        runner.run();
    }



//    public void run() {
//        //writes out some stuff in command line
//        System.out.println("Welcome to the Ultimate Tic Tac Toe Automation");
//        System.out.println("<[^ . ^]>");
//
//        System.out.println("Prepare for die.");
//        System.out.println("<[◣ ◢]>");
//
//        //Asks if you want to be X or O
//        board.displayBoard();
//
//        String choice = "1";
//
//        makeChoice(choice);
//    }
//    public void makeChoice (String choice) {
//        System.out.println("Would you like to be 'X' or 'O'?");
//        System.out.println("Not that it matters.");
//        System.out.println("You're going to lose anyway.");
//        System.out.println("Scrub.");
//
//        Scanner input = new Scanner(System.in);
//
//        while (!choice.equalsIgnoreCase("x") || !choice.equalsIgnoreCase("o") || !choice.equalsIgnoreCase("q")) {
////        while (choice.equalsIgnoreCase("1")) {
//
//            choice = input.nextLine();
//            if (choice.equalsIgnoreCase("x") || choice.equalsIgnoreCase("o") || choice.equalsIgnoreCase("q")) {
//                choiceMade(choice);
//                break;
//            }
//            System.out.println("*scoffs* Can't even make a simple choice.");
//            System.out.println("Try again. If you dare.\n (Or 'Q' to quit)");
//        }
//        input.close();
//
//    }
//
//    public void choiceMade(String choice) {
//        Scanner input = new Scanner(System.in);
//
//        HashMap<String, String> valueMap = (HashMap<String, String>) board.createMap();
//        mapCheck(valueMap);
//        if (choice.equalsIgnoreCase("q")) {
//            quitDialog();
//        } else if (choice.equalsIgnoreCase("o")) {
//            System.exit(3);
//        } else {
//
//            boolean matchFound = true;
//
//            while (matchFound) {
//                System.out.println("Choose a location: ");
//                String location = input.nextLine();
//                //checks for quit
//                if(location.equalsIgnoreCase("q")) {
//                    quitDialog();
//                }
//
//                Pattern pattern = Pattern.compile("[abc][1-3]", Pattern.CASE_INSENSITIVE);
//                Matcher matcher = pattern.matcher(location);
//                matchFound = matcher.find();
//
//                if(matchFound) {
//                    board.setBoard(location, "X");
//                    board.updateMap(valueMap, location, "X");
//                    valueCheck(location);
//                    mapCheck(valueMap);
//                } else {
//                    System.out.println("That's not a valid choice.");
//                    System.out.println("Ugh... Humans...");
//                }
//                matchFound = false;
//            }
//            // computer makes choice
//            //board.displayBoard();
//            System.out.println("Pick again.... IF YOU DARE!");
//            System.out.println("(or q to quit)");
//            choice = "2";
//            choiceMade(choice);
//        }
//    }
//
//    public void quitDialog() {
//        System.out.println("That's right, run while you still can!");
//        System.out.println("<[◣ ◢]>");
//        System.exit(0);
//    }
//
//    public void valueCheck(String value) {
//        String valueResult = board.getValue(value);
//        System.out.println("The value of " + value + " is: " + valueResult);
//    }
//
//    public void mapCheck(HashMap map) {
//        for (Object i : map.keySet()) {
//            System.out.println("key: " + i + " value: " + map.get(i));        }
//    }
////      x always goes first
////    public void startX() {
////        new UserX(board);
////    }
////
////    public void startO() {
////        new UserO(board);
////        UserO.run();
////    }

}
