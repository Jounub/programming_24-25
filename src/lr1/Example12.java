package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        int year = Year.now().getValue();

        while(age < 0 || age > 100){
            System.out.println("Please, input correct age: ");
            age = in.nextInt();
        }

        System.out.printf("You were born in %d \n", (year - age));
        in.close();
    }
}
