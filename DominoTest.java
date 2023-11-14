package base;

import org.junit.Test;
import static org.junit.Assert.*;

public class DominoTest {

    @Test
    public void testToStringUnplacedDomino() {
        Domino domino = new Domino(3, 6);
        assertEquals("[36]unplaced", domino.toString());
    }

    @Test
    public void testToStringPlacedDomino() {
        Domino domino = new Domino(3, 6);
        domino.place(1, 2, 3, 4);
        assertEquals("[36](2,3)(4,5)", domino.toString());
    }

    @Test
    public void testInvert() {
        Domino domino = new Domino(3, 6);
        domino.place(1, 2, 3, 4);
        domino.invert();
        assertEquals("[36](4,5)(2,3)", domino.toString());
    }

    @Test
    public void testIsHorizontal() {
        Domino horizontalDomino = new Domino(3, 6);
        Domino verticalDomino = new Domino(4, 5);
        horizontalDomino.place(1, 2, 3, 4);
        verticalDomino.place(1, 2, 1, 3);

        assertTrue(horizontalDomino.isHorizontal());
        assertFalse(verticalDomino.isHorizontal());
    }

    @Test
    public void testCompareTo() {
        Domino domino1 = new Domino(3, 6);
        Domino domino2 = new Domino(4, 5);

        assertTrue(domino1.compareTo(domino2) > 0);
        assertTrue(domino2.compareTo(domino1) < 0);
        assertEquals(0, domino1.compareTo(domino1));
    }
}
