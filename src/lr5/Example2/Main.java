package lr5.Example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Task2 task2 = new Task2();

        System.out.println("Введите 1 символ");
        task2.setCh1(in.nextLine().charAt(0));

        System.out.println("Введите 2 символ");
        task2.setCh2(in.nextLine().charAt(0));

        System.out.println(task2.taskMethod());
    }
}
