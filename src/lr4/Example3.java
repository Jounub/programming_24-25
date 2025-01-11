package lr4;

import java.util.Random;

public class Example3 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = random.nextInt(1,10);
        int columns = random.nextInt(1,10);
        System.out.println("Число строк: " + rows + ", число колонок: " + columns);

        int[][] array = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = 2;
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
