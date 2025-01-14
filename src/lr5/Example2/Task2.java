package lr5.Example2;

import java.util.Arrays;

public class Task2 {
    private char ch1;
    private char ch2;

    public void setCh1(char value) {
        this.ch1 = value;
    }

    public void setCh2(char value) {
        this.ch2 = value;
    }

    public String taskMethod(){
        char[] charArray = new char[Math.abs(ch1 - ch2) + 1];
        char x = 0;
        if(ch1 > ch2){
            x = ch2;
        }
        if(ch2 > ch1){
            x = ch1;
        }
        for (int i = 0; i < charArray.length; i++){
            charArray[i] = x;
            x++;
        }
        return Arrays.toString(charArray);
    }
}
