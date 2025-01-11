package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = random.nextInt(2,10);
        int columns = random.nextInt(2,10);
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

        int[][] result = new int[array.length - 1][array[0].length - 1];
        int delRow = random.nextInt(array.length);
        int delColumn = random.nextInt(array[0].length);
        System.out.println("Удаляем строку " + (delRow + 1) + " и столбец " + (delColumn +1));

        for(int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                if(i >= delRow && j >= delColumn){
                    result[i][j] = array[i+1][j+1];
                }
                else if(i >= delRow){
                    result[i][j] = array[i+1][j];
                } else if (j >= delColumn) {
                    result[i][j] = array[i][j+1];
                }
                else{
                    result[i][j] = array[i][j];
                }
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
