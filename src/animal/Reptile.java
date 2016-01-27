/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author James
 */
public class Reptile extends Animal {

    /**
     * Integer variable that represents the length of a reptile.
     */
    private int length;

    /**
     * Constructor to initialize instance variables.
     *
     * @param n String value that represents a name.
     * @param w Double value that represents the weight of a reptile.
     * @param a Integer value that represents the age of a reptile.
     * @param l Integer value that represents the length of a reptile.
     * @throw NumberformatException
     */
    public Reptile(String n, Double w, int a, int l) {
        super(n, w, a);
        length = l;
    }

    /**
     * sets the instance variable length to value specified by the user.
     *
     * @param l Integer variable that represents the length of a reptile.
     */
    public void setLength(int l) {
        length = l;

    }

    /**
     * returns the length of a reptile.
     *
     * @return the Integer variable stored in the instance variable length
     */
    public int getLength() {
        return length;
    }

    /**
     * displays the contents of the instance variables.
     */
    public void display() {

    }

    public String toString() {
        String x = "";
        return x;
    }
}
