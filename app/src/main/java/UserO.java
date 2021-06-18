import java.util.HashMap;

public class UserO {

    //instantiates board
    Board board;

    public UserO(Board board) {
        this.board = board;
    }

    //main method
    public void run() {
        board.setBoard("a1", "O");
        System.out.println("Making sure it displays correctly");
        valueCheck("A1");

    }

    //helper methods
    public void valueCheck(String value) {
        String valueResult = board.getValue(value);
        System.out.println("The value of " + value + " is: " + valueResult);
    }

    public void mapCheck(HashMap map) {
        for (Object i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
    }
    //sets board variable

}
