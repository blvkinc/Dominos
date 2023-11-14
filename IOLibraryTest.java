package base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.net.InetAddress;

import static org.junit.Assert.assertEquals;

public class IOLibraryTest {

    private final InputStream originalSystemIn = System.in;
    private final PrintStream originalSystemOut = System.out;
    private final ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(systemOutContent));
    }

    @After
    public void restoreStreams() {
        System.setIn(originalSystemIn);
        System.setOut(originalSystemOut);
    }

    @Test
    public void testGetString() {
        String input = "Hello, World!";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        String result = IOLibrary.getString();

        assertEquals("Hello, World!", result.trim());
    }

    @Test
    public void testGetIPAddress() {
        String input = "192.168.0.1";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        InetAddress result = IOLibrary.getIPAddress();

        assertEquals("192.168.0.1", result.getHostAddress());
    }
}
