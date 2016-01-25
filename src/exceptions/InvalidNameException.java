/**
 * InvalidNameException.java
 */

package exceptions;

/**
 * Thrown if the name String isn't long enough
 */
public class InvalidNameException extends Exception {
    
    /** Creates a new instance of InvalidNameException */
    public InvalidNameException(String description) {
        super (description);
    }
    
}