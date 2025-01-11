package lr4.Example8;

public class Encrypt {
    public static String getEncryptedString(String encryptString, int shift){
        char[] arrayChar = encryptString.toCharArray();

        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for(int i = 0; i < arrayChar.length; i++){
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }

        encryptString = new String(arrayCharNew);
        return  encryptString;
    }

    public static String getDecryptedString(String encryptString, int shift){
        char[] arrayChar = encryptString.toCharArray();

        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];

        for(int i = 0; i < arrayChar.length; i++){
            arrayInt[i] = arrayChar[i] - shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }

        encryptString = new String(arrayCharNew);
        return  encryptString;
    }
}
