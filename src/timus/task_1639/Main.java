package timus.task_1639;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();

        int result = (n * m) % 2;

        out.println((result != 0)? "[second]=:]" : "[:=[first]");
        out.flush();
    }
}
