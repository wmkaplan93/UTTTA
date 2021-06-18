import java.util.HashMap;
import java.util.Map;

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
                "---|---|--- \n" +
                " " + b1 + " | " + b2 + " | " + b3 + " \n" +
                "---|---|--- \n" +
                " " + c1 + " | " + c2 + " | " + c3 + " ");
    }
    public void setBoard(String location, String value) {
        switch (location) {
            case "a1", "A1" -> setA1(value);
            case "a2", "A2" -> setA2(value);
            case "a3", "A3" -> setA3(value);
            case "b1", "B1" -> setB1(value);
            case "b2", "B2" -> setB2(value);
            case "b3", "B3" -> setB3(value);
            case "c1", "C1" -> setC1(value);
            case "c2", "C2" -> setC2(value);
            case "c3", "C3" -> setC3(value);
        }
        System.out.println(location + " is now set to: " + value);
        displayBoard();
    }

    public String getValue(String value) {
        String returnValue = "";
        switch (value) {
            case "a1", "A1" -> { returnValue = getA1(); }
            case "a2", "A2" -> { returnValue = getA2(); }
            case "a3", "A3" -> { returnValue = getA3(); }
            case "b1", "B1" -> { returnValue = getB1(); }
            case "b2", "B2" -> { returnValue = getB2(); }
            case "b3", "B3" -> { returnValue = getB3(); }
            case "c1", "C1" -> { returnValue = getC1(); }
            case "c2", "C2" -> { returnValue = getC2(); }
            case "c3", "C3" -> { returnValue = getC3(); }
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }

        return returnValue;
    }
    public Map createMap() {
        HashMap<String, String> valueMap = new HashMap<String, String>();
        valueMap.put("A1", getA1());
        valueMap.put("A2", getA2());
        valueMap.put("A3", getA3());
        valueMap.put("B1", getB1());
        valueMap.put("B2", getB2());
        valueMap.put("B3", getB3());
        valueMap.put("C1", getC1());
        valueMap.put("C2", getC2());
        valueMap.put("C3", getC3());

        return valueMap;
    }

    public void updateMap(Map valueMap, String key, String value) {
        valueMap.remove(key);
        valueMap.put(key, value);
    }
}
