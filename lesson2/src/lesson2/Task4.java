package lesson2;

public class Task4 {
    public static void main(String[] args) {
        int[][] sqArr = new int[6][6];
        System.out.println("Задание 4:");

        for(int i = 0; i < 6; ++i) {
            for(int j = 0; j < 6; ++j) {
                if (i < j) {
                    sqArr[i][j] = 0;
                } else if (i > j) {
                    sqArr[i][j] = 1;
                } else {
                    sqArr[i][j] = 1;
                }

                System.out.print(sqArr[i][j] + " ");
            }

            System.out.println();
        }

    }
}
