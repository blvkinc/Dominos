package base;

/**
 * Represents a Domino that can be placed on a game board.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class Domino implements Comparable<Domino> {
    private int high;
    private int low;
    private int hx;
    private int hy;
    private int lx;
    private int ly;
    private boolean placed;

    public Domino(int high, int low) {
        this.high = high;
        this.low = low;
        this.placed = false;
    }

    public void place(int hx, int hy, int lx, int ly) {
        this.hx = hx;
        this.hy = hy;
        this.lx = lx;
        this.ly = ly;
        this.placed = true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[")
              .append(high)
              .append(low)
              .append("]");
        if (!placed) {
            result.append("unplaced");
        } else {
            result.append("(")
                  .append(hx + 1)
                  .append(",")
                  .append(hy + 1)
                  .append(")")
                  .append("(")
                  .append(lx + 1)
                  .append(",")
                  .append(ly + 1)
                  .append(")");
        }
        return result.toString();
    }

    /**
     * Inverts the domino by swapping its high and low values.
     */
    public void invert() {
        int tempX = hx;
        hx = lx;
        lx = tempX;

        int tempY = hy;
        hy = ly;
        ly = tempY;
    }

    /**
     * Checks if the domino is horizontal.
     * 
     * @return true if horizontal, false otherwise
     */
    public boolean isHorizontal() {
        return hy == ly;
    }

    @Override
    public int compareTo(Domino other) {
        if (this.high < other.high) {
            return 1;
        }
        return this.low - other.low;
    }
}
