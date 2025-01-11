package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = random.nextInt(2,10);
        int columns = random.nextInt(1,10);
        System.out.println("Число строк: " + rows + ", число колонок: " + columns);

        int[][] array = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Исходный массив:");
        for(int[] ints : array){
            for(int j = 0; j < columns; j++){
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        int[][] result = new int[array[0].length][array.length];

        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                result[i][j] = array[j][i];
            }
        }

        System.out.println("Итоговый массив:");
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
