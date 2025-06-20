package lr6;

import java.util.Arrays;
import java.util.Random;

public class ArraysGenerator {
    static Random random = new Random();

    public static char[] generateCharArray(){
        char[] result = new char[random.nextInt(2, 25)];
        for(int i = 0; i < result.length; i++){
            result[i] = (char)random.nextInt(65, 91);
        }
        System.out.println("Массив char: " + Arrays.toString(result));
        return result;
    }

    public static int[] generateIntArray(){
        int[] result = new int[random.nextInt(2, 25)];
        for(int i = 0; i < result.length; i++){
            result[i] = random.nextInt(-100, 100);
        }
        System.out.println("Массив int: " + Arrays.toString(result));
        return result;
    }
    public static int[] generateIntArray(int size){
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = random.nextInt();
        }
        System.out.println("Массив arr:\n" + Arrays.toString(result));
        return result;
    }
    public static int[] generateIntArray(int size, int minValue, int maxValue){
        int[] result = new int[size];
        for(int i = 0; i < size; i++){
            result[i] = random.nextInt(minValue, maxValue);
        }
        System.out.println("Массив arr:\n" + Arrays.toString(result));
        return result;
    }
}
