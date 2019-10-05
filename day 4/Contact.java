/**.
 * This class discusses about the Contact Object. The attributes of the
 * contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 *
 * @author Siva Sankar
 * @author Raviteja
 */

//  Your code goes here... For Contact class
public final class Contact {
    private String name, email, phoneNumber;
    // constructor

    public Contact(final String name, final String email,
     final String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(final String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String toString() {
        return "{ Name = " + name + ", Email = " + email + ", Phone Number = "
                                          + phoneNumber + " }";
    }
}







