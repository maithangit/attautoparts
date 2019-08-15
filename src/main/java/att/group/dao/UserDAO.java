package att.group.dao;

import att.group.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDAO {

    Map<String, User> usersDB;

    {
        usersDB = new HashMap<>();
        //Define users
        usersDB = new HashMap<>();
        usersDB.put("Tam", new User(1, "Tam", "123456", "Vinh Tam Tan", "vtan@mum.edu", "2000 N. Court St., Fairfield, Iowa", "(641) 233 - 9000"));
        usersDB.put("Thang", new User(2, "Thang","123456", "Mai Thang", "mthang@mum.edu", "301 Main St., Fairfield, Iowa", "(641) 656 - 8008"));
        usersDB.put("Ali", new User(3, "Alican Ozer","123456", "", "aozer@mum.edu", "301 Main St., Fairfield, Iowa", "(641) 644 - 8008"));

    }

    public boolean checkExistUser(String username, String password){
        if(usersDB.containsKey(username) && usersDB.get(username).getPassword().equals(password)){
            return true;
        }
        return false;
    }

    public boolean checkExitsByUsername (String username){
        if(usersDB.containsKey(username))
            return true;
        return false;
    }

    public boolean addUser (String username, String password, String fullname, String email, String address, String phone){
        if (checkExitsByUsername(username))
            return false;
        else
        {
            usersDB.put(username, new User(usersDB.size()+1, username, password, fullname, email, address, phone));
            return true;
        }
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(usersDB.values());
    }
    public User getUserByUsername(String username){
        return usersDB.get(username);
    }

    public Map<String, User> getUsersDB(){
        return this.usersDB;
    }
}
