package lr11;

import lr6.ArraysGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        int[] arr = ArraysGenerator.generateIntArray(size);

        int[] arrResult = filterEvenNumbers(arr);
        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filterEvenNumbers(int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
