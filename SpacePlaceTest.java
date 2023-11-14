package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpacePlaceTest {

    private SpacePlace spacePlace;

    @Before
    public void setUp() {
        spacePlace = new SpacePlace();
    }

    @After
    public void tearDown() {
        spacePlace = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(0, spacePlace.getxOrg());
        assertEquals(0, spacePlace.getyOrg());
        assertEquals(0.0, spacePlace.getTheta(), 0.0);
        assertEquals(0.0, spacePlace.getPhi(), 0.0);
    }

    @Test
    public void testConstructorWithThetaPhi() {
        spacePlace = new SpacePlace(1.0, 2.0);
        assertEquals(0, spacePlace.getxOrg());
        assertEquals(0, spacePlace.getyOrg());
        assertEquals(1.0, spacePlace.getTheta(), 0.0);
        assertEquals(2.0, spacePlace.getPhi(), 0.0);
    }

    @Test
    public void testSettersAndGetters() {
        spacePlace.setxOrg(10);
        spacePlace.setyOrg(20);
        spacePlace.setTheta(1.5);
        spacePlace.setPhi(2.5);

        assertEquals(10, spacePlace.getxOrg());
        assertEquals(20, spacePlace.getyOrg());
        assertEquals(1.5, spacePlace.getTheta(), 0.0);
        assertEquals(2.5, spacePlace.getPhi(), 0.0);
    }
}
