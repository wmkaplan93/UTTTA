import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        app app = new app(new UserO(), new UserX(), new Board());
        app.run();

    }

    private Board board;
    private UserX userX;
    private UserO userO;

    public app(UserO userO, UserX userX, Board board) {
        this.userO = userO;
        this.userX = userX;
        this.board = board;
    }



    public void run() {
        //writes out some stuff in command line
        System.out.println("Welcome to the Ultimate Tic Tac Toe Automation");
        System.out.println("Prepare for die.");

        //Asks if you want to be X or O
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to be 'X' or 'O'?");
        System.out.println("Not that it matters.");
        System.out.println("You're going to lose anyway.");
        System.out.println("Scrub.");

        String choice = input.nextLine();
        while (!choice.equalsIgnoreCase("x") || !choice.equalsIgnoreCase("o") || !choice.equalsIgnoreCase("q")) {
            System.out.println("*scoffs* Can't even make a simple choice.");
            System.out.println("Try again. If you dare.\n (Or 'Q' to quit)");

            choice = input.nextLine();

            if (choice.equalsIgnoreCase("q")) {
                System.exit(0);
            } else if (choice.equalsIgnoreCase("x")) {
                userX.TestX();
            } else {
                userO.run();
            }
        }
        input.close();

    }

}
