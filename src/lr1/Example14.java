package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        float number = in.nextFloat();
        float decreasedNumber = number - 1;
        float increasedNumber = number + 1;
        float sum = number + decreasedNumber + increasedNumber;

        System.out.printf("Output: %.2f %.2f %.2f %.2f\n", decreasedNumber, number, increasedNumber, Math.pow(sum, 2));
        in.close();
    }
}
