/**
 * Square class
 * Represents a square with a given side length. It provides
 * methods for calculating the area of the square and returning a string
 * representation of the square.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * @since CS131Lab3_0MEL
 */
public class Square {
    private double side;

    /**
     * Constructs a new square with side length 0.
     */
    public Square() {
        this.side = 0.0;
    }

    /**
     * Constructs a new square with the given side length.
     * 
     * @param s the side length of the square
     */
    public Square(double s) {
        this.side = s;
    }

    /**
     * Calculates and returns the area of the square.
     * 
     * @return the area of the square
     */
    public double getArea() {
        return side * side;
    }

    /**
     * Returns a string representation of the square.
     * 
     * @return a string representation of the square
     */
    public String toString() {
        return "Square with side " + side;
    }
}