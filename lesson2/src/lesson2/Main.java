package lesson2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;

        int i;
        for(i = 0; i < arrll; ++i) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println("Задание 1:");

        for(i = 0; i < arrll; ++i) {
            System.out.println(i + "-" + arr[i]);
        }

    }
}