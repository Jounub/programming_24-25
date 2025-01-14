package lr6.Example10;

public class Task10 {
    public static int[] findMinMax(int... numbers){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }
        for(int number : numbers){
            if(number < min){
                min = number;
            }
        }
        return new int[]{min, max};
    }
}
