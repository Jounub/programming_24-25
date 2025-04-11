package lr8.Task1.Example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    public static void readAllByArray(InputStream in) throws IOException{
        byte[] buff = new byte[5];
        while(true){
            int count = in.read(buff);
            if(count != -1){
                System.out.println("Количество = " + count + ", buff = "
                + Arrays.toString(buff) + ", str = "
                + new String(buff, 0, count, "cp1251"));
            } else{
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        String fileName = "/home/ome123/opt/MyFile.txt";
        InputStream inFile = null;

        try{
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e){
            System.out.printf("Ошибка открытия-закрытия файла " + fileName + e);
        } finally {
            if(inFile != null){
                try {
                    inFile.close();
                } catch (IOException ignore){
                    /*NOP*/
                }
            }
        }
    }
}
