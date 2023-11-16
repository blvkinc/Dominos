package base;
import java.net.InetAddress;

/**
 * Represents a ConnectionGenius that handles game initiation.
  
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class ConnectionGenius {

  private InetAddress ipAddress; // Renamed to follow Java naming convention

  public ConnectionGenius(InetAddress ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * Initiates the game by downloading the web version, connecting to the web service, and starting the game.
   */
  public void fireUpGame() {
    downloadWebVersion();
    connectToWebService();
    awayWeGo();
  }

  /**
   * Downloads the specialized web version.
   */
  public void downloadWebVersion(){
    System.out.println("Getting specialized web version.");
    System.out.println("Wait a couple of moments");  
  }

  /**
   * Connects to the web service.
   */
  public void connectToWebService() {
    System.out.println("Connecting");
  }

  /**
   * Signals that the system is ready to play.
   */
  public void awayWeGo(){
    System.out.println("Ready to play");
  }
}
