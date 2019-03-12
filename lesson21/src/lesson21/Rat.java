package lesson21;

public class Rat extends Animal implements Swimable {
    private int swim_limit;

    public Rat(String name) {
        this.name = name;
        this.run_limit = 50;
        swim_limit = 10;
        swim_limit = 200;
    }

    @Override
    public String voice() {
        return "пик-пик";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }
}