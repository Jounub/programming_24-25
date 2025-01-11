package lr4;

import java.util.Random;

public class Example4 {
    public static void main(String[] args) {
        Random random = new Random();
        int figure = random.nextInt(2,10);
        System.out.println("Размер фигуры: " + figure);

        char[][] array = new char[figure][figure];

        for(int i = 0; i < figure; i++){
            for(int j = 0; j < figure; j++){
                if(j <= i){
                    array[i][j] = '+';
                }
                else {
                    array[i][j] = ' ';
                }
            }
        }

        for(int i = 0; i < figure; i++){
            for(int j = 0; j < figure; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
