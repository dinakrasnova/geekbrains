package lesson21;

public class Main {

    public static void main(String[] args) {
        Animal[] home = {new Cat("Барсик"), new Dog("Шарик"), new Rat("Кусто")};
        Track track = new Track(80);
        Wall wall = new Wall(3);
        Water water = new Water(10);

        for (Animal animal : home) {
            System.out.println(animal + " say: " + animal.voice());
            System.out.println(" run: " + track.doIt(animal));
            System.out.println(" jump: " + wall.doIt(animal));
            System.out.println(" swim: " + water.doIt(animal));
        }
    }
}
