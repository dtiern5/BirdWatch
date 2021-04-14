
import java.util.Scanner;

public class UserInterface {

    private BirdRegister register;
    private Scanner scanner;

    public UserInterface(BirdRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Commands:");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            executeCommand(command);
            
        }
    }
    
    public void executeCommand(String command) {
        if (command.equals("Add")) {
            add();
        } else if (command.equals("Observation")) {
            observation();
        } else if (command.equals("All")) {
            all();
        } else if (command.equals("One")) {
            one();
        } else {
            System.out.println("Unrecognized command");           
        }
    }
    
    public void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scanner.nextLine();
        Bird bird = new Bird(name, latinName);
        register.addBird(bird);
    }
    
    public void observation() {
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        register.addObservation(name);
    }
    
    public void all() {
        register.printAllBirds();
    }
    
    public void one() {
        System.out.print("Bird? ");
        String name = scanner.nextLine();
        register.printSingleBird(name);
    }
}
