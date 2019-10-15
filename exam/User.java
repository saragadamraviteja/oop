import java.util.*;

public class User {
    String name;
    int count = 0;
    User[] connections;
    
public User(String name, User[] connections) {
    this.name = name;
    this.connections = new User[10];
}      


public User(String name) {
    this.name = name;
    this.connections = new User[50];
}

public void setName(String name) {
    this.name = name;
}

public String getUserName() {
    return this.name;
}

public String toString() {
    if (this.count != 0) {
        String s = "[" ;
        for (int i = 0; i < count - 1; i++) {
            s += this.connections[i].name + ", ";    
        }
        
        s += this.connections[count - 1].name + "]";
        return this.name + " : " + s;
    }
    return this.name + " : ";
}
}

