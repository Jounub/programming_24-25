package lr6.Example9;

public class Task9 {
    public static char[] reverseArray(char[] value){
        char[] result = new char[value.length];
        int middleIndex = value.length / 2;
        for(int i = 0; i < middleIndex; i++){
            result[i] = value[value.length - 1 - i];
            result[value.length - 1 - i] = value[i];
        }
        if(value.length % 2 != 0){
            result[middleIndex] = value[middleIndex];
        }
        return result;
    }
}
