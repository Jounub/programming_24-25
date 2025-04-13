package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        String string = "9.Напишите функцию, 1которая 2принимает 3на 4вход список строк " +
                "5и 6возвращает 7новый список, содержащий только )те _строки, " +
                "*которые содержат: !только буквы (без 123цифр %и символов).";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСтрока после сплитования: \n");
        for(String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterSymbolsAndNumbers(strings);
        System.out.println("\nСтрока после преобразования: \n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterSymbolsAndNumbers(List<String> list){
        return list.stream()
                .filter(s -> s.matches("\\p{L}+"))
                .collect(Collectors.toList());
    }
}
