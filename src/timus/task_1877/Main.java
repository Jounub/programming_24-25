package timus.task_1877;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int code1 = input.nextInt();
        int code2 = input.nextInt();

        if(code1 % 2 == 0 || code2 % 2 != 0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}