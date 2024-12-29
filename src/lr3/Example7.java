package lr3;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        int size = 10;

        char[] chars = new char[size];
        char[] reverseChar = new char[size];
        chars[0] = 97;

        for(int i = 1; i < chars.length; i++){
            chars[i] = (char)(chars[i-1] + 2);
        }

        for(int i = 0; i < chars.length; i++){
            reverseChar[i] = chars[chars.length - 1 - i];
        }

        System.out.println("В прямом порядке: " + Arrays.toString(chars));
        System.out.println("В обратном порядке: " + Arrays.toString(reverseChar));
    }
}
