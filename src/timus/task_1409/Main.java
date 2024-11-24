package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintWriter output = new PrintWriter(System.out);

        int garryHit = input.nextInt();
        int larryHit =  input.nextInt();

        int totalCans = garryHit + larryHit - 1;

        int garryMiss = totalCans - garryHit;
        int larryMiss = totalCans - larryHit;
        String result = garryMiss + " " + larryMiss;

        output.println(result);
        output.flush();
    }
}
