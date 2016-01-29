/**
 * InvalidNameException.java
 */
package exceptions;

/**
 * Thrown if the name String isn't long enough
 */
public class InvalidNameException extends Exception {

    /**
     * Creates a new instance of InvalidNameException
     *
     * @param description
     * @throws exceptions.InvalidNameException
     */
    public static void InvalidNameException(String description) throws
            InvalidNameException {
        if (description.length() <= 2) {
            InvalidNameException myException = new InvalidNameException();
            throw myException;
        }
    }

}
