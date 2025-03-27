package lr9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursion {
    public static void toBinary(int n) {
        if(n < 0){
            System.out.print("-");
            n = Math.abs(n);
        }
        if (n > 1) {
            toBinary(n / 2);
        }
        System.out.print(n % 2);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Ввод целого числа: ");
                int n = in.nextInt();
                System.out.print("Двоичное представление: ");
                toBinary(n);
                System.out.println();

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Ввод только целых чисел");
                in.nextLine();
            }
        }while (continueInput);
    }
}
