package lr6.Example4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число");
        int number = in.nextInt();
        System.out.println("Двойной факториал = " + Task4.doubleFactorial(number));
    }
}
