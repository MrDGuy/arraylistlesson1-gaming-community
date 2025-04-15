/*
 * Represents a player
 */
public class Player {
  
    private String name;    // The name of a player
  
    /*
     * Sets name to the specified name of a player
     */
    public Player(String name) {
      this.name = name;
    }
  
    /*
     * Returns a String containing the name of the player
     */
    public String toString() {
      return name;
    }
    
  }