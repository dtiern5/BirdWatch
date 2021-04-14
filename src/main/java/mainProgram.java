
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BirdRegister register = new BirdRegister();
        UserInterface UI = new UserInterface(register, scan);
        UI.start();

        
    }
}
        

    