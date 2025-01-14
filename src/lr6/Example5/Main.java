package lr6.Example5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите натуральное число");

        boolean continueInput = true;
        do{
            try{
                int number = in.nextInt();
                if(number <= 0) throw new InputMismatchException();

                System.out.println("Сумма квадратов = " + Task5.sumOfSquares(number));

                int resultCheck = number * (number + 1) * (2 * number + 1) / 6;
                System.out.println("Проверка результата = " + resultCheck);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Введено некорректное значение");
                in.nextLine();
            }
        } while (continueInput);
    }
}
