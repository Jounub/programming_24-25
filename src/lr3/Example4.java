package lr3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean continueInput = true;
        do{
            try{
                System.out.println("Введите 2 целых числа");

                int x = in.nextInt();
                int y = in.nextInt();
                int arrayLength;

                int[] arrayFor;

                if(x > y){
                    arrayLength = x - y + 1;
                    arrayFor = new int[arrayLength];
                    arrayFor[0] = y;
                }
                else if (x < y){
                    arrayLength = y - x + 1;
                    arrayFor = new int[arrayLength];
                    arrayFor[0] = x;
                }
                else throw new InputMismatchException();

                int[] arrayWhile = Arrays.copyOf(arrayFor, arrayFor.length);
                int[] arrayDoWhile = Arrays.copyOf(arrayFor, arrayFor.length);

                for(int i = 1; i < arrayFor.length; i++){
                    arrayFor[i] = arrayFor[i-1] + 1;
                }

                int a = 1;
                while (a < arrayWhile.length){
                    arrayWhile[a] = arrayWhile[a-1] + 1;
                    a++;
                }

                int b = 1;
                do{
                    arrayDoWhile[b] = arrayDoWhile[b-1] + 1;
                    b++;
                } while (b < arrayDoWhile.length);

                System.out.println("Цикл for: " + Arrays.toString(arrayFor));
                System.out.println("Цикл while: " + Arrays.toString(arrayWhile));
                System.out.println("Цикл do-while: " + Arrays.toString(arrayDoWhile));

                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Введите 2 разных целых числа");
                in.nextLine();
            }
        } while (continueInput);
    }
}
