package lr6.Example8;

import lr6.ArraysGenerator;

public class Main {
    public static void main(String[] args) {
        int[] array = ArraysGenerator.generateIntArray();

        System.out.println("Среднее значение = " + Task8.calculateAverage(array));
    }
}
