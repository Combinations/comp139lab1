/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author James Leahy
 */
public class InvalidWeightException extends Exception {

    /**
     * Creates a new instance of InvalidWeightException
     *
     * @param i
     * @throws exceptions.InvalidWeightException
     */
    public static void InvalidWeightException(double i) throws
            InvalidWeightException {
        if (i <= 0) {
            InvalidWeightException myException = new InvalidWeightException();
            throw myException;
        }
    }
}