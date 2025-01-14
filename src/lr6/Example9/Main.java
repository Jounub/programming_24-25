package lr6.Example9;

import lr6.ArraysGenerator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] array = ArraysGenerator.generateCharArray();

        char[] newArray = Task9.reverseArray(array);
        System.out.println("Массив после перестановки: " + Arrays.toString(newArray));
    }
}
