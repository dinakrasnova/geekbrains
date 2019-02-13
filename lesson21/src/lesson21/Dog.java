package lesson21;

public class Dog extends Animal implements Jumpable {
    private float jump_limit;

    public Dog(String name) {
        this.name = name;
        this.run_limit = 100;
        jump_limit = 10f;
    }

    @Override
    public String voice() {
        return "гав-гав";
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
}