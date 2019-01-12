package lesson2;

public class Task3 {
    public static void main(String[] args) {
        int[] array3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arr3 = array3.length;

        int i;
        for(i = 0; i < arr3; ++i) {
            if (array3[i] < 6) {
                array3[i] *= 2;
            }
        }

        System.out.print("Задание 3:  ");

        for(i = 0; i < arr3; ++i) {
            System.out.print(array3[i] + ", ");
        }

    }
}
