package lesson7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список котов:");
        Cat[] x = {new Cat("Барсик", 10), new Cat("Мурзик", 3), new Cat("Пушистик", 20)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("количество еды в тарелке увеличено до 150");
        plate.increaseFood(50);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Коты едят:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
