package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число");
        int x = in.nextInt();

        if(x >=5 && x <= 10){
            System.out.println("Число входит в диапазон от 5 до 10");
        }
        else{
            System.out.println("Число не входит в диапазон от 5 до 10");
        }
    }
}