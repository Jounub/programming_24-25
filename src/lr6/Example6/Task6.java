package lr6.Example6;

import java.util.Arrays;

public class Task6 {
    public static int[] copyArray(int[] array, int n){
        int[] newArray;
        if(n >= array.length){
            newArray = Arrays.copyOf(array, array.length);
        }
        else{
            newArray = Arrays.copyOf(array, n);
        }
        return newArray;
    }
}