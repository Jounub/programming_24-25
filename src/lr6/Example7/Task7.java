package lr6.Example7;

public class Task7 {
    public static int[] charToIntTransfer(char[] value){
        int[] newArray = new int[value.length];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = value[i];
        }
        return newArray;
    }
}
