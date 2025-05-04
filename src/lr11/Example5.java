package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк " +
                "и возвращает новый список, содержащий только те строки, " +
                "которые содержат заданную подстроку.\n";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for(String e : strings){
            System.out.println(e);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите подстроку для фильтра");
        String substring = in.nextLine();

        List<String> stringsAfter = filterBySubstring(strings, substring);
        System.out.println("\nСтрока после преобразования: \n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> filterBySubstring(List<String> input, String substring) {
        return input.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
