package lr6.Example6;

import lr6.ArraysGenerator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = ArraysGenerator.generateIntArray();

        System.out.println("Введите целое число больше нуля");

        boolean continueInput = true;
        do {
            try {
                int number = in.nextInt();
                if (number <= 0) throw new InputMismatchException();

                int[] copiedArray = Task6.copyArray(array, number);
                System.out.println("Копия массива: " + Arrays.toString(copiedArray));

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Введено некорректное значение");
                in.nextLine();
            }
        } while (continueInput);
    }
}
