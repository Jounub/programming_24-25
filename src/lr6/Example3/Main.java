package lr6.Example3;

import lr6.ArraysGenerator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 =  random.nextInt(-100, 100),
                num2 = random.nextInt(-100, 100),
                num3 = random.nextInt(-100, 100),
                num4 = random.nextInt(-100, 100),
                num5 = random.nextInt(-100, 100);
        System.out.printf("Числа: %d %d %d %d %d \n", num1, num2, num3, num4, num5);

        System.out.println("Макс значение (аргументы) = "
                + Task3.calculateMaxValue(num1, num2, num3, num4, num5));
        System.out.println("Мин значение (аргументы) = "
                + Task3.calculateMinValue(num1, num2, num3, num4, num5));
        System.out.println("Среднее значение (аргументы) = "
                + Task3.calculateAverage(num1, num2, num3, num4, num5));

        int[] numsArray = ArraysGenerator.generateIntArray();
        System.out.println("Макс значение (массив) = " + Task3.calculateMaxValue(numsArray));
        System.out.println("Мин значение (массив) = " + Task3.calculateMinValue(numsArray));
        System.out.println("Среднее значение (массив) = " + Task3.calculateAverage(numsArray));
    }
}
