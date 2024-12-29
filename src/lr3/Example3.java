package lr3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean continueInput = true;

        do {
            try {
                System.out.println("Введите количество чисел в последовательности");
                int x = in.nextInt();
                if(x < 0){
                    throw new InputMismatchException();
                }

                int[] fibonacciFor = new int[x];
                fibonacciFor[0] = 1;
                int[] fibonacciWhile = Arrays.copyOf(fibonacciFor, fibonacciFor.length);
                int[] fibonacciDoWhile = Arrays.copyOf(fibonacciFor, fibonacciFor.length);

                for (int i = 0; i < x; i++) {
                    if (i == 1) {
                        fibonacciFor[i] = fibonacciFor[0];
                    }
                    if (i > 1) {
                        fibonacciFor[i] = fibonacciFor[i - 1] + fibonacciFor[i - 2];
                    }
                }

                int a = 0;
                while (a < x) {
                    if (a == 1) {
                        fibonacciWhile[a] = fibonacciWhile[0];
                    }
                    if (a > 1) {
                        fibonacciWhile[a] = fibonacciWhile[a - 1] + fibonacciWhile[a - 2];
                    }
                    a++;
                }

                int b = 0;
                do {
                    if (b == 1) {
                        fibonacciDoWhile[b] = fibonacciDoWhile[0];
                    }
                    if (b > 1) {
                        fibonacciDoWhile[b] = fibonacciDoWhile[b - 1] + fibonacciDoWhile[b - 2];
                    }
                    b++;
                } while (b < x);

                System.out.println("Цикл for: " + Arrays.toString(fibonacciFor));
                System.out.println("Цикл while: " + Arrays.toString(fibonacciWhile));
                System.out.println("Цикл do-while: " + Arrays.toString(fibonacciDoWhile));

                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Ввод только целых чисел больше 0");
                in.nextLine();
            }
        } while (continueInput);
    }
}
