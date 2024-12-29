package lr3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean continueInput = true;
        do{
            try{
                System.out.println("Введите размер массива");

                int size = in.nextInt();
                if(size <= 0){
                    throw new InputMismatchException();
                }

                int[] ints = new int[size];
                ints[0] = 2;
                for(int i = 1; i < ints.length; i++){
                    ints[i] = ints[i-1] + 5;
                }

                System.out.println(Arrays.toString(ints));

                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Введено некорректное значение");
                in.nextLine();
            }
        } while (continueInput);
    }
}
