package lr6.Example7;

import lr6.ArraysGenerator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] charArray = ArraysGenerator.generateCharArray();

        int[] intArray = Task7.charToIntTransfer(charArray);
        System.out.println("Массив int: " + Arrays.toString(intArray));
    }
}
