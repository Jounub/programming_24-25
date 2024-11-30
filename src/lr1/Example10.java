package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your year of birth: ");
        int yearOfBirth = in.nextInt();

        int year = Year.now().getValue();
        while(yearOfBirth > year || yearOfBirth < 1924){
            System.out.println("Please, input correct year of birth: ");
            yearOfBirth = in.nextInt();
        }

        System.out.printf("You are %d years old \n", (year - yearOfBirth));
        in.close();
    }
}
