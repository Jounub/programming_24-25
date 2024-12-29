package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели с большой буквы");
        String x = in.nextLine();

        if (x.equals("Понедельник")){
            System.out.println("Номер дня недели: 1");
        } else if (x.equals("Вторник")) {
            System.out.println("Номер дня недели: 2");
        } else if (x.equals("Среда")) {
            System.out.println("Номер дня недели: 3");
        } else if (x.equals("Четверг")) {
            System.out.println("Номер дня недели: 4");
        } else if (x.equals("Пятница")) {
            System.out.println("Номер дня недели: 5");
        } else if (x.equals("Суббота")) {
            System.out.println("Номер дня недели: 6");
        } else if (x.equals("Воскресенье")) {
            System.out.println("Номер дня недели: 7");
        } else {
            System.out.println("Такого дня недели нет");
        }

        switch (x){
            case ("Понедельник"):
                System.out.println("Номер дня недели: 1");
                break;
            case("Вторник"):
                System.out.println("Номер дня недели: 2");
                break;
            case("Среда"):
                System.out.println("Номер дня недели: 3");
                break;
            case("Четверг"):
                System.out.println("Номер дня недели: 4");
                break;
            case("Пятница"):
                System.out.println("Номер дня недели: 5");
                break;
            case("Суббота"):
                System.out.println("Номер дня недели: 6");
                break;
            case("Воскресенье"):
                System.out.println("Номер дня недели: 7");
                break;
            default:
                System.out.println("Такого дня недели нет");
                break;
        }
    }
}
