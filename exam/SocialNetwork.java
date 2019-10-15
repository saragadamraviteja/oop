/**
 * This class implements all the methods of the SocialNetworkInterface 
 * You are free to add your own behaviours to this class.
 * 
 * @author Siva Sankar
 * @author S.Raviteja
 */

import java.util.Arrays;

public class SocialNetwork extends User {

    /**
     * users indicates the actual users in the network
     */
    User[] users;

    /**
     * The size indicates the numebr of users in the network
     */
    int size;

    /**
     * Initializes the default values of the social network.
     */
    public SocialNetwork() {
        // TODO
        // Your code goes here
        size = 0;
        users = new User[100];
    }

    /**
     * This method takes the string as a parameter which is used
     * to create a network. do nothing if the string is empty.
     * 
     * @param str to be used to create a network.
     */
    public void createDataStructure(String str) {
        // TODO
        // Your code goes here
        if (str.equals("")) {
            return;
        } 
        str = str.replace(" is connected to ", ",");
        String[] s1 = str.split(";");
        for (int i = 0; i < s1.length; i++) {
            String[] s = s1[i].split(",");
            for (int j = 0; j < s.length; j++) {
                addUser(new User(s[j]));
            }
        }
        for (int i = 0; i < s1.length; i++) {
            String[] s = s1[i].split(",");
            for (int j = 1; j < s.length; j++) {
                addConnection(getUser(s[0]), getUser(s[j]));
            }
        }

    }

    private boolean searchUser(User user) {
        for (int i = 0; i < size; i++) {
            if (user.equals(users[i])) {
                return true;
            }
        }
        return false;
    }



    /**
     * Please don't modify the follwoing code.
     * This method returns the User based on the userName.
     * 
     * @param userName the string to be used to search for the user.
     * @return the User object based on the userName. 
     * Returns null otherwise
     */
    public User getUser(String userName) {
        for (int i = 0; i < size; i++) {
            if (userName.equals(users[i].getUserName())) {
                return users[i];
            }
        }
        return null;
    }

    /**
     * This method adds a new User (object) that is passed as 
     * argument to the social network if the user is not currently 
     * on the social network.
     * @param userA to be added to the social network.
     */
    public void addUser(User userA) {
        // TODO
        // Your code goes here
        for (int i = 0; i < size; i++) {
            if(users[i].name.equals(userA.name)){
                return;
            }
        }
                users[size ++] = userA;
            }

    /**
     * This method takes two users (objects) as arguments and 
     * connects them on the network. userA and userB are 
     * the users that are passed as parameters to this function, 
     * then add userB to userA’s connections
     * 
     * Note: Both userA and userB should be there on the network.
     * if anyone of them are not on the network, then do nothing.
     * 
     * @param userA the userB is to be added to userA connections
     * @param userB to be added to userA connections
     */
    public void addConnection(User userA, User userB) {
        // TODO
        // Your code goes here
        if (userB == null || userA == null || userA.connections == null) {
            return;
        }
        int count = 0;
        for (int i = 0; i < size; i++){
            if (users[i].name.equals(userA.name)) {
                count++;
                break;
            }
        }
        for (int i = 0; i < size; i++){
            if (users[i].name.equals(userB.name)) {
                count++;
                break;
            }
        }
        if (count != 2) {
            return;
        } else {
        userA.connections[userA.count++] = userB;
        }
    }

    /**
     * This method takes a user object as an argument that returns the 
     * connections of this user. Return null if the user is not in 
     * the network.
     * 
     * @param userA the user object used to return the 
     * connections of this user.
     * 
     * @return the list of connections of userA. otherwise return null
     */
    public User[] getConnections(User userA) {
        // TODO
        // Your code goes here
        int found = 0;
        for (int i = 0; i < size; i++) {
            if (users[i].name.equals(userA.name)) {
                found = 1;
                break;
            }
        }
        if (found == 0) {
            return null;
        } else {
        if (userA.count > 0) return userA.connections;
        return null;
        }
    }
    /**
     * This method returns the common connections of userA and userB.
     * Note: both userA and userB should be on the network. if anyone 
     * of them is not in the network, then return null
     * 
     * @param userA the first user
     * @param userB the second user
     * 
     * @return the common connections of both userA and userB if they 
     * both are in the network, otherwise return null
     */
    public User[] getCommonConnections(User userA, User userB) {
        // TODO
        // Your code goes here
        if (userB == null || userA == null || userA.connections == null || userB.connections == null) {
            return null;
        }
        int count = 0;
        for (int i = 0; i < size; i++){
            if (users[i].name.equals(userA.name)) {
                count++;
                break;
            }
        }
        for (int i = 0; i < size; i++){
            if (users[i].name.equals(userB.name)) {
                count++;
                break;
            }
        }
        if (count != 2) {
            return null;
        } else {
            User[] now = new User[10];
            int nowSize = 0;
            for (int i = 0; i < userA.count; i++) {
                for (int j = 0; j < userB.count; j++) {
                    if (userA.connections[i].name.equals(userB.connections[j].name)) {
                        now[nowSize++] = userA.connections[i];
                        break;
                    }
                }
            }
            now = Arrays.copyOf(now,nowSize);
            if (now.length > 0) return now;
            return null;
        }
    }
    /**
     * This reutrns the String version of the social network.
     * 
     * @return the String version of the network, return an empty string
     * if there are no users in the network.
     */
    public String toString() {
        if (this.size == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for (i = 0; i < size-1; i++) {
            sb.append(users[i] + "\n");
        }
        sb.append(users[i]);
        return sb.toString();
    }
    public static void main(String[] args) {
        String test = "A is connected to B,C,D";
        SocialNetwork sn = new SocialNetwork();
        sn.createDataStructure(test);
        sn.addUser(new User("V",null));
        sn.addConnection(null, sn.getUser("V"));
        for (int i = 0; i < sn.size; i++) {
            System.out.println(sn.users[i].toString());
        }
        
    }
}


