
/**
 * A class that represents a point in 3D space.
 * 
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * @since CS131Lab3_0MEL
 */
public class PointThreeD {
    private double xPoint;
    private double yPoint;
    private double zPoint;

    /**
     * Empty Constructor
     * Constructs a new PointThreeD object with x, y, and z coordinates all set to
     * 0.
     */
    public PointThreeD() {
        this.xPoint = 0.0;
        this.yPoint = 0.0;
        this.zPoint = 0.0;
    }

    /**
     * Preferred Constructor
     * Constructs a new PointThreeD object with specified x, y, and z coordinates.
     * 
     * @param x the x coordinate
     * @param y the y coordinate
     * @param z the z coordinate
     */
    public PointThreeD(double x, double y, double z) {
        this.xPoint = x;
        this.yPoint = y;
        this.zPoint = z;
    }

    /**
     * Returns a string representation of the PointThreeD object.
     * 
     * @return a string representation of the PointThreeD object
     */
    public String toString() {
        return "Point (" + xPoint + ", " + yPoint + ", " + zPoint + ")";
    }
}