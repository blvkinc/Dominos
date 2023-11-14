package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class IOSpecialistTest {

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
    public void testGetString() {
        String input = "Hello, IOSpecialist!";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        IOSpecialist ioSpecialist = new IOSpecialist();
        String result = ioSpecialist.getString();

        assertEquals("Hello, IOSpecialist!", result.trim());
    }
}
