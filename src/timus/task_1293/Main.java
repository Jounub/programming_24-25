package timus.task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        int result = n*a*b*2;

        output.println(result);
        output.flush();
    }
}
