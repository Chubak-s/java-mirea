package mirea.lab4;

public class User {
    private String name;
    private int password;

    public void setName(String name){
        this.name = name;
    }

    public void setPassword(int password){
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public int getPassword(){
        return password;
    }
}
