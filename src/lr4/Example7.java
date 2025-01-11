package lr4;

import java.util.Random;

public class Example7 {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = random.nextInt(2, 10);
        int columns = random.nextInt(2, 10);
        System.out.println("Число строк: " + rows + ", число колонок: " + columns);

        int[][] array = new int[rows][columns];
        int x = 0;

        for (int i = 0; i < rows; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = x;
                    x++;
                }
            }
            else{
                for (int j = array[0].length - 1; j >= 0; j--) {
                        array[i][j] = x;
                        x++;
                    }
                }
            }

        System.out.println("Массив:");
        for(int[] ints : array){
            for(int j = 0; j < columns; j++){
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
