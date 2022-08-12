package Classes;

import java.util.UUID;

public class User {
    public String name;
    public String email;
    public String pass;
    public boolean isAdmin;
    public UUID id;

    public User (String name, String email, String pass, boolean isAdmin){
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.isAdmin = isAdmin;
        this.id = UUID.randomUUID();
        }
}
