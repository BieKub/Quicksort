/**
 * The Object class represents an individual with an age and a name.
 */
public class Object {
    private int Indiviual_age; // The age of the individual
    private String Indiviual_name; // The name of the individual

    /**
     * Constructs an Object with the specified age and name.
     * 
     * @param age  the age of the individual
     * @param name the name of the individual
     */
    public Object(int age, String name) {
        Indiviual_age = age;
        Indiviual_name = name;
    }

    /**
     * Gets the age of the individual.
     * 
     * @return the age of the individual
     */
    public int getAge() {
        return Indiviual_age;
    }

    /**
     * Gets the name of the individual.
     * 
     * @return the name of the individual
     */
    public String getString() {
        return Indiviual_name;
    }

    /**
     * Returns a string representation of the Object.
     * 
     * @return a string representation of the Object
     */
    public String toString() {
        return "(" + Indiviual_name + ": " + Indiviual_age + ")";
    }
}