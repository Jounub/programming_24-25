package lr6.Example3;

public class Task3 {
    public static int calculateMaxValue(int... numbers){
        int result = Integer.MIN_VALUE;
        for(int number : numbers){
            if(number > result){
                result = number;
            }
        }
        return result;
    }
    public static int calculateMinValue(int... numbers){
        int result = Integer.MAX_VALUE;
        for(int number : numbers){
            if(number < result){
                result = number;
            }
        }
        return result;
    }

    public static double calculateAverage(int... numbers){
        int sum = 0;
        for(int number : numbers) sum += number;
        return sum / (double) numbers.length;
    }
}
