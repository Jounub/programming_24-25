package lr3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        boolean continueInput = true;
        do{
            try{
                System.out.println("Введите количество чисел в последовательности");
                int size = in.nextInt();
                if(size <= 0){
                    throw new InputMismatchException();
                }

                int[] arrayFor = new int[size];
                int[] arrayWhile = new int[size];
                int[] arrayDoWhile = new int[size];

                for(int i = 0; i < arrayFor.length; i++){
                    arrayFor[i] = GenerateNumber(random);
                }

                int a = 0;
                while(a < arrayWhile.length){
                    arrayWhile[a] = GenerateNumber(random);
                    a++;
                }

                int b = 0;
                do {
                    arrayDoWhile[b] = GenerateNumber(random);
                    b++;
                } while (b < arrayDoWhile.length);

                System.out.println("Цикл for: " + Arrays.toString(arrayFor));
                System.out.println("Сумма: " + Arrays.stream(arrayFor).sum());

                System.out.println("Цикл while: " + Arrays.toString(arrayWhile));
                System.out.println("Сумма: " + Arrays.stream(arrayWhile).sum());

                System.out.println("Цикл while: " + Arrays.toString(arrayDoWhile));
                System.out.println("Сумма: " + Arrays.stream(arrayDoWhile).sum());

                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Ввод только целых чисел больше 0");
                in.nextLine();
            }
        } while (continueInput);
    }

    private static int GenerateNumber(Random random) {
        boolean iterator = true;
        int x = 0;
        while (iterator){
            x = random.nextInt(100);
            if(x % 5 == 2 || x % 3 == 1){
                iterator = false;
            }
        }
        return x;
    }
}
