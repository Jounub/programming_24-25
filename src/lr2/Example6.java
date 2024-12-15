package lr2;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число");
        int x = in.nextInt();
        String numberToString = String.valueOf(x);

        //Определяем, какая цифра стоит в числе четвертой справа
        int numberLength = numberToString.length();
        if (numberLength < 4){
            System.out.println("Число меньше тысячи");
        } else if (numberLength == 4) {
            char result = numberToString.charAt(0);
            System.out.println("Тысяч во введенном числе: " + result);
        }
        //Если в числе большее 9 тысяч
        else {
            StringBuilder result = new StringBuilder();
            for(int i = 0; i <= (numberLength -4); i++){
                char character = numberToString.charAt(i);
                result.append(character);
            }
            System.out.println("Тысяч во введенном числе: " + result);
        }

        //Определяем количество тысяч в числе делением на 1000
        System.out.println("Тысяч во введенном числе: " + (x / 1000));
    }
}