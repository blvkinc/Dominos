package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class LocationTest {

    private final InputStream originalSystemIn = System.in;

    @Before
    public void setUpStreams() {
        // No need to set up output streams for this case
    }

    @After
    public void restoreStreams() {
        System.setIn(originalSystemIn);
    }

    @Test
    public void testGetInt() {
        String input = "42";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        int result = Location.getInt();

        assertEquals(42, result);
    }
}
