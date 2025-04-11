package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый список, содержащий только те строки, " +
                "которые имеют длину больше заданного значения.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for(String e : strings){
            System.out.println(e);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите длину строки");
        int num = in.nextInt();

        List<String> stringsAfter = filterStringsLength(strings, num);
        System.out.println("\nСтрока после преобразования: \n");
        for(String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsLength(List<String> list, int i){
        return list.stream()
                .filter(s -> s.length() > i)
                .collect(Collectors.toList());
    }
}
