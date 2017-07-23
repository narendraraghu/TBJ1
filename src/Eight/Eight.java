package Eight;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Raghu on 16-Jul-17.
 * equal and hash code concept we will learn by this code
 */
public class Eight {

    private String firstName;
    private String lastName;

    public Eight(String firstName, String lastName) {
        this.firstName = firstName;
        lastName = lastName;
    }

  /*  public boolean equals(Eight o) {

       return firstName.equals(o.firstName)&&lastName.equals(o.lastName);

    }
*/

  // OOOHOO why this colavery di ? getting the same object comparison wrong
   //becoz actual implementation takes only Object in parameter not any class like below code here ->
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Eight eight = (Eight) o;            //now convert it to Eight and get the output true

        return firstName.equals(eight.firstName);
    }*/


    //What is my way then

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Eight)) return false;
        Eight eight = (Eight)o;
        return firstName.equals(eight.firstName);// && lastName.equals(eight.lastName);

    }

    @Override
    public int hashCode() {
             return  31 * firstName.hashCode();

    }

    public static void main(String[] args) {
        Set<Eight> fullName = new HashSet<Eight>();
        fullName.add(new Eight("Narendra","Raghuwanshi"));
        System.out.println(fullName.contains(new Eight("Narendra","Raghuwanshi")));
    }
}
