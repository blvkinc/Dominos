package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 * Utility class for handling input/output operations.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public final class IOLibrary {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private IOLibrary() {
        // private constructor to prevent instantiation
    }

    /**
     * Reads a line of text from the console.
     * 
     * @return the input string
     */
    public static String getString() {
        do {
            try {
                return reader.readLine();
            } catch (IOException e) {
                // Handle IOException
                e.printStackTrace();
            }
        } while (true);
    }

    /**
     * Reads an IP address from the console.
     * 
     * @return the InetAddress
     */
    public static InetAddress getIPAddress() {
        do {
            try {
                String[] chunks = reader.readLine().split("\\.");
                byte[] data = { Byte.parseByte(chunks[0]), Byte.parseByte(chunks[1]), Byte.parseByte(chunks[2]),
                        Byte.parseByte(chunks[3]) };
                return Inet4Address.getByAddress(data);
            } catch (Exception e) {
                // Handle exceptions
                e.printStackTrace();
            }
        } while (true);
    }
}
