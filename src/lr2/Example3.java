package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int modulo5 = x % 5;
        int modulo7 = x % 7;

        System.out.printf("Остаток при делении на 5 - %d, остаток при делении на 7 - %d \n", modulo5, modulo7);

        if(modulo5 == 2 && modulo7 ==1){
            System.out.println("Число удовлетворяет критериям");
        }
        else{
            System.out.println("Число не удовлетворяет критериям");
        }
    }
}