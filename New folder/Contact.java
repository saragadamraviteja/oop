import java.lang.Comparable;

import javax.print.event.PrintJobListener;
/**
 *
 *This class discusses about the Contact Object.
 *The attributes of the contact object are as follows.
 *name:Name of the person/friend.
 *email:mail id of the person/friend.
 *phoneNumber:Phone Number of the person/friend.
 *
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class

public class Contact {
    /**
     * name.
     */
    private String name;
    /**
     * email.
     */
    private String email;
    /**
     * Phone Number.
     */
    private String phoneNumber;
    /**
     *
     * @param name1
     * @param email1
     * @param phoneNumber1
     */
    public Contact[] relations; 
    public int size;
    Contact(){

    }
    public Contact(final String name1, 
    final String email1, final String phoneNumber1) {
        this.name = name1;
        this.email = email1;
        this.phoneNumber = phoneNumber1;
        this.relations =new Contact[10];
        this.size=0;
    }
    /**
    * @return given output
    * @param name
    */
    public String getName() {
        return this.name;
    }
    /**
    * @return given output
    * @param phoneNumber
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
    * @return given output
    * @param email
    */
    public String getEmail() {
        return this.email;
    }
    /**
    *
    * @param email
    */
    public void setEmail(final String email) {
        this.email = email;
    }
    /**
    *
    * @param name
    */
    public void setName(final String name) {
        this.name = name;
    }
    /**
     *
     * @param phonenumber
     */
    public void setPhoneNumber(final String phonenumber) {
        this.phoneNumber = phonenumber;
    }
    /**
    * @return given output
    */
    
    public String toString() {
        return "{ Name = " + this.name + ", Email = "
        + this.email + ", Phone Number = " + this.phoneNumber + " }";

    }
    // public int compareTo(Contact c){
    //     return this.name.compareTo(c.name);
    // }
}

