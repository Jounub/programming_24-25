package lr11;

import java.util.*;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\nСписок до:");

        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для деления");
        int num = in.nextInt();

        List<Integer> integerAfter = divisionWithoutModulo(integers, num);

        System.out.println("\nСписок после:");
        for(Integer i : integerAfter){
            System.out.println(i);
        }
    }

    public static List<Integer> divisionWithoutModulo(List<Integer> list, int i){
        return list.stream().filter(x -> x % i == 0).collect(Collectors.toList());
    }
}
