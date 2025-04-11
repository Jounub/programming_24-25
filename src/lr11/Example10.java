package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\nСписок до:");

        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для сравнения");
        int num = in.nextInt();

        List<Integer> integerAfter = lesserNumbers(integers, num);

        System.out.println("\nСписок чисел меньше заданного значения:");
        for(Integer i : integerAfter){
            System.out.println(i);
        }
    }

    public static List<Integer> lesserNumbers(List<Integer> list, int i){
        return list.stream().filter(x -> x < i).collect(Collectors.toList());
    }
}
