package lesson21;

public class Water {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    public boolean doIt(Animal animal) {
        if (animal instanceof Swimable)
            return ((Swimable) animal).swim(length);
        else
            return false;
    }
}
