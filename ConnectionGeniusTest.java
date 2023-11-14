import org.junit.Test;
import static org.junit.Assert.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConnectionGeniusTest {

    @Test
    public void testFireUpGame() {
        // Arrange
        ConnectionGenius connectionGenius = new ConnectionGenius(getDummyInetAddress());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        connectionGenius.fireUpGame();

        // Assert
        assertEquals("Getting specialized web version.\nWait a couple of moments\nConnecting\nReady to play\n", outContent.toString());
    }

    @Test
    public void testDownloadWebVersion() {
        // Arrange
        ConnectionGenius connectionGenius = new ConnectionGenius(getDummyInetAddress());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        connectionGenius.downloadWebVersion();

        // Assert
        assertEquals("Getting specialized web version.\nWait a couple of moments\n", outContent.toString());
    }

    @Test
    public void testConnectToWebService() {
        // Arrange
        ConnectionGenius connectionGenius = new ConnectionGenius(getDummyInetAddress());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        connectionGenius.connectToWebService();

        // Assert
        assertEquals("Connecting\n", outContent.toString());
    }

    @Test
    public void testAwayWeGo() {
        // Arrange
        ConnectionGenius connectionGenius = new ConnectionGenius(getDummyInetAddress());
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        connectionGenius.awayWeGo();

        // Assert
        assertEquals("Ready to play\n", outContent.toString());
    }

    private InetAddress getDummyInetAddress() {
        try {
            return InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            throw new RuntimeException("Failed to create dummy InetAddress");
        }
    }
}
