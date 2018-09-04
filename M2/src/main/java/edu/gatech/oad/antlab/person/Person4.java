/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Jessie Tepper
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            c = (char)(c + 1);
            str = str + c;
        }
        return str;
    }
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
      return name + calc(input);
    }

    public static void main (String[] args) {
        Person4 person = new Person4("Jessie");
        person.toString("abc123");
        System.out.println(person.toString("abc123"));
    }

}

