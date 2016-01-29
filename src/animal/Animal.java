/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import exceptions.InvalidNameException;
import static exceptions.InvalidNameException.InvalidNameException;
import exceptions.InvalidWeightException;
import static exceptions.InvalidWeightException.InvalidWeightException;
import javax.swing.JOptionPane;

/**
 * Animal.java This program describes some basic properties of an animal. It
 * will be inherited by reptile and mammal classes.
 *
 * @author James Leahy
 * @version 1.0
 */
public class Animal {

    /**
     * age variable represents the age of the animal chosen by the user.
     */
    protected int age;
    /**
     * the name that is given to the animal by the user.
     */
    protected String name;
    /**
     * the weight given to the animal by the user.
     */
    protected double weight;

    /**
     * Constructor to initialize instance variables.
     *
     * @param n String value that represents a name.
     * @param w Double value that represents the weight of an animal.
     * @param a Integer value that represents the age of an animal.
     * @throw NumberformatException
     */
    public Animal(String n, Double w, int a) {
        age = a;
        try {
            InvalidWeightException(w);
            weight = w;
        } catch (InvalidWeightException e) {
            JOptionPane.showMessageDialog(null, "Weight must be > 0");
        }
        try {
            InvalidNameException(n);
            name = n;
        } catch (InvalidNameException e) {
            JOptionPane.showMessageDialog(null, "Name length must be > 2");
        }

    }

    /**
     * changes the name variable to the String parameter specified by the user.
     *
     * @param changeName String value that represents the name of an animal.
     *
     */
    public void setName(String changeName) {
        try {
            InvalidNameException(changeName);
            name = changeName;
        } catch (InvalidNameException e) {
            JOptionPane.showMessageDialog(null, "Name length must be > 2");
        }
    }

    /**
     * to return the value in the global variable name
     *
     * @return returns the String value stored in the global variable name
     */
    public String getName() {
        return name;
    }

    /**
     * changes the weight of an animal to the value specified by the user.
     *
     * @param changeWeight Double value that represents the weight of an Animal.
     */
    public void setWeight(double changeWeight) {
        try {
            InvalidWeightException(changeWeight);
            weight = changeWeight;
        } catch (InvalidWeightException e) {
            JOptionPane.showMessageDialog(null, "Weight must be > 0");
        }
    }

    /**
     * returns the value stored in the global weight variable.
     *
     * @return returns the Double value stored in the global variable weight.
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * changes the age of an animal to the value specified by the user.
     *
     * @param changeAge Integer variable that represents the age of an animal
     */
    public void setAge(int changeAge) {
        age = changeAge;
    }

    /**
     * returns the value stored in the global age variable.
     *
     * @return Integer value stored in the age variable
     */
    public int getAge() {
        return age;
    }

    /**
     * Display the contents of the global variables.
     */
    public void display() {
        String values = toString();

    }

    /**
     *
     * @return returns the contents of the instance variables as a string
     */
    public String toString() {
        String x = "name: " + name + " weight: " + weight + " age:" + age;
        return x;
    }

}
