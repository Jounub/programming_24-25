package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        int modulo4 = x % 4;

        if(modulo4 == 0 && x >= 10){
            System.out.println("Число удовлетворяет критериям");
        }
        else{
            System.out.println("Число не удовлетворяет критериям");
        }
    }
}