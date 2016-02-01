/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import exceptions.InvalidNameException;
import exceptions.InvalidWeightException;
import javax.swing.JTextArea;

/**
 * Mammal.java This program describes some basic properties of a mammal. It
 * inherits the Animal class.
 *
 * @author James Leahy
 */
public class Mammal extends Animal {

    /**
     * String variable that represents the color of a mammal.
     */
    private String color;

    /**
     * Constructor to initialize instance variables.
     *
     * @param n String value that represents a name.
     * @param w Double value that represents the weight of a mammal.
     * @param a Integer value that represents the age of a mammal.
     * @param c String value that represents the color of a mammal.
     * @throws exceptions.InvalidNameException
     * @throws exceptions.InvalidWeightException
     * @throw NumberformatException
     */
    public Mammal(String n, Double w, int a, String c) throws InvalidNameException,
            InvalidWeightException {
        super(n, w, a);
        color = c;

    }

    /**
     * sets the instance variable color to value specified by the user.
     *
     * @param c String instance variable that represents the color of a mammal..
     */
    public void setColor(String c) {
        color = c;

    }

    /**
     * returns the color of a mammal.
     *
     * @return the String variable stored in the instance variable color
     */
    public String getColor() {
        return color;
    }

    /**
     * displays the contents of the global variables.
     *
     * @param t text area
     */
    public void display(JTextArea t) {
        t.append("name: " + name + " type: mammal" + " weight: " + weight
                + " age:" + age
                + " color: " + color);
    }

    /**
     *
     * @return the contents of the instance variables as a string value
     */
    public String toString() {
        String x = "name: " + name + " type: mammal" + " weight: " + weight
                + " age:" + age
                + " color: " + color;
        return x;
    }

}
