package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input your year of birth: ");
        int yearOfBirth = in.nextInt();

        int year = Year.now().getValue();
        while(yearOfBirth > year || yearOfBirth < 1900){
            System.out.println("Please, input correct year of birth: ");
            yearOfBirth = in.nextInt();
        }

        System.out.printf("%s, %d years old \n", name, (year - yearOfBirth));
        in.close();
    }
}
