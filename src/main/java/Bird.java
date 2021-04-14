
public class Bird {

    private String name;
    private String latinName;
    private int observedCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observedCount = 0;
    }

    public void observe() {
        this.observedCount++;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        if (observedCount == 1) {
            return name + " (" + latinName + "): " + observedCount + " observation";
        } else {
            return name + " (" + latinName + "): " + observedCount + " observations";
        }

    }
}
