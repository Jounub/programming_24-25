package lr8.Task1.Example6;

import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;

        try{
            in = new FileReader("src/lr8/Task1/Example6/MyFile1.txt");
            out = new FileWriter("src/lr8/Task1/Example6/MyFile2.txt", true);

            int oneByte;
            while((oneByte = in.read()) != -1){
                //out.write((char)oneByte);
                out.append((char) oneByte);
                System.out.println((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");;
        } finally {
            in.close();
            out.close();
        }
    }
}
