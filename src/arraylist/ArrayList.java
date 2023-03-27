package arraylist;

/**
 * A custom implementation of an ArrayList.
 * 
 * @param <T> the type of object to store in the list
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * @since CS131Lab3_0MEL
 * 
 */
public class ArrayList<T> {
    private final int DEFAULT_SIZE = 10;
    private int currentItem = 0;
    private T arList[];

    /**
     * Constructs a new ArrayList with a default length of 10.
     */
    @SuppressWarnings("unchecked")
    public ArrayList() {
        arList = (T[]) new Object[DEFAULT_SIZE];
    }

    /**
     * Constructs a new ArrayList with the specified length.
     * 
     * @param length the length of the ArrayList
     */
    @SuppressWarnings("unchecked")
    public ArrayList(int length) {
        arList = (T[]) new Object[length];
    }

    /**
     * Adds an item to the end of the ArrayList.
     * 
     * @param item the item to add to the list
     * @return true if the item was added, false if the list is full
     */
    public boolean addItem(T item) {
        if (currentItem >= arList.length) {
            return false;
        } else {
            arList[currentItem] = item;
            currentItem++;
            return true;
        }
    }

    /**
     * Returns a string representation of the ArrayList.
     * 
     * @return a string representation of the ArrayList
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < currentItem; i++) {
            sb.append(arList[i].toString());
            if (i != currentItem - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}