/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

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
        name = n;
        age = a;
        weight = w;

    }

    /**
     * changes the name variable to the String parameter specified by the user.
     *
     * @param changeName String value that represents the name of an animal.
     * @throws InvalidNameException
     */
    public void setName(String changeName) {
        name = changeName;
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
     * @throws InvalidWeightException if the weight is not > 0.
     */
    public void setWeight(double changeWeight) {
        weight = changeWeight;
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

    }

    public String toString() {
        String x = "";
        return x;
    }

}
