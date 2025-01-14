package lr6.Example4;

public class Task4 {
    public static int doubleFactorial(int value){
        int result = 1;
        boolean continueCalculation = true;
        do{
            result *= value;
            value -= 2;
            if(value < 2) continueCalculation = false;
        } while (continueCalculation);
        return result;
    }
}
