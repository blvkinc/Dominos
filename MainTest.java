import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testGenerateDominoes() {
        Main main = new Main();
        main.generateDominoes();
        assertEquals(28, main._d.size());
    }

    @Test
    void testGenerateGuesses() {
        Main main = new Main();
        main.generateGuesses();
        assertEquals(28, main._g.size());
    }

    @Test
    void testCollateGrid() {
        Main main = new Main();
        main.generateDominoes();
        main.collateGrid();
        assertEquals(9, main.grid[0][0]);
        assertEquals(9, main.grid[6][7]);
    }

    @Test
    void testCollateGuessGrid() {
        Main main = new Main();
        main.generateGuesses();
        main.collateGuessGrid();
        assertEquals(9, main.gg[0][0]);
        assertEquals(9, main.gg[6][7]);
    }

    @Test
    void testShuffleDominoesOrder() {
        Main main = new Main();
        main.generateDominoes();
        main.shuffleDominoesOrder();
        assertNotEquals(main._d.get(0), new Domino(0, 0));
    }

    @Test
    void testInvertSomeDominoes() {
        Main main = new Main();
        main.generateDominoes();
        main.invertSomeDominoes();
        assertNotEquals(main._d.get(0), new Domino(0, 0));
    }

    @Test
    void testTryToRotateDominoAt() {
        Main main = new Main();
        main.generateDominoes();
        main.tryToRotateDominoAt(0, 0);
        assertNotEquals(main._d.get(0), new Domino(0, 0));
    }

    @Test
    void testFindDominoAt() {
        Main main = new Main();
        main.generateDominoes();
        Domino d = main.findDominoAt(0, 0);
        assertNotNull(d);
        assertEquals(0, d.low);
        assertEquals(0, d.high);
    }

    @Test
    void testFindGuessAt() {
        Main main = new Main();
        main.generateGuesses();
        Domino d = main.findGuessAt(0, 0);
        assertNotNull(d);
        assertEquals(0, d.low);
        assertEquals(0, d.high);
    }

    @Test
    void testFindGuessByLH() {
        Main main = new Main();
        main.generateGuesses();
        Domino d = main.findGuessByLH(0, 0);
        assertNotNull(d);
        assertEquals(0, d.low);
        assertEquals(0, d.high);
    }

    @Test
    void testFindDominoByLH() {
        Main main = new Main();
        main.generateDominoes();
        Domino d = main.findDominoByLH(0, 0);
        assertNotNull(d);
        assertEquals(0, d.low);
        assertEquals(0, d.high);
    }

    @Test
    void testRun() {
        Main main = new Main();
        main.generateDominoes();
        main.shuffleDominoesOrder();
        main.placeDominoes();
        main.rotateDominoes();
        main.collateGrid();
        main.generateGuesses();
        main.collateGuessGrid();
        main.mode = 1;
        main.cf = 0;
        main.score = 0;
        main.startTime = System.currentTimeMillis();
        main.run();
        
    }
}