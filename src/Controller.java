import java.io.*;
import java.util.*;

public class Controller {
    private Dorm manager;
    private Scanner scanner;
    private Testing testing;

    public Controller(){
        manager = new Dorm();
        scanner = new Scanner(System.in);
        testing = new Testing();
    }

    public static void main(String [] args) throws Exception{
        Controller controller = new Controller();
        controller.start();


    }

    public void start() throws Exception{

        Resident res;
          openfile();
          String list = manager.getResidentList();
         System.out.println(list);
          accessProgram();
        res = manager.getResident("Ikenna");
        System.out.println(res.getName() + " "+ res.getRoom()+" "+ res.getPassword() + "\n");
        manager.delete("Nnamdi");
       String table = manager.getResidentList();
        System.out.println(table);
    }

    public void openfile(){
        String filename;
        System.out.println("File to open;      Type 'x' to cancel: ");
        filename = scanner.next();
        if(filename.equals("x")){ System.out.println("Program Terminated");
        System.exit(0);
        }
       try{
           manager.openFile(filename);

       } catch(FileNotFoundException e){
           System.out.println("No such file");
           System.exit(0);
       }
       catch(IOException e) {
           System.out.println("Error in reading file");
       }

       }

       public void accessProgram(){
        String Name, Room, Password;
        System.out.println("Name : ");
        Name = scanner.next();
        System.out.println("Room : ");
        Room = scanner.next();
        System.out.println("Password : ");
        Password = scanner.next();
        Resident resident = manager.getResident(Name);

           if (resident == null) {
               System.out.println("Invalid Entry");
           } else if(resident.getName().equals(Name) && resident.getRoom().equals(Room )
                && resident.getPassword().equals(Password)){
            System.out.println("Door Opens...........");
        }else{System.out.println("Invalid entry");}





       }


    }


