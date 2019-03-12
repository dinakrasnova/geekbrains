package lesson21;

public class Wall {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }
}
