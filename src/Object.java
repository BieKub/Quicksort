import java.util.ArrayList;



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


    public static ArrayList<Object> list_of_people =  new ArrayList<Object>(); 
    
    public static ArrayList<Object> generatePerson(ArrayList<String> nameList,int amount) {
        
       


        for (int i = 0; i <= amount; i++) {
            int age_Gen = (int) ((Math.random()*100) +1) ;


            int name_Gen = (int) ((Math.random()*nameList.size()));
            String generated_name = nameList.get(name_Gen);
            Object temp_Add = new Object(age_Gen,generated_name);
            list_of_people.add(temp_Add);
            
        }

        return list_of_people;

    }
}
