/**
 *
 */

// import Contact;
/**
 *This class maintains the contacts of
 *your friends / relations / wellwishers et.
 *The following are the opertaions that
 this ContactManager application can
 *perform.
 *
 *You can create a contact of your choice.
 *Creates a contact and keep this in the ContactManager list.
 * You can search for a contact by name
 *Search for a contact based on the name in the ContactManager list.
 *You can search for a contact by email.
 *Search for a contact based on email in the ContactManager list.
 *You can delete a contact by name.
 *Search for a contact based on name of the contact and delete from the
 *ContactManager list.
 *
 *@author Siva Sankar
 */

class ContactsManager extends Contact {
    /**
     *
     */
    private Contact[] myFriends;
    /**
     *
     */
    private int friendsCount;
    /**
     *
     */
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    /*
     * Define a variable myFriends which is an array that can hold
     * the contacts of your friends.
     */

    /*
     * Define a variable friendsCount of type int maintain the number of
     * contacts of your friends.
     */


    /*
     * When the object of ContactManager is created, the constructor should
     * constrcut the object initialy with the following requirements
     * 1. Initializes the friendsCount to 0 as there no contacts in the list.
     * 2. myFriends with array initial size of 500
     */
    /**
     * The addContact method takes in a parameter of type contact object and
     * adds this to the contact list.
     * @param contact to be added.
     */
    public void addContact(final Contact contact) {
        //  Your code goes here....
        myFriends[friendsCount] = contact;
        friendsCount++;
        //  Nothing to be returned... As this method is void...
    }
    /**
     * This method search
     * for thecontact
     * based on the name of your
     * friend and gives the
     * first occurance of the contact in your friends list.
     * @param searchName the name of the
     * contact to be searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContact(final String searchName) {
        //  Your code goes here....
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i] != null) {
                if (myFriends[i].getName().equals(searchName)) {
                    return myFriends[i];
                }
            }
        }

    return null;
    }

    /**
     * This method search for the contact based
     * on the email of your friend
     * and gives the first occurance of the contact
     * in your friends list.
     * @param email the email of the contact to be
     * searched in the friends list.
     * @return the contact of the friend, null otherwise.
     */
    public Contact searchContactByEmail(final String email) {
        //  Your code goes here....
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i] != null) {
                if (myFriends[i].getEmail().equals(email)) {
                    return myFriends[i];
                }
            }
        }
        return null;
    }
    /**
     * This method deletes the contactbased
     * on the name of your friend and returns
     * true on success and false if failure
     * in deleting the contact.
     * @param searchName the name of the
     * contact to be searched in the friends list.
     * @return true if contact has been
     * removed successfully and false otherwise.
     */
    public boolean deleteContact(final String searchName) {
        //  Your code goes here....
        for (int i = 0; i < friendsCount; i++) {
           if (myFriends[i] != null) {
                if (myFriends[i].getName().equals(searchName)) {
                    myFriends[i] = null;
                    return true;
                }
            }
            }

        return false;
    }


    // Any additional method that you want to implement by yourself.

    //  Happy Coding... Have Fun.....
    public void printm() {
        for (int i = 0; i < friendsCount; i++) {
            System.out.println(myFriends[i]);
        }
    }

    public void setRelations(String user,String relation) {
        for (int i = 0; i < friendsCount; i++) {
            if(myFriends[i].getName().equals(user)){
                for (int j = 0; j < friendsCount; j++) {
                      if(myFriends[j].getName().equals(relation)) {
                          myFriends[i].relations[size++]=myFriends[j];
                      }
                }
            }
        }
    }
    
    public int getRelations(String user){

         for (int i = 0; i < friendsCount; i++){
             if(myFriends[i].getName().equals(user)) {
                   for(int j =0;j<myFriends[i].relations.length;i++) {
                        System.out.println(myFriends[i].relations[j]);
                }
             }
         }
        return 0;      
    }
}
 public static void main(String[] args) {
     setRelations(manoj,aditya)
     setRelations(manoj,pathri)
 }
 manoj - adiya,pathri