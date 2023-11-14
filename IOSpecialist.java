package base;

/**
 * Handles input/output operations and delegates to IOLibrary.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class IOSpecialist {

    /**
     * Default constructor.
     */
    public IOSpecialist() {
        // No initialization needed for now
    }

    /**
     * Gets a string from the user using IOLibrary.
     * 
     * @return the input string
     */
    public String getString() {
        return IOLibrary.getString();
    }
}
