/**
 * This class implements all the methods of the SocialNetworkInterface 
 * You are free to add your own behaviours to this class.
 * 
 * @author Siva Sankar
 * @author S.Raviteja
 */

import java.util.Arrays;

public class SocialNetwork {

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
        users = new User[50];
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
        String[] tokens = str.split(";");
        String[] tokens1;
        String[] all;
 
        for (int i = 0;i < tokens.length;i++) {
            tokens1[i] = tokens[i].split("is connected to");   
        }
        for (int i = 0;i < tokens1.length;i++) {
            for(int j = 0;j < tokens1[i].length;j++) {
                all[i] =  tokens1[i][[0]].split(",") + tokens1[i][[1]].split(",");
           
         }
        }
        for (int i = 0;i < all.length;i++) {
            for (int j = 0;j < all.length; j++) {
            if (all[i].equals(all[j])) {

            }
            else {
                users[i] = all[i];
            }
        }
    }
        // return;
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
        for (int i = 0;i < users.length;i++) {
            if(users[i].equals(userA)){
            } else {
                users[size ++] = UserA;
            }
        }
        return;
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
            for (int i = 0; i < size; i++) {
                if(users[i].getName().equals(userA)){
                    for (int j = 0; j < size; j++) {
                          if(users[j].getName().equals(userB)) {
                              users[i].connections[size++] = users[j];
                          }
                    }
                }
            }
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
        for (int i = 0; i < size; i++){
            if(users[i].getName().equals(userA)) {
                  for(int j = 0;j < users[i].connections.length;i++) {
                       System.out.println(users[i].connections[j]);
                    }
                }
            }
        return null;
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
        String[] us = getConnections(userA);
        String[] us1 = getConnections(userB);
        String[] common;
        for (int i = 0; i < us.length;i++) {
            for (int j = 0; j < us1.length;j++){
            if(us[i].equals(us[j])) {
                common[i] = us[i];
            }
        }
    }
        return common;
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
}
