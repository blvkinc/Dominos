package base;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Represents a location with optional direction.
 * Handles drawing grid lines and getting an integer from the user.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class Location extends SpacePlace {

    public int c;
    public int r;
    public DIRECTION d;
    public int tmp;
    public enum DIRECTION { VERTICAL, HORIZONTAL };

    /**
     * Constructs a Location with row and column.
     * 
     * @param r the row
     * @param c the column
     */
    public Location(int r, int c) {
        this.r = r;
        this.c = c;
    }

    /**
     * Constructs a Location with row, column, and direction.
     * 
     * @param r the row
     * @param c the column
     * @param d the direction
     */
    public Location(int r, int c, DIRECTION d) {
        this(r, c);
        this.d = d;
    }

    /**
     * Returns a string representation of the location.
     * 
     * @return the string representation
     */
    public String toString() {
        if (d == null) {
            tmp = c + 1;
            return "(" + (tmp) + "," + (r + 1) + ")";
        } else {
            tmp = c + 1;
            return "(" + (tmp) + "," + (r + 1) + "," + d + ")";
        }
    }

    /**
     * Draws grid lines on the graphics context.
     * 
     * @param g the graphics context
     */
    public void drawGridLines(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        for (tmp = 0; tmp <= 7; tmp++) {
            g.drawLine(20, 20 + tmp * 20, 180, 20 + tmp * 20);
        }
        for (int see = 0; see <= 8; see++) {
            g.drawLine(20 + see * 20, 20, 20 + see * 20, 160);
        }
    }

    /**
     * Gets an integer from the user.
     * 
     * @return the integer input by the user
     */
    public static int getInt() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                return Integer.parseInt(r.readLine());
            } catch (Exception e) {
            }
        } while (true);
    }
}
