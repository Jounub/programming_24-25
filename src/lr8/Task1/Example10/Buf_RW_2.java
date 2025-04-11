package lr8.Task1.Example10;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("/home/ome123/My/MyFile1.txt"), "cp1251"));
            //out = new PrintWriter("/home/ome123/My/MyFile2.txt", "cp1251");
            out = new PrintWriter(System.out);
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
