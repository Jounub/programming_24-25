package timus.task_1209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        for(long i = 0; i < n; i++){
            long x = in.nextLong() - 1;

            long y = (long) Math.sqrt(x * 8 + 1);
            if(y * y == x * 8 + 1){
                System.out.println("1 ");
            }
            else {
                System.out.println("0 ");
            }
        }
    }
}
