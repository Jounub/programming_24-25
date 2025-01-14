package lr6.Example8;

public class Task8 {
    public static double calculateAverage(int[] value){
        int sum = 0;
        for(int number : value) sum += number;
        return sum / (double) value.length;
    }
}
