import java.util.*;

public class User {
    private String name;
    public int count;
    public User[] connections;      


public User(final String name1) {
    this.name = name1;
    this.size = 0;
    this.connections = new User[10];
}

public void setName(final String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public String toString() {
    getstring(users);
}
}
