import java.util.Scanner;

public class Testing {

    public  void test () throws Exception {
        Dorm manager = new Dorm();
        Resident resident;
        Scanner scanner = new Scanner(System.in);
        String filename;

        resident = new Resident("Ekene", "017", "Eken342s");
        manager.add(resident);
        resident = new Resident("Aquaman", "014", "Chiby32r");
        manager.add(resident);
        resident = new Resident("Ikenna", "028", "Ikrisky30");
        manager.add(resident);
        resident = new Resident("emeka", "008", "hjhjhkkkk");
        manager.add(resident);
        System.out.println("Save to which file: ");
        filename = scanner.next();
        manager.saveFile(filename);
        //manager.delete("nanuu");
       // System.exit(0);
        //manager.openFile("Shadow");
    }
}