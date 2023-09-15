package mirea.lab4;

import java.util.ArrayList;

public class Authorization {
    private ArrayList<User> Users;

    public Authorization() {
        Users = new ArrayList<>();;
    }

    public void createAccount(String name, int password){
        User user = new User();
        Users.add(user);
        user.setName(name);
        user.setPassword(password);
    }

    public boolean login(String name, int password){
        for (int i = 0; i < Users.size(); i++){
            if ( Users.get(i).getName().equals(name)){
                if (Users.get(i).getPassword() == password) {
                    return true;
                }
            }
        }
        return false;
    }
}
