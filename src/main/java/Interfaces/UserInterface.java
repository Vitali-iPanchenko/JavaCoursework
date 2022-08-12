package Interfaces;

import Classes.User;
import java.util.Hashtable;

public interface UserInterface {
    User Admin = new User("Admin", "admin@gmail.com", "CoolGuy2021", true);
    Hashtable<String, String> EmailName = new Hashtable<>();
    Hashtable<String, String> EmailPass = new Hashtable<>();
}
