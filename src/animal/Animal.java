package animal;

import exceptions.InvalidNameException;
import exceptions.InvalidWeightException;
import javax.swing.JTextArea;

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
     * @throws exceptions.InvalidNameException if name < 3 characters
     * @throw
     * s exceptions.InvalidWeightException if weight <=0
     *
     */
    public Animal(String n, Double w, int a) throws InvalidNameException,
            InvalidWeightException {
        if (n.length() > 2 && w > 0) {
            age = a;
            weight = w;
            name = n;
        } else if (n.length() <= 2) {
            throw new InvalidNameException();

        } else {
            throw new InvalidWeightException();
        }

    }

    /**
     * changes the name variable to the String parameter specified by the user.
     *
     * @param changeName String value that represents the name of an animal.
     * @throws exceptions.InvalidNameException if name length is less than 3.
     *
     */
    public void setName(String changeName) throws InvalidNameException {
        if (changeName.length() > 2) {
            name = changeName;
        } else {
            throw new InvalidNameException();
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
     * @throws exceptions.InvalidWeightException if weight <= 0
     */
    public void setWeight(double changeWeight) throws InvalidWeightException {
        if (changeWeight > 0) {
            weight = changeWeight;
        } else {
            throw new InvalidWeightException();
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
     *
     * @param output text area to output contents of instance variables
     */
    public void display(JTextArea output) {
        String values = toString();
        output.append(values);

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
