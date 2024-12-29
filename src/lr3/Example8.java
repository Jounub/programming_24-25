package lr3;

import java.util.Arrays;

public class Example8 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        char letter = 'A';

        int i = 0;
        while(i < letters.length){
            if(letter != 'A' && letter != 'E' && letter != 'O' && letter != 'U' && letter != 'I'){
                letters[i] = letter;
                i++;
            }
            letter++;
        }

        System.out.println("Массив: " + Arrays.toString(letters));
    }
}
