package lr8.Task1.Example9;

import java.io.*;

public class Buf_WR_IO_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/lr8/Task1/Example9/MyFile1.txt"), "cp1251"));
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("src/lr8/Task1/Example9/MyFile2.txt"), "cp1251"));
            int lineCount = 0;
            String s;
            while((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Ошибка");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
