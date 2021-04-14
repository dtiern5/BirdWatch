
import java.util.ArrayList;

public class BirdRegister {

    ArrayList<Bird> register;

    public BirdRegister() {
        this.register = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        register.add(bird);
    }

    public void printAllBirds() {
        for (Bird bird : register) {
            System.out.println(bird.toString());
        }
    }
    
    public void printSingleBird(String birdName) {
        for (Bird bird : register) {
            if (bird.getName().equals(birdName)) {
                System.out.println(bird.toString());
            }
        }
    }
    
    public void getBirdNames() {
        for (Bird bird : register) {
            bird.getName();
        }
    }
    
    public void addObservation(String birdName) {
        for (Bird bird : register) {
            if (bird.getName().equals(birdName)) {
                bird.observe();
            }
        }
    }
}
