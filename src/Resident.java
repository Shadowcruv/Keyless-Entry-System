import java.io.*;

public class Resident implements Serializable{

    private String Name;
    private String Room;
    private String Password;

    public Resident(){
       Name = "unassigned";
       Room = "000";
       Password = "ERTY12as";

    }
    public Resident(String nam,String rom, String paswd)throws IllegalArgumentException{
        int lengthpwd = paswd.length();
        if(lengthpwd <8){
            throw  new IllegalArgumentException(" password less than 8 digits");
        }
        Name = nam; Room = rom; Password = paswd;
    }

    public void setName(String nam){
        Name = nam;
    }
    public void setRoom(String rom){
        Room = rom;
    }
    public void setPassword(String paswd){
        int lengthpwd = paswd.length();
        if(lengthpwd <8){
            throw  new IllegalArgumentException(" password less than 8 digits");
        }
        Password = paswd;
    }

    public String getName(){
        return Name;
    }
    public String getRoom(){
        return Room;
    }
    public String getPassword(){
        return Password;
    }
}
