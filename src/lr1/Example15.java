package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        float number1 = in.nextFloat();

        System.out.println("Input 2nd number: ");
        float number2 = in.nextFloat();

        float sum = number1 + number2;
        float difference = number1 - number2;

        System.out.printf("Sum: %.2f \nDifference: %.2f \n", sum, difference);
        in.close();
    }
}
