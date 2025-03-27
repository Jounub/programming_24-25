package lr9.Task3;

import java.util.Scanner;

public class Recursion {
    // Рекурсивный ввод массива
    public static void writeArray(int[] arr, int index, Scanner scanner) {
        if (index < arr.length) {
            System.out.print("Введите элемент " + index + ": ");
            arr[index] = scanner.nextInt();
            writeArray(arr, index + 1, scanner);
        }
    }

    // Рекурсивный вывод массива
    public static void printArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            printArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        writeArray(array, 0, scanner);

        System.out.print("Вывод массива: ");
        printArray(array, 0);
        System.out.println();

        scanner.close();
    }
}
