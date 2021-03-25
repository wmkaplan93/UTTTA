public class Board {

    //Contains 9 values which are the squares
    //a1 - c3

    private String a1 = " ";
    private String a2 = " ";
    private String a3 = " ";
    private String b1 = " ";
    private String b2 = " ";
    private String b3 = " ";
    private String c1 = " ";
    private String c2 = " ";
    private String c3 = " ";

    public String getA1() {
        return a1;
    }
    public void setA1(String a1) {
        this.a1 = a1;
    }
    public String getA2() {
        return a2;
    }
    public void setA2(String a2) {
        this.a2 = a2;
    }
    public String getA3() {
        return a3;
    }
    public void setA3(String a3) {
        this.a3 = a3;
    }
    public String getB1() {
        return b1;
    }
    public void setB1(String b1) {

        this.b1 = b1;
    }
    public String getB2() {

        return b2;
    }
    public void setB2(String b2) {
        this.b2 = b2;
    }
    public String getB3() {
        return b3;
    }
    public void setB3(String b3) {
        this.b3 = b3;
    }
    public String getC1() {
        return c1;
    }
    public void setC1(String c1) {
        this.c1 = c1;
    }
    public String getC2() {
        return c2;
    }
    public void setC2(String c2) {
        this.c2 = c2;
    }
    public String getC3() {
        return c3;
    }
    public void setC3(String c3) {
        this.c3 = c3;
    }

    public void displayBoard() {
        System.out.println(" " + a1 + " | " + a2 + " | " + a3 + " \n" +
                "---|---|---" +
                " " + b1 + " | " + b2 + " | " + b3 + " \n" +
                "---|---|---" +
                " " + c1 + " | " + c2 + " | " + c3 + " ");
    }
    public void setBoard(String location, String value) {
        switch (location) {
            case "a1" -> setA1(value);
            case "a2" -> setA2(value);
            case "a3" -> setA3(value);
            case "b1" -> setB1(value);
            case "b2" -> setB2(value);
            case "b3" -> setB3(value);
            case "c1" -> setC1(value);
            case "c2" -> setC2(value);
            case "c3" -> setC3(value);
        }
        displayBoard();
    }

}
