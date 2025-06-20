package lr8.Task2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter out=null;

        try{
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/lr8/Task2/lr8task2Input.txt"), StandardCharsets.UTF_8));
            out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("src/lr8/Task2/lr8task2Output.txt"), StandardCharsets.UTF_8));

            br.readLine();
            String secondLine = br.readLine();
            if (secondLine != null) {
                out.write(secondLine);
                out.newLine();
            }
            for (int i =0; i<5; i++){
                String numberStr = br.readLine();
                if(numberStr != null){
                    try{
                        double num = Double.parseDouble(numberStr);
                        if(num>0){
                            out.write(String.valueOf(num) + "\n");
                        }
                    } catch (NumberFormatException e){
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
