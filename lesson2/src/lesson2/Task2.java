package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int j = 0;
        int fill = array.length;
        System.out.println("Задание 2:");

        for(int i = 0; i < fill; j += 3) {
            array[i] = j;
            System.out.print(array[i] + " ");
            System.out.println(" ");
            ++i;
        }

    }
}
