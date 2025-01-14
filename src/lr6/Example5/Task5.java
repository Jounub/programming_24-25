package lr6.Example5;

public class Task5 {
    public static int sumOfSquares(int value){
        int result = 0;
        do{
            result += value * value;
            value--;
        }while (value >= 1);
        return result;
    }
}