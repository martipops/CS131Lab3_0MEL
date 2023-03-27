import arraylist.ArrayList;

/**
 * A main application
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * @since CS131Lab3_0MEL
 */
public class ListApp {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.addItem("Hello");
        stringList.addItem("World");
        System.out.println("String list: " + stringList.toString());

        ArrayList<Square> squareList = new ArrayList<Square>();
        squareList.addItem(new Square(5.0));
        squareList.addItem(new Square(10.0));
        System.out.println("Square list: " + squareList.toString());

        ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();
        pointList.addItem(new PointThreeD(1.0, 2.0, 3.0));
        pointList.addItem(new PointThreeD(-1.0, -2.0, -3.0));
        System.out.println("Point list: " + pointList.toString());
    }
}
