package lr6.Example10;

import lr6.ArraysGenerator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = ArraysGenerator.generateIntArray();

        int[] minMaxArray = Task10.findMinMax(array);
        System.out.println("MinMax массив: " + Arrays.toString(minMaxArray));
    }
}
